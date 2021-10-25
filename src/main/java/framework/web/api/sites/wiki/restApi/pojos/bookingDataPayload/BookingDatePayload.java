package framework.web.api.sites.wiki.restApi.pojos.bookingDataPayload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors(fluent = true)

public class BookingDatePayload {
    public final String CHECK_IN = "checkin";
    public final String CHECK_OUT = "checkout";

    @JsonProperty (CHECK_IN)
    public String chekIn;

    @JsonProperty (CHECK_OUT)
    public String chekOut;
}
