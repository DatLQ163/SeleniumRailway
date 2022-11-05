package PageObjects.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookTicketPage {
    // Locators
    private final By selDepartDate = By.xpath("//select[@name ='Date']");
    private final By selDepartFrom = By.xpath("//select[@name ='DepartStation']");
    private final By selArriveAt = By.xpath("//select[@name ='ArriveStation']");
    private final By selSeatType = By.xpath("//select[@name ='SeatType']");
    private final By selTicketAmount = By.xpath("//select[@name ='TicketAmount']");
    private final By btnBookTicket = By.xpath("//input[@type='submit']");
    // Elements
    private WebElement getSelDepartDate(){

        return Constant.WEBDRIVER.findElement(selDepartDate);
    }
    private WebElement getSelDepartFrom(){

        return Constant.WEBDRIVER.findElement(selDepartFrom);
    }
    private WebElement getSelArriveAt(){

        return Constant.WEBDRIVER.findElement(selArriveAt);
    }
    private WebElement getSelSeatType(){
        return Constant.WEBDRIVER.findElement(selSeatType);
    }
    private WebElement getSelTicketAmount(){
        return Constant.WEBDRIVER.findElement(selTicketAmount);
    }
    private WebElement getBtnBookTicket(){
        return Constant.WEBDRIVER.findElement(btnBookTicket);
    }

    // Methods
}

