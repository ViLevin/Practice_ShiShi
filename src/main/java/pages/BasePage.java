package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.en_pages.*;
import pages.ru_pages.*;
import utils.enums.HeaderMenuItemsEn;
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
    WebElement element = new WebDriverWait(driver, Duration.ofSeconds(15))
            .until(ExpectedConditions.elementToBeClickable(By.xpath(item.getLocator())));
    element.click();
    switch (item){
        case EVENTS -> {
            return (T) new RuEventsPage(driver);
        }
        case PHOTO -> {
            return (T) new RuPhotoPage(driver);
        }
        case VIDEO -> {
            return (T) new RuVideoPage(driver);
        }
        case ABOUT_US -> {
            return (T) new RuAboutUsPage(driver);
        }
        case CONTACTS -> {
            return (T) new RuContactsPage(driver);
        }
        case DONATE -> {
            return (T) new RuDonatePage(driver);
        }
        case CHANGE_LANG_TO_ENG -> {
            return (T) new EnHomePage(driver);
        }
        default -> throw new IllegalArgumentException("Invalid parameter RuHeaderMenuItem");
    }
}
    public static <T extends BasePage> T clickEnHeaderBtn(HeaderMenuItemsEn item) {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(item.getLocator())));
        element.click();
        switch (item) {
            case ABOUT_US -> {
                return (T) new EnAboutUsPage(driver);
            }
            case ACTIVITY_UPDATES -> {
                return (T) new EnActivPage(driver);
            }
            case TEAM -> {
                return (T) new EnTeamPage(driver);
            }
            case OUR_PARTNERS -> {
                return (T) new EnPartnersPage(driver);
            }
            case PHOTO -> {
                return (T) new EnPhotoPage(driver);
            }
            case VIDEO -> {
                return (T) new EnVideoPage(driver);
            }
            case CONTACTS -> {
            return (T) new EnContactsPage(driver);
            }
            case DONATE -> {
                return (T) new EnDonatePage(driver);
            }
            case CHANGE_LANG -> {
                return (T) new HomePage(driver);
            }

        default -> throw new IllegalArgumentException("Invalid parameter EnHeaderMenuItem");
        }

}

    }



