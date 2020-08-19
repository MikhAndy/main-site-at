package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.base.BaseSettingsTest;

//Перейти на сайт https://geekbrains.ru/career
//        Нажать на кнопку Поиск
//        В поле Поиск ввести текст: java
//        Проверить что отобразились блоки:
//        Профессии
//        Курсы
//        Вебинары
//        Блоги
//        Форум
//        Тесты
//        Проекты и компании

public class SearchTest extends BaseSettingsTest {

    @Test
    public void searchTextJava() {

        WebElement buttonSearch = driver.findElement(By.cssSelector("a>[class=\"svg-icon icon-search \"]"));
        buttonSearch.click();

        WebElement inputSearch = driver.findElement(By.cssSelector("[class=\"search-panel__search-field\"]"));
        inputSearch.sendKeys("java");

        WebElement textProfessions = driver.findElement(By.cssSelector("[id=\"professions\"] h2"));
        WebElement countProfessoins = driver.findElement(By.xpath("//div[1]/div[1]/header/ul/li/a/span"));
        Assertions.assertEquals("3", countProfessoins.getText());

        WebElement textCourses = driver.findElement(By.xpath("//header//h2[text()=\"Курсы\"]"));
        WebElement countCourses = driver.findElement(By.xpath("//div[2]/div[1]/header/ul/li/a/span"));
        Assertions.assertEquals("19", countCourses.getText());

        WebElement textWebinar = driver.findElement(By.xpath("//header//h2[text()=\"Вебинары\"]"));
        WebElement countWebinar = driver.findElement(By.xpath("//div[3]/div[1]/header/ul/li/a/span"));
        Assertions.assertEquals("228", countWebinar.getText());

        WebElement textBlog = driver.findElement(By.xpath("//header//h2[text()=\"Блоги\"]"));
        WebElement countBlog = driver.findElement(By.xpath("//div[4]/div[1]/header/ul/li/a/span"));
        Assertions.assertEquals("359", countBlog.getText());

        WebElement textForum = driver.findElement(By.xpath("//header//h2[text()=\"Форум\"]"));
        WebElement countForum = driver.findElement(By.xpath("//div[5]/div[1]/header/ul/li/a/span"));
        Assertions.assertEquals("454", countForum.getText());

        WebElement textTests = driver.findElement(By.xpath("//header//h2[text()=\"Тесты\"]"));
        WebElement countTests = driver.findElement(By.xpath("//div[6]/div[1]/header/ul/li/a/span"));
        Assertions.assertEquals("1", countTests.getText());

        WebElement textProject = driver.findElement(By.xpath("//header//h2[text()=\"Проекты и компании\"]"));
        WebElement countProject = driver.findElement(By.xpath("//div[7]/div[1]/header/ul/li/a/span"));
        Assertions.assertEquals("87", countForum.getText());

        wait30seconds.until(ExpectedConditions.visibilityOf(textProfessions));
        wait30seconds.until(ExpectedConditions.visibilityOf(textCourses));
        wait30seconds.until(ExpectedConditions.visibilityOf(textWebinar));
        wait30seconds.until(ExpectedConditions.visibilityOf(textBlog));
        wait30seconds.until(ExpectedConditions.visibilityOf(textForum));
        wait30seconds.until(ExpectedConditions.visibilityOf(textTests));
        wait30seconds.until(ExpectedConditions.visibilityOf(textProject));
    }
}
