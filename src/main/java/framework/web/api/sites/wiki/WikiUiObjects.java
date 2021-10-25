package framework.web.api.sites.wiki;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class WikiUiObjects {
    SelenideElement
            logo;

    public SelenideElement getLogo() {
        if (logo == null) logo =
                $x("//*[@class = 'mw-wiki-logo']");
        return logo;
    }
}
