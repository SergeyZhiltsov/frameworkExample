package framework.web.core.managers;

import com.codeborne.selenide.Configuration;

import static framework.ProjectConfig.BASE_CONFIG;
import static framework.web.core.UiProjectConfig.BASE_UI_CONFIG;

public class DriverManager {
    public static void createDriver() {

        setEnv();
        setDriver();
        setBaseUri();

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

    public static void setBaseUri() {

        if (System.getenv("baseUri") == null) {

            switch (System.getProperty("env")) {

                case "test": {
                    System.setProperty("baseUri", BASE_UI_CONFIG.testUri());
                }

                case "stg": {
                    System.setProperty("baseUri", BASE_UI_CONFIG.stgUri());
                }

                case "prod": {
                    System.setProperty("baseUri", BASE_UI_CONFIG.prodUri());
                }

                default:
                {
                    System.setProperty("baseUri", BASE_UI_CONFIG.baseUri());
                }
            }
        } else {
            System.setProperty("baseUri", System.getenv("baseUri"));
        }
    }

}
