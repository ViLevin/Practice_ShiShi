package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ru_pages.*;
import utils.enums.HeaderMenuItemsRu;

import java.time.Duration;

public class BasePage {
       static WebDriver driver;
       public static void setDriver(WebDriver wd){
           driver = wd;
       }

    public static void pause(int time){
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
}
public static <T extends BasePage> T clickRuHeaderBtn(HeaderMenuItemsRu item){
    WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.elementToBeClickable(By.xpath(item.getLocator())));
    element.click();
    switch (item){
        case CONTACTS -> {
            return (T) new RuContactsPage(driver);
        }
        case ABOUT_US -> {
            return (T) new RuAboutUsPage(driver);
        }
        case EVENTS -> {
            return (T) new RuEventsPage(driver);
        }
        case PHOTO -> {
            return (T) new RuPhotoPage(driver);
        }
        case VIDEO -> {
            return (T) new RuVideoPage(driver);
        }
        default -> throw new IllegalArgumentException("Invalid parametr RuHeaderMenuItem");
    }
}
}


