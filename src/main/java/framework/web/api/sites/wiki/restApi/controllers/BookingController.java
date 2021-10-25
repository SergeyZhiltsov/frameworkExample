package framework.web.api.sites.wiki.restApi.controllers;


import framework.web.api.sites.wiki.restApi.pojos.UserPayload;
import framework.web.api.sites.wiki.restApi.pojos.bookingDataPayload.BookingDataPayload;
import framework.web.api.sites.wiki.restApi.pojos.response.AuthorizationResponse;
import framework.web.api.sites.wiki.restApi.pojos.response.CreateBookingResponse;
import framework.web.api.sites.wiki.restApi.services.AuthorizationTestService;
import framework.web.api.sites.wiki.restApi.services.BookingService;
import io.qameta.allure.Step;

import static framework.web.api.sites.wiki.restApi.conditions.Conditions.statusCode;

public class BookingController {
    /** Calls of actions of desired services*/
    private final BookingService testService = new BookingService();
    private final AuthorizationTestService authorizationTestService = new AuthorizationTestService();

    @Step
    public AuthorizationResponse authorization (UserPayload userPayload) {
        return authorizationTestService
                .authorization(userPayload)
                .shouldHave(statusCode(200))
                .asPojo(AuthorizationResponse.class);

    }

    @Step
    public CreateBookingResponse createBooking(BookingDataPayload bookingDataPayload) {
        return testService
                .createBooking(bookingDataPayload)
                .shouldHave(statusCode(200))
                .asPojo(CreateBookingResponse.class);
    }

}

