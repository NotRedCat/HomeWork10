package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class WebSteps {

    @Step ("Открываем главную страницу")
    public void openMainPage(){
        open("https://github.com");
    }
@Step ("Ищем репозиторий {repo}")
    public void searchForRepository(String repo)
{
    $(".header-search-input").click();
    $(".header-search-input").sendKeys(repo);
    $(".header-search-input").submit();
}
@Step ("Кликаем по ссылке репозитория {repo}")

    public void clickOnRepositoryLink(String repo){
    $(linkText(repo)).click();
    }
    @Step ("Открывает таб Issues")
    public void openIssuesTab(){
        $("#issues-tab").click();

    }
@Attachment (value = "Screenshots", type = "image/png", fileExtension = "png")
    public byte[] takeScreenshot(){
    return((TakesScreenshot)WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
