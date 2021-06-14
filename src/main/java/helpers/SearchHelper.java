package helpers;

import pages.SearchPage;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class SearchHelper {
    AkitaScenario akitaScenario = AkitaScenario.getInstance();

    public LinkedList<String> getRepoListNamesFromPage() {
        SearchPage searchPage = akitaScenario.getPage(SearchPage.class);
        return searchPage.getRepoNames().stream()
                .map(item -> item.getText().trim())
                .collect(Collectors.toCollection(LinkedList::new));
    }
}
