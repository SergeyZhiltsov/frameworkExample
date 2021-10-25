package framework.web.api.sites.wiki.restApi.conditions;

import io.restassured.response.Response;

public interface Condition {
    void check(Response response);
}
