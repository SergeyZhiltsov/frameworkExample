package web.drivers;

import com.codeborne.selenide.SelenideDriver;
import web.sites.Sites;

public class Driver {
    public static Sites site = new Sites();
    public static SelenideDriver driver;
}
