import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsPage {
    private final SelenideElement junitBlock = $("h4:has(a[href='#3-using-junit5-extend-test-class']) + div > pre");

    public SoftAssertionsPage verifyJunitBlockIsNotEmpty () {
        junitBlock.shouldNotBe(empty);

        return this;
    }
}
