package framework.web.api.sites.wiki.pages.startPage.startPageTalkTab;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import framework.logger.MyLogger;
import framework.web.api.drivers.Driver;
import framework.web.api.sites.wiki.pages.basePage.BasePage;
import framework.web.api.sites.wiki.pages.utils.Durations;
import framework.web.api.sites.wiki.pages.utils.Page;
import framework.web.api.sites.wiki.pages.utils.Routes;
import io.qameta.allure.Step;

import java.time.Duration;
import java.util.NoSuchElementException;

public class StartPageTalkTab extends BasePage implements Page {

    public StartPageTalkTabUiObjects uiObjects = new StartPageTalkTabUiObjects();

    @Step
    @Override
    public StartPageTalkTab waitToLoad() {
        try {
            Driver.site.logger.log.info(MyLogger.waitToLoad("title"));
            uiObjects.getTitle().should(Condition.visible, Durations.standardWait);
        } catch (NoSuchElementException e) {
            throw new AssertionError(MyLogger.failedToLoad(MyLogger.waitToLoad("title")));
        }
        return Driver.site.wiki.startPageTalkTab;
    }

    @Step
    @Override
    public StartPageTalkTab open() {
        try {
            Driver.site.logger.log.info(MyLogger.open(System.getProperty("baseUri") + Routes.startPage));
            Selenide.open(System.getProperty("baseUri") + Routes.startPageTalkTab);
        } catch (org.openqa.selenium.NoSuchElementException e) {
            throw new AssertionError(MyLogger.cantOpen(System.getProperty("baseUri") + Routes.startPage));
        }

        return Driver.site.wiki.startPageTalkTab;
    }

}
