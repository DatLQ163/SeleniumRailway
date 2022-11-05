package PageObjects.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {
    WebDriver driver = new ChromeDriver();
    // Locators
    private final By txtEmail = By.xpath("//input[@id='email']");
    private final By txtPassword = By.xpath("//input[@id='password']");
    private final By txtConfirmPassword = By.xpath("//input[@id='confirmPassword']");
    private final By txtPassport = By.xpath("//input[@id='pid']");
    private final By lblErrormessage = By.xpath("//label[@class='validation-error']");

    // Elements
    private WebElement getTxtEmail(){

        return Constant.WEBDRIVER.findElement(txtEmail);
    }
    private WebElement getTxtPassword(){

        return Constant.WEBDRIVER.findElement(txtPassport);
    }
    private WebElement getTxtConfirmPassword(){

        return Constant.WEBDRIVER.findElement(txtConfirmPassword);
    }
    private WebElement getTxtPassport(){

        return Constant.WEBDRIVER.findElement(txtPassport);
    }
    private WebElement getLblErrormessage(){

        return Constant.WEBDRIVER.findElement(lblErrormessage);
    }

    //Methods
    public void register(String email,String password,String confirmpassword ,String passport){

    }
}
