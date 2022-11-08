package Common.Common;

import Common.Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Utilities {
    private static final By link = By.xpath("//a[.='Web hosting by Somee.com']");

    private static WebElement getLink(){
        return Constant.WEBDRIVER.findElement(link);
    }

    public static Utilities getProjectPath(){
        return new Utilities();
    }
    public static void scrollToFindElement(){
        Actions actions = new Actions(Constant.WEBDRIVER);
        actions.moveToElement(getLink());
        actions.perform();
    }
}
