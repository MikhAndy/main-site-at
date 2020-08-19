package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.base.BaseSettingsTest;

//        Перейти на сайт https://geekbrains.ru/career
//        Нажать на кнопку Форум
//        Проверить что страница Форум открылась
//        Повторить для
//        Вебинары
//        Блог
//        Тесты
//        Карьера

public class NavigationTest extends BaseSettingsTest {

    @Test
    public void checkEvents() {

        WebElement elementsButton = driver.findElement(By.cssSelector("aside nav [href=\"/events\"]"));
        elementsButton.click();

        WebElement eventsTitlePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Вебинары", eventsTitlePage.getText());
    }

    @Test
    public void checkTopics() {
        WebElement elementsButton = driver.findElement(By.cssSelector("aside nav [href=\"/topics\"]"));
        elementsButton.click();

        WebElement eventsTitlePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Форум", eventsTitlePage.getText());
    }

    @Test
    public void checkPosts() {
        WebElement elementsButton = driver.findElement(By.cssSelector("aside nav [href=\"/posts\"]"));
        elementsButton.click();

        WebElement eventsTitlePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Блог", eventsTitlePage.getText());
    }

    @Test
    public void checkTests() {
        WebElement elementsButton = driver.findElement(By.cssSelector("aside nav [href=\"/tests\"]"));
        elementsButton.click();

        WebElement eventsTitlePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Тесты", eventsTitlePage.getText());
    }

    @Test
    public void checkCareer() {
        WebElement elementsButton = driver.findElement(By.cssSelector("aside nav [href=\"/career\"]"));
        elementsButton.click();

        WebElement eventsTitlePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Карьера", eventsTitlePage.getText());
    }
}
