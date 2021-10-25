package framework.web.api.sites.wiki.restApi.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors(fluent = true)

public class UserPayload {
    public final String USERNAME = "username";
    public final String PASSWORD = "password";

    @JsonProperty(USERNAME)
    public String username;

    @JsonProperty(PASSWORD)
    public String password;
}
