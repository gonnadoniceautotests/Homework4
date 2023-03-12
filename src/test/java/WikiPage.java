import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class WikiPage {
    private final SelenideElement searchField = $(".wiki-rightbar input#wiki-pages-filter");
    private final SelenideElement wikiButton = $("#wiki-tab");
    public String rightBarRoute = ".wiki-rightbar";
    public String softAssertionsRoute = "a[href='/selenide/selenide/wiki/SoftAssertions']";

    // Не понимаю насколько хорошая практика писать селекторы таким образом, идея в том чтобы сделать подход
    // при котором можно будет протестировать переход на любую страницу из доступных в правом блоке WikiPage

    public SelenideElement softAssertionsInsideRightBar = $( rightBarRoute + " " + softAssertionsRoute);

    public WikiPage findPage(String pagename) {
        searchField.sendKeys(pagename);

        return this;
    }

    public WikiPage clickWikiButton () {
        wikiButton.click();

        return this;
    }
}
