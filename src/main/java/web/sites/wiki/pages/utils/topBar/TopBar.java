package web.sites.wiki.pages.utils.topBar;

import com.codeborne.selenide.Condition;
import common.logger.MyLogger;
import web.drivers.Driver;
import web.sites.wiki.pages.startPage.startPageMainTab.StartPage;
import web.sites.wiki.pages.startPage.startPageTalkTab.StartPageTalkTab;
import web.sites.wiki.pages.utils.Durations;
import web.sites.wiki.pages.utils.Util;
import io.qameta.allure.Step;

import java.util.NoSuchElementException;

public class TopBar implements Util {
        public TopBarUiObjects uiObjects = new TopBarUiObjects();

    @Step
    public StartPageTalkTab clickTalkTab() {
        try {
            Driver.site.logger.log.info(MyLogger.click("TalkTab"));
            uiObjects.getTalkTab().click();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            throw new AssertionError(MyLogger.failedToClick("TalkTab"));
        }
        return Driver.site.wiki.startPageTalkTab;
    }

    @Step
    public StartPage clickMainTab() {
        try {
            Driver.site.logger.log.info(MyLogger.click("MainTab"));
            uiObjects.getMainTab().click();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            throw new AssertionError(MyLogger.failedToClick("MainTab"));
        }
        return Driver.site.wiki.startPage;
    }

    @Step
    @Override
    public Object waitToLoad() {
        try {
            Driver.site.logger.log.info(MyLogger.waitToLoad("logo"));
            Driver.site.wiki.uiObjects.getLogo().should(Condition.visible, Durations.standardWait);
        } catch (NoSuchElementException e) {
            throw new AssertionError(MyLogger.failedToLoad(MyLogger.waitToLoad("logo")));
        }
        return Driver.site.wiki.startPageTalkTab;
    }
}
