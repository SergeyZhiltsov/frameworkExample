package tests.uiTestExamples;

import tests.BaseWikiTest;
import common.core.managers.DriverManager;
import io.qameta.allure.Step;
import org.testng.annotations.BeforeMethod;

public class BaseUiTest extends BaseWikiTest {

    @Step
    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        DriverManager.createDriver();
    }
}
