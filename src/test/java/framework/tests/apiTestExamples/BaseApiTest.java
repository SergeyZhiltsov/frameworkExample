package framework.tests.apiTestExamples;

import com.github.javafaker.Faker;
import framework.tests.BaseWikiTest;
import framework.web.api.sites.wiki.restApi.controllers.ApiController;
import framework.web.api.sites.wiki.restApi.pojos.UserPayload;
import framework.web.api.sites.wiki.restApi.pojos.bookingDataPayload.BookingDataPayload;
import framework.web.api.sites.wiki.restApi.pojos.bookingDataPayload.BookingDatePayload;

import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class BaseApiTest extends BaseWikiTest {
    /** Main api controller implementation, randomized pojo objects*/

    public Faker faker = new Faker();
    public ApiController controller = new ApiController();

    public BookingDataPayload newBookingDataPayload() {
        return new BookingDataPayload()
                .firstname(faker.name().firstName())
                .lastname(faker.name().lastName())
                .totalPrice(faker.number().numberBetween(1, 10))
                .depositPaid(faker.bool().bool())
                .additionalNeeds(faker.lorem().characters())
                .bookingDatePayload(newBookingDatePayload());

    }

    public BookingDatePayload newBookingDatePayload() {
        return new BookingDatePayload()
                .chekIn(new SimpleDateFormat("yyyy-MM-dd").format(faker.date().past(10, TimeUnit.DAYS)))
                .chekOut(new SimpleDateFormat("yyyy-MM-dd").format(faker.date().future(10, TimeUnit.DAYS)));

    }

    public UserPayload newUserPayload() {
        return new UserPayload()
                .username("admin")
                .password("password123");
    }
}

