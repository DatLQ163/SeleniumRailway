package Testcases.Railway;

import Common.Constant.Constant;
import PageObjects.Railway.HomePage;
import PageObjects.Railway.LoginPage;
import PageObjects.Railway.MyTicketPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTicketTest {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Pre-condition");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SATTDN22.03.01\\INTELIJ\\chrome\\chromedriver.exe");
        Constant.WEBDRIVER = new ChromeDriver();
        Constant.WEBDRIVER.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Post-condition");
        //Constant.WEBDRIVER.quit();
    }
    HomePage homePage = new HomePage();
    MyTicketPage myTicketPage = new MyTicketPage();
    LoginPage loginPage = new LoginPage();
    @Test
    public void TC05(){
        System.out.println("TC-05 - User can filter ticket successfully");
        homePage.open();
        homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        homePage.gotoMyTicketPage();
        myTicketPage.filter("");

//        String actualMsg = bookTicketPage.getMsgBook();
//        String expectedMsg = "Ticket Booked Successfully!";
//
//        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message  is not displayed");
    }
}

