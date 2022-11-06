package Testcases.Railway;

import Common.Common.Utilities;
import Common.Constant.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
//    public  void beforMethod(){
//
//    }
//    public void afterMethod(){
//
//    }
    @Test
    public void TC01(){
//        System.setProperty("webdriver.chrome.driver","D:\\tester\\ij\\driver\\chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://railwayb1.somee.com/Account/Login.cshtml");
        System.out.println("TC-01 - User can login with valid username and password");
        HomePage homePage = new HomePage();
        homePage.open();
//
//        LoginPage loginPage = homePage.gotoLoginPage();
//
//        String actualMsg = loginPage.login(Constant.USERNAME, Constant.PASSWORD).getWelcomeMessage();
//        String expectedMsg = "Welcome" + Constant.USERNAME;
//
//        Assert.assertEquals(actualMsg, expectedMsg, "Welcome mesage is not displayed as expected");
    }

}
