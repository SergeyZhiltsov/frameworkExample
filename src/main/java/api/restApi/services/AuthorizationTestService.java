package api.restApi.services;

import com.github.cliftonlabs.json_simple.JsonObject;
import api.restApi.assertions.AssertableResponse;
import api.restApi.pojos.UserPayload;

public class AuthorizationTestService extends ApiService{
    /** Routes */

    public final String AUTH = "/auth";

    /** Actions of auth service*/
    public AssertableResponse authorization (UserPayload userPayload) {

        JsonObject authorizationRequestObject = new JsonObject();

        authorizationRequestObject.put(userPayload.USERNAME, userPayload.username);
        authorizationRequestObject.put(userPayload.PASSWORD, userPayload.password);

        return new AssertableResponse( setUp()
                .log().all()
                .request()
                .header("Content-Type", "application/json")
                .body(authorizationRequestObject.toJson())
                .when()
                .post(System.getProperty("baseApiUri") + AUTH)
                .then().log().all().extract().response());
    }

}
