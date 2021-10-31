package tests.uiTestExamples.startPage;

import com.codeborne.selenide.Condition;
import tests.uiTestExamples.BaseUiTest;
import web.drivers.Driver;
import web.sites.wiki.Wiki;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

public class StartPageUiTest extends BaseUiTest {
    /** Tests of WIKI start page*/

    public static Wiki wiki = Driver.site.wiki;

    /** Test case can be here*/
    @Epic(value = "UI")
    @Feature(value = "Base")
    @Story(value = "Start")
    @Test
    public void startPageTest() {
        SoftAssertions softAssert = new SoftAssertions();

        Driver.site.logger.log.info("Start test 1");
        Driver.site.logger.log.info("Opening TalkTab");

        wiki
                .open()
                .waitToLoad()
                .useTopBar()
                .clickTalkTab()
                .waitToLoad();

        Driver.site.logger.log.info("Checking that talkTab is selected, mainTab - not");

        softAssert.assertThat(wiki.topBar.uiObjects.getMainTab().shouldHave(Condition.attribute("class"))
                .getAttribute("class"))
                .doesNotContain("selected");

        softAssert.assertThat(wiki.topBar.uiObjects.getTalkTab().shouldHave(Condition.attribute("class"))
                .getAttribute("class"))
                .contains("selected");

        softAssert.assertAll();

        Driver.site.logger.log.info("Finish test 1");
    }
}
