import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsPage {
    public SelenideElement junitBlock = $("h4:has(a[href='#3-using-junit5-extend-test-class']) + div > pre");
}
