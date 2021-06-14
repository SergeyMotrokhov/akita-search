package steps;

import cucumber.api.java.ru.Тогда;
import helpers.SearchHelper;
import lombok.extern.slf4j.Slf4j;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;

import java.util.List;

import static java.lang.Thread.sleep;
import static org.hamcrest.MatcherAssert.assertThat;

@Slf4j
public class TemplateSteps {
    AkitaScenario akitaScenario = AkitaScenario.getInstance();
    SearchHelper searchHelper = new SearchHelper();

    @Тогда("^список заголовков на странице содержит переменную \"([^\"]*)\"$")
    public void checkReposListOnPageCorrespondsToResponse(String param) throws InterruptedException {

        List<String> repoNamesFromPage = searchHelper.getRepoListNamesFromPage();
        boolean check = false;
        for (String s : repoNamesFromPage)
            if (s.contains(param))
                check = true;
        assertThat(String.valueOf(check), true);
        sleep(5000);
    }
}
