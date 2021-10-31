package api.restApi.pojos.bookingDataPayload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors(fluent = true)

public class BookingDataPayload {
    public final String FIRST_NAME = "firstname";
    public final String LAST_NAME = "lastname";
    public final String TOTAL_PRICE = "totalprice";
    public final String DEPOSIT_PAID = "depositpaid";
    public final String BOOKING_DATES = "bookingdates";
    public final String ADDITIONAL_NEEDS = "additionalNeeds";
    public final String BOOKING_ID = "bookingid";

    @JsonProperty (FIRST_NAME)
    public String firstname;

    @JsonProperty (LAST_NAME)
    public String lastname;

    @JsonProperty (TOTAL_PRICE)
    public int totalPrice;

    @JsonProperty (DEPOSIT_PAID)
    public boolean depositPaid;

    @JsonProperty (BOOKING_DATES)
    public BookingDatePayload bookingDatePayload;

    @JsonProperty (ADDITIONAL_NEEDS)
    public String additionalNeeds;

    @JsonProperty (BOOKING_ID)
    public int bookingId;
}
