package api.restApi.services;

import com.github.cliftonlabs.json_simple.JsonObject;
import api.restApi.assertions.AssertableResponse;
import api.restApi.pojos.bookingDataPayload.BookingDataPayload;

public class BookingService extends ApiService {
    /** Routes */

    public final String BOOKING = "/booking";

    /** Actions of booking service */
    public AssertableResponse createBooking(BookingDataPayload bookingDataPayload) {
        JsonObject bookingData = new JsonObject();
        JsonObject requestObject = new JsonObject();

        bookingData.put(bookingDataPayload.bookingDatePayload.CHECK_IN, bookingDataPayload.bookingDatePayload.chekIn);
        bookingData.put(bookingDataPayload.bookingDatePayload.CHECK_OUT, bookingDataPayload.bookingDatePayload.chekOut);

        requestObject.put(bookingDataPayload.FIRST_NAME, bookingDataPayload.firstname);
        requestObject.put(bookingDataPayload.LAST_NAME, bookingDataPayload.lastname);
        requestObject.put(bookingDataPayload.TOTAL_PRICE, bookingDataPayload.totalPrice);
        requestObject.put(bookingDataPayload.DEPOSIT_PAID, bookingDataPayload.depositPaid);
        requestObject.put(bookingDataPayload.ADDITIONAL_NEEDS, bookingDataPayload.additionalNeeds);
        requestObject.put(bookingDataPayload.BOOKING_DATES, bookingData);

        return new AssertableResponse( setUp()
                .log().all()
                .request()
                .header("Content-Type", "application/json")
                .body(requestObject.toJson())
                .when()
                .post(System.getProperty("baseApiUri") + BOOKING)
                .then().log().all().extract().response());
    }
}
