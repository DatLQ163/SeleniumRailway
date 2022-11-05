package PageObjects.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyTicketPage {
    // Locators
    private final By btnDeleteCancel = By.xpath("//input[@value='Delete' or @value = 'Cancel']");
    private final By selFilterStatus = By.xpath("//select[@name = 'FilterStatus']");
    private final By lblRow = By.xpath("//table[@class = 'MyTable']//following::tr[@class!='TableSmallHeader']");

    // Elements
    private WebElement getBtnDeleteCancel(){

        return Constant.WEBDRIVER.findElement(btnDeleteCancel);
    }
    private WebElement getSelFilterStatus(){

        return Constant.WEBDRIVER.findElement(selFilterStatus);
    }
    private WebElement getLblRow(){

        return Constant.WEBDRIVER.findElement(lblRow);
    }

    // Methods
}
