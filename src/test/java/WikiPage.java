import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;

public class WikiPage {
    private final SelenideElement searchField = $(".wiki-rightbar input#wiki-pages-filter");
    private final SelenideElement wikiButton = $("#wiki-tab");
    private final SelenideElement softAssertionsInsideRightBar = $( ".wiki-rightbar a[href='/selenide/selenide/wiki/SoftAssertions']");

    public WikiPage verifySoftAssertionExistsOpenIt() {
        softAssertionsInsideRightBar.should(exist).click();

        return this;
    }

    public WikiPage findPage(String pagename) {
        searchField.sendKeys(pagename);

        return this;
    }

    public WikiPage clickWikiButton () {
        wikiButton.click();

        return this;
    }
}
