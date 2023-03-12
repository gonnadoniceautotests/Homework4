import org.junit.jupiter.api.Test;


public class GithubSoftAssertJunitTest extends TestBase {


    @Test
    void junitCodeExampleTest() {
        mainPage.openPage();
        wikiPage.clickWikiButton()
                .findPage("SoftAssertions")
                .verifySoftAssertionExistsOpenIt();
        saPage.verifyJunitBlockIsNotEmpty();
    }

}
