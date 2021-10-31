package web.sites.wiki.pages.startPage.startPageTalkTab;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StartPageTalkTabUiObjects {
    private SelenideElement
            title;

    public SelenideElement getTitle() {
        if (title == null) title =
                $(By.id("firstHeading"));
        return title;
    }

}
