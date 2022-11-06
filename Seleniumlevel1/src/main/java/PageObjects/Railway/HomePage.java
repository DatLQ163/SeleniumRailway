package PageObjects.Railway;

import Common.Constant.Constant;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends GeneralPage{
    public HomePage open(){
        Constant.WEBDRIVER.navigate().to(Constant.RAILWAY_URL);
        return this;
    }
}
