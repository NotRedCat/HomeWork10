package guru.qa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;

public class LablesTest {

    @Test
    @DisplayName("Проверка создания задачи")
    @Feature("Задача в репозитории")
    @Story("Создание задачи")
    @Owner("anastasiaredcat")
    @Severity(SeverityLevel.BLOCKER)
    @Link("https://github.com")

    public void testStaticLables() {

    }


    @Test
    public void testDynamicLables() {
        Allure.getLifecycle().updateTestCase(
        t -> t.setName("Проверка создания задачи")
        );
        Allure.feature("Задача в репозитории");
        Allure.story("Создание задачи");
        Allure.label("owner","anastasiaredcat");
        Allure.label("Severity", SeverityLevel.NORMAL.value());
        Allure.link("https://github.com");
    }
}