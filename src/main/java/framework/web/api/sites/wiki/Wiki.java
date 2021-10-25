package framework.web.api.sites.wiki;

import com.codeborne.selenide.Selenide;
import framework.logger.MyLogger;
import framework.web.api.drivers.Driver;
import framework.web.api.sites.Site;
import framework.web.api.sites.wiki.pages.startPage.startPageMainTab.StartPage;
import framework.web.api.sites.wiki.pages.startPage.startPageTalkTab.StartPageTalkTab;
import framework.web.api.sites.wiki.pages.utils.Routes;
import framework.web.api.sites.wiki.pages.utils.topBar.TopBar;
import io.qameta.allure.Step;
import org.openqa.selenium.NoSuchElementException;

public class Wiki implements Site {
    /** Main UI class with created objects for each page*/
    public StartPage startPage = new StartPage();
    public StartPageTalkTab startPageTalkTab = new StartPageTalkTab();
    public TopBar topBar = new TopBar();

    public WikiUiObjects uiObjects = new WikiUiObjects();

    @Step
    @Override
    public StartPage open() {
        try {
            Driver.site.logger.log.info(MyLogger.open(System.getProperty("baseUri") + Routes.startPage));
            Selenide.open(System.getProperty("baseUri") + Routes.startPage);
        } catch (NoSuchElementException e) {
            throw new AssertionError(MyLogger.cantOpen(StartPage.class));
        }

        return Driver.site.wiki.startPage;
    }
}
