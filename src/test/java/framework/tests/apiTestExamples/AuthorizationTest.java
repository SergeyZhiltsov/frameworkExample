package framework.tests.apiTestExamples;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class AuthorizationTest extends BaseApiTest {
    /** Tests of auth api actions
     *
     * Test case can be here*/
    @Epic(value = "API")
    @Feature(value = "Smoke")
    @Story(value = "Auth")
    @Test
    public void authorizationTest() {
        assertNotNull(controller
                .testController
                .authorization(newUserPayload())
                .token);
    }
}
