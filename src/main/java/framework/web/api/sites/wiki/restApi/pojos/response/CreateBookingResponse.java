package framework.web.api.sites.wiki.restApi.pojos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import framework.web.api.sites.wiki.restApi.pojos.bookingDataPayload.BookingDataPayload;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors(fluent = true)

public class CreateBookingResponse {
    public static final String BOOKING_ID = "bookingid";
    public static final String BOOKING = "booking";

    @JsonProperty (BOOKING_ID)
    public int bookingId;

    @JsonProperty (BOOKING)
    public BookingDataPayload booking;
}
