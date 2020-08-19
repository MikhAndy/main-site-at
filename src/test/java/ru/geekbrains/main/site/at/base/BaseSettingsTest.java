package ru.geekbrains.main.site.at.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public abstract class BaseSettingsTest {

    protected ChromeDriver driver;
    protected WebDriverWait wait30seconds;

    @BeforeEach
    public void befireAllTest(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        // пришлось воспользоваться этим методом, т.к. по дефолту открывает слишком маленькое окно, где искомого элемента нет
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.get("https://geekbrains.ru/career");

        wait30seconds = new WebDriverWait(driver, 30);

        // проверка наличия элементов Header и Footer на каждой странице
        WebElement elementHeader = driver.findElement(By.cssSelector("[id=\"top-menu\"]"));
        WebElement elementFooter = driver.findElement(By.cssSelector("[class=\"site-footer\"]"));
    }
    @AfterEach
    public void afterAllTest(){
        driver.quit();
    }
}
