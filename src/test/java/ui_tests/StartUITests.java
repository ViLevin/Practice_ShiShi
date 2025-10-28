package ui_tests;

import manager.AppManager;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.ru_pages.RuEventsPage;
import utils.enums.HeaderMenuItemsRu;

import static pages.BasePage.*;


public class StartUITests extends AppManager {

    @Test
    public void startTest(){
        HomePage homePage = new HomePage(getDriver());
        pause(5);
        RuEventsPage ruEventsPage = clickRuHeaderBtn(HeaderMenuItemsRu.EVENTS);
    }

}
