package PageObjects.Railway;

import Common.Common.Utilities;
import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends GeneralPage{
    // Locators
    private final By txtEmail = By.xpath("//input[@id='email']");
    private final By txtPassword = By.xpath("//input[@id='password']");
    private final By txtConfirmPassword = By.xpath("//input[@id='confirmPassword']");
    private final By txtPassport = By.xpath("//input[@id='pid']");
    private final By lblErrormessage = By.xpath("//label[@class='validation-error']");
    private final By btnRegister = By.xpath("//input[@type='submit']");
    private final By link = By.xpath("//a[.='Web hosting by Somee.com']");


    // Elements
    private WebElement getTxtEmail(){

        return Constant.WEBDRIVER.findElement(txtEmail);
    }
    private WebElement getTxtPassword(){

        return Constant.WEBDRIVER.findElement(txtPassword);
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

    private WebElement getBtnRegister(){
        return Constant.WEBDRIVER.findElement(btnRegister);
    }
    private WebElement getLink(){
        return Constant.WEBDRIVER.findElement(link);
    }

    //Methods
    public void register(String email,String password,String confirmpassword ,String passport){
        Utilities.scrollToFindElement(getLink());
        this.getTxtEmail().sendKeys(email);
        this.getTxtPassword().sendKeys(password);
        this.getTxtConfirmPassword().sendKeys(confirmpassword);
        this.getTxtPassport().sendKeys(passport);
        this.getBtnRegister().click();
    }
}
