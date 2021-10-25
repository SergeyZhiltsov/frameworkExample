package framework.web.api.sites.wiki.pages.startPage.startPageMainTab;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class StartPageUiObjects {
    private SelenideElement
            title;

    public SelenideElement getTitle() {
        if (title == null) title =
                $$(By.className("mw-headline")).get(1);
        return title;
    }

}
