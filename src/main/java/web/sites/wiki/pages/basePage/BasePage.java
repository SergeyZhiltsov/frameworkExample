package web.sites.wiki.pages.basePage;

import web.drivers.Driver;
import web.sites.wiki.pages.utils.topBar.TopBar;

public class BasePage {
    public TopBar useTopBar(){
        return Driver.site.wiki.topBar;
    }
}
