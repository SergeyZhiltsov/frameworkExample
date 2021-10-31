package web.sites.wiki.pages.utils.topBar;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TopBarUiObjects {
    private SelenideElement
            mainTab,
            talkTab;

    public SelenideElement getMainTab() {
        if (mainTab == null) mainTab =
                $(By.id("ca-nstab-main"));
        return mainTab;
    }

    public SelenideElement getTalkTab() {
        if (talkTab == null) talkTab =
                $(By.id("ca-talk"));
        return talkTab;
    }
}
