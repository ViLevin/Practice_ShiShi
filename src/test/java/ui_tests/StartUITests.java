package ui_tests;

import manager.AppManager;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.en_pages.EnChangeLangPage;
import pages.en_pages.EnContactsPage;
import pages.en_pages.EnHomePage;
import pages.ru_pages.RuEventsPage;
import utils.TestNGListener;
import utils.enums.HeaderMenuItemsEn;
import utils.enums.HeaderMenuItemsRu;

import static pages.BasePage.*;
@Listeners(TestNGListener.class)

public class StartUITests extends AppManager {

    @Test
    public void startTest(){
        HomePage homePage = new HomePage(getDriver());
        pause(10);
        RuEventsPage ruEventsPage = clickRuHeaderBtn(HeaderMenuItemsRu.EVENTS);
    }

    @Test
    public void startTestLang(){
        HomePage homePage = new HomePage(getDriver());
        pause(5);
        EnHomePage enHomePage = clickRuHeaderBtn(HeaderMenuItemsRu.CHANGE_LANG_TO_ENG);
    }

    @Test
    public void startTest1(){
        HomePage homePage = new HomePage(getDriver());
        pause(5);
        EnHomePage enHomePage = clickRuHeaderBtn(HeaderMenuItemsRu.CHANGE_LANG_TO_ENG);
        EnContactsPage enContactsPage = clickEnHeaderBtn(HeaderMenuItemsEn.CONTACTS);
    }

}
