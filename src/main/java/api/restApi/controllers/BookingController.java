package api.restApi.controllers;


import api.restApi.pojos.UserPayload;
import api.restApi.pojos.bookingDataPayload.BookingDataPayload;
import api.restApi.pojos.response.AuthorizationResponse;
import api.restApi.pojos.response.CreateBookingResponse;
import api.restApi.services.AuthorizationTestService;
import api.restApi.services.BookingService;
import io.qameta.allure.Step;

import static api.restApi.conditions.Conditions.statusCode;

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

