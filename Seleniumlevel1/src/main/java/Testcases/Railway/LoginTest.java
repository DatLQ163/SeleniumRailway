package Testcases.Railway;

import Common.Common.Utilities;
import Common.Constant.Constant;
import PageObjects.Railway.GeneralPage;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import PageObjects.Railway.RegisterPage;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Pre-condition");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SATTDN22.03.01\\INTELIJ\\chrome\\chromedriver.exe");
//      System.setProperty("webdriver.chrome.driver","D:\\tester\\ij\\driver\\chromedriver.exe");
        Constant.WEBDRIVER = new ChromeDriver();
        Constant.WEBDRIVER.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Post-condition");
        //Constant.WEBDRIVER.quit();
    }
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    @Test
    public void TC01(){
        System.out.println("TC-01 - User can login with valid username and password");
        homePage.open();
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);

        String actualMsg = loginPage.getWelcomeMessage();
        String expectedMsg = "Welcome " + Constant.USERNAME;

        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message  is not displayed");
    }
    @Test
    public void TC02(){
        System.out.println("TC-01 - User can not login with invalid username");
        homePage.open();
        homePage.gotoLoginPage();
        loginPage.login(Constant.INVALIDUSERNAME, Constant.PASSWORD);

        String actualMsg = loginPage.getWelcomeMessage();
        String expectedMsg = "Welcome guest!";

        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message  is not displayed");
    }
    @Test
    public  void TC03(){
        System.out.println("TC-03 - User can register with valid username");
        homePage.open();
        homePage.gotoRegisterPage();
        registerPage.register(Constant.REGISTERUSERNAME, Constant.PASSWORD, Constant.CONFIRMPASSWORD, Constant.PASSPORTNUMBER);

        String actualMsg = loginPage.getWelcomeMessage();
        String expectedMsg = "Welcome guest!";

        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message  is not displayed");
    }
}
