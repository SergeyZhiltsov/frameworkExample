package api.restApi.services;

import io.restassured.RestAssured;
import io.restassured.config.RedirectConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.specification.RequestSpecification;


public class ApiService {
    protected RequestSpecification setUp() {
        return RestAssured
                .given()
                .config(RestAssuredConfig.config().redirect(RedirectConfig.redirectConfig().followRedirects(true)));
    }

    protected RequestSpecification setUp(String token) {
        return setUp()
                .header("token", token);
    }
}
