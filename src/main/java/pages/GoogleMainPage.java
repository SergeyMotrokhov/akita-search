package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Страница поиска Google")
public class GoogleMainPage extends AkitaPage {

    @FindBy(xpath = "//input[@title='Поиск']")
    @Name("Поиск")
    public SelenideElement searchField;
}
