package framework.web.api.sites.wiki.pages.basePage;

import framework.web.api.drivers.Driver;
import framework.web.api.sites.wiki.pages.utils.topBar.TopBar;

public class BasePage {
    public TopBar useTopBar(){
        return Driver.site.wiki.topBar;
    }
}
