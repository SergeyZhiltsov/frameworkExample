package framework.web.api.drivers;

import com.codeborne.selenide.SelenideDriver;
import framework.logger.MyLogger;
import framework.web.api.sites.Sites;
import org.openqa.selenium.WebDriver;

public class Driver {
    public static Sites site = new Sites();
    public static SelenideDriver driver;
}
