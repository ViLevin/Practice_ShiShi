package pages.ru_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.BasePage;

public class RuDonatePage extends BasePage {

    public RuDonatePage(WebDriver driver){
        setDriver(driver);
        driver.get("https://shishi.co.il/");
        PageFactory.initElements(
                new AjaxElementLocatorFactory(driver, 20), this);
    }

}
