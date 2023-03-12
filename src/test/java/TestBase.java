import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    MainPage mainPage = new MainPage();
    WikiPage wikiPage = new WikiPage();
    SoftAssertionsPage saPage = new SoftAssertionsPage();


    @BeforeAll
    public static void suiteSetup() {
        Configuration.baseUrl = "https://github.com";
    }
}
