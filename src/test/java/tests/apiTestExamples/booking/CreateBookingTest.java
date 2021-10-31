package tests.apiTestExamples.booking;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import tests.apiTestExamples.BaseApiTest;

import static org.testng.Assert.assertTrue;

public class CreateBookingTest extends BaseApiTest {
    /** Tests of create booking api actions
     *
     * Test case can be here*/
    @Epic(value = "API")
    @Feature(value = "Smoke")
    @Story(value = "Booking")
    @Test
    public void createBookingTest () {
        assertTrue(controller
                .testController
                .createBooking(newBookingDataPayload())
                .bookingId!=0);
    }
}
