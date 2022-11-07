package Common.Common;

import Common.Constant.Constant;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import javax.xml.bind.Element;

public class Utilities {
    public static Utilities getProjectPath(){
        return new Utilities();
    }
    public static void scrollToFindElement(WebElement element){
        Actions actions = new Actions(Constant.WEBDRIVER);
        actions.moveToElement(element);
        actions.perform();
    }
}
