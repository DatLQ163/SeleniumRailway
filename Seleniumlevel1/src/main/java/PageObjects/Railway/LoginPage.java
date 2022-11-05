package PageObjects.Railway;

import Common.Common.Utilities;
import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LoginPage extends GeneralPage{
    // Locators
    private final By txtUsername = By.xpath("//input[@id='username']");
    private final By txtPassword = By.xpath("//input[@id='password']");
    private final By btnLogin = By.xpath("//input[@type='submit']");
    private final By lblErrormessage = By.xpath("//label[@class='validation-error']");

    // Elements
    private WebElement getTxtUsername(){

        return Constant.WEBDRIVER.findElement(txtUsername);
    }
    private WebElement getTxtPassword(){

        return Constant.WEBDRIVER.findElement(txtPassword);
    }
    private WebElement getBtnLogin(){

        return Constant.WEBDRIVER.findElement(btnLogin);
    }
    private WebElement getLblErrormessage(){
        return Constant.WEBDRIVER.findElement(lblErrormessage);
    }

    // Methods
    public HomePage login(String username, String password){
        this.getTxtUsername().sendKeys(username);
        this.getTxtPassword().sendKeys(password);
        this.getBtnLogin().click();
        return new HomePage();
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Pre-condition");
        System.setProperty("Webdriver.chrome.driver", Utilities.getProjectPath()+"\\Executables\\chromedriver.exe");
        Constant.WEBDRIVER = new ChromeDriver();
        Constant.WEBDRIVER.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Post-condition");
        Constant.WEBDRIVER.quit();
    }
}
