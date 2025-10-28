package pages.ru_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.BasePage;

public class RuVideoPage extends BasePage {
    public RuVideoPage(WebDriver driver){
        setDriver(driver);
        driver.get("https://shishi.co.il/");
        PageFactory.initElements(
                new AjaxElementLocatorFactory(driver, 20), this);
    }

    @FindBy(xpath = "//a[@href='https://www.jgive.com/new/en/usd/donation-targets/64189']")
    WebElement btnDonateHeader;
}
