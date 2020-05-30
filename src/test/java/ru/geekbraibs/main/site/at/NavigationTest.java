package ru.geekbraibs.main.site.at;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class NavigationTest extends BaseTest {
    public int count = 0;

    @ParameterizedTest
    @MethodSource("navigation")
    public void navigationPanelTest(String icon, String header, String word, String footer) {

        driver.get(BASE_URL + "/career");
        driver.findElement(By.cssSelector(icon)).click();
        if(count == 2){
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//div/div/button[*]")).click();
        }
        header = driver.findElement(By.className(header)).getText();
        assertEquals(word, header);
        assertTrue(driver.findElement(By.cssSelector(footer)).isDisplayed());
        count++;
    }

    public static Stream<Arguments> navigation() {
        return Stream.of(
                Arguments.of("nav > a[href='/career']", "gb-header__title", "Карьера", "footer.site-footer"),
                Arguments.of("nav > a[href='/tests']", "gb-header__title", "Тесты", "footer.site-footer"),
                Arguments.of("nav.gb-left-menu__nav .svg-icon.icon-courses", "gb-header__title", "Курсы", "footer.site-footer"),
                Arguments.of("nav > a[href='/events']", "gb-header__title", "Вебинары", "footer.site-footer"),
                Arguments.of("nav > a[href='/topics']", "gb-header__title", "Форум", "footer.site-footer"),
                Arguments.of("nav > a[href='/posts']", "gb-header__title", "Блог", "footer.site-footer")
                );
    }
}
