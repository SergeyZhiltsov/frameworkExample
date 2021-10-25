package framework.web.api.sites.wiki.restApi.pojos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors(fluent = true)
public class AuthorizationResponse {
    public static final String TOKEN = "token";

    @JsonProperty (TOKEN)
    public String token;
}
