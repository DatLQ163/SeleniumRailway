package PageObjects.Railway;

import Common.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GeneralPage {
    // Locators
    private final By tabLogin = By.xpath("//div[@id='menu']//a[@href ='/Account/Login.cshtml']");
    private final By tabLogout = By.xpath("//div[@id='menu']//a[@href ='/Account/Logout']");
    private final By tabRegister = By.xpath("//div[@id='menu']//a[@href ='/Account/Register.cshtml']");
    private final By tabBookTicket = By.xpath("//div[@id='menu']//a[@href ='/Page/BookTicketPage.cshtml']");
    private final By tabMyTicket = By.xpath("//div[@id='menu']//a[@href ='/Page/ManageTicket.cshtml']");
    private final By lblWelcomeMessage = By.xpath("//div[@class ='account']//strong");
    private final By msgRegisterSuccessfull = By.xpath("//p[.='Registration Confirmed! You can now log in to the site.']");
    //Elements
    protected WebElement getTabLogin(){
        return Constant.WEBDRIVER.findElement(tabLogin);
    }

    protected WebElement getTabLogout(){
        return Constant.WEBDRIVER.findElement(tabLogout);
    }
    protected WebElement getLblWelcomeMessage(){
        return Constant.WEBDRIVER.findElement(lblWelcomeMessage);
    }
    protected WebElement getTabRegister(){
        return Constant.WEBDRIVER.findElement(tabRegister);
    }
    protected WebElement getTabBookTicket(){ return Constant.WEBDRIVER.findElement(tabBookTicket);}
    protected WebElement getTabMyTicket(){ return Constant.WEBDRIVER.findElement(tabMyTicket);}


    //Methods
    public String getWelcomeMessage(){
        return this.getLblWelcomeMessage().getText();
    }

    public void gotoLoginPage(){
        this.getTabLogin().click();

    }
    public void gotoRegisterPage(){
        this.getTabRegister().click();
    }
    public void gotoBookTicketPage(){
        this.getTabBookTicket().click();
    }
    public void gotoMyTicketPage(){
        this.getTabMyTicket().click();
    }
}