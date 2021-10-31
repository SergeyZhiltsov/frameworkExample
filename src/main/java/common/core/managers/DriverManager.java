package common.core.managers;

import com.codeborne.selenide.Configuration;

import static api.restApi.ApiProjectConfig.BASE_API_CONFIG;
import static common.ProjectConfig.BASE_CONFIG;
import static common.core.UiProjectConfig.BASE_UI_CONFIG;

public class DriverManager {
    public static void createDriver() {

        setEnv();
        setDriver();
        setBaseUiUri();

    }

    public static void setApi() {

        setEnv();
        setBaseApiUri();

    }

    public static void setEnv() {

        if (System.getenv("env") == null) {
            System.setProperty("env", BASE_CONFIG.env());
        } else {
            System.setProperty("env", System.getenv("env"));
        }

    }

    public static void setDriver() {

        if (System.getenv("browser") == null) {
            System.setProperty("browser", BASE_UI_CONFIG.browserName());
        } else {
            System.setProperty("browser", System.getenv("browser"));
        }

        Configuration.browser = System.getProperty("browser");

    }

    public static void setBaseUiUri() {

        if (System.getenv("baseUiUri") == null) {

            switch (System.getProperty("env")) {

                case "test": {
                    System.setProperty("baseUiUri", BASE_UI_CONFIG.testUri());
                }

                case "stg": {
                    System.setProperty("baseUiUri", BASE_UI_CONFIG.stgUri());
                }

                case "prod": {
                    System.setProperty("baseUiUri", BASE_UI_CONFIG.prodUri());
                }

                default:
                {
                    System.setProperty("baseUiUri", BASE_UI_CONFIG.baseUri());
                }
            }
        } else {
            System.setProperty("baseUiUri", System.getenv("baseUiUri"));
        }
    }

    public static void setBaseApiUri() {

        if (System.getenv("baseApiUri") == null) {

            switch (System.getProperty("env")) {

                case "test": {
                    System.setProperty("baseApiUri", BASE_API_CONFIG.testUri());
                }

                case "stg": {
                    System.setProperty("baseApiUri", BASE_API_CONFIG.stgUri());
                }

                case "prod": {
                    System.setProperty("baseApiUri", BASE_API_CONFIG.prodUri());
                }

                default:
                {
                    System.setProperty("baseApiUri", BASE_API_CONFIG.baseUri());
                }
            }
        } else {
            System.setProperty("baseApiUri", System.getenv("baseApiUri"));
        }
    }

}
