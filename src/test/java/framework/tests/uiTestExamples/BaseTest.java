package framework.tests.uiTestExamples;

import framework.web.core.managers.DriverManager;
import io.qameta.allure.Step;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @Step
    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        DriverManager.createDriver();
    }
}
