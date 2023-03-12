import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;


public class GithubSoftAssertJunitTest extends TestBase {


    @Test
    void junitCodeExampleTest() {
        mainPage.openPage();
        wikiPage.clickWikiButton()
                .findPage("SoftAssertions")
                .softAssertionsInsideRightBar.should(exist)
                .click();
        saPage.junitBlock.shouldNotBe(empty);
    }

}
