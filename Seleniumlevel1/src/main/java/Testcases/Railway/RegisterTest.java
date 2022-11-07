package Testcases.Railway;

import Common.Common.Utilities;
import Common.Constant.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.RegisterPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Pre-condition");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SATTDN22.03.01\\INTELIJ\\chrome\\chromedriver.exe");
//      System.setProperty("webdriver.chrome.driver","D:\\tester\\ij\\driver\\chromedriver.exe");
        Constant.WEBDRIVER = new ChromeDriver();
        Constant.WEBDRIVER.manage().window().maximize();
        //test branch
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Post-condition");
        //Constant.WEBDRIVER.quit();
    }
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    Utilities utilities = new Utilities();
    @Test
    public void TC03(){
        System.out.println("TC-03 - User can register with valid username");
        homePage.open();
        homePage.gotoRegisterPage();
        registerPage.register(Constant.REGISTERUSERNAME, Constant.PASSWORD, Constant.CONFIRMPASSWORD, Constant.PASSPORTNUMBER);

//        String actualMsg = registerPage.getMsgRegisterSuccessfull();
//        String expectedMsg = "Registration Confirmed! You can now log in to the site.";
//
//        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message  is not displayed");
    }
}
