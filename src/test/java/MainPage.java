import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    public MainPage openPage () {
        open("/selenide/selenide");

        return this;
    }
}
