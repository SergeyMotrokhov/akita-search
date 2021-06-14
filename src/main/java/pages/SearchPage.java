package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@Name("Страница с результатами поиска")
public class SearchPage extends AkitaPage {

    @FindBy(xpath = "//*[@id='search']//h3")
    @Name("Названия заголовков")
    public List<SelenideElement> repoNames;

    public List<SelenideElement> getRepoNames() {
        return repoNames;
    }

}
