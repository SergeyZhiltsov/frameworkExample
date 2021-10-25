package framework.web.api.sites.wiki.restApi.assertions;

import framework.web.api.sites.wiki.restApi.conditions.Condition;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class AssertableResponse {
    private final Response response;

    public AssertableResponse shouldHave(Condition condition) {
        log.info("About to check condition {}" , condition);
        condition.check(response);
        return this;
    }

    public <T> T asPojo(Class<T> tClass) {
        RestAssured.defaultParser = Parser.JSON;
        return response.as(tClass);
    }

    public Headers headers() {
        return response.getHeaders();
    }
}
