package ru.geekbraibs.main.site.at;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled
public class NavigationTest extends BaseTest {

    String header;

    @Test
    void navigationPanelTest1() {
        driver.get(BASE_URL + "/career");
        WebElement careerNavItemButton = driver.findElement(By.cssSelector("nav > a[href='/career']"));
        careerNavItemButton.click();
        header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Карьера", header);
        assertTrue(driver.findElement(By.cssSelector("footer.site-footer")).isDisplayed());
    }

    @Test
    void navigationPanelTest2() {
        driver.get(BASE_URL + "/career");
        driver.findElement(By.cssSelector("nav > a[href='/tests']")).click();
        header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Тесты", header);
        assertTrue(driver.findElement(By.cssSelector("footer.site-footer")).isDisplayed());
    }

    @Test
    void navigationPanelTest3() {
        driver.get(BASE_URL + "/career");
        driver.findElement(By.cssSelector("nav.gb-left-menu__nav .svg-icon.icon-courses")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div/div/button[*]")).click();
        header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Курсы", header);
        assertTrue(driver.findElement(By.cssSelector("footer.site-footer")).isDisplayed());
    }

    @Test
    void navigationPanelTest4() {
        driver.get(BASE_URL + "/career");

        driver.findElement(By.cssSelector("nav > a[href='/events']")).click();
        header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Вебинары", header);
        assertTrue(driver.findElement(By.cssSelector("footer.site-footer")).isDisplayed());
    }

    @Test
    void navigationPanelTest5() {
        driver.get(BASE_URL + "/career");
        driver.findElement(By.cssSelector("nav > a[href='/topics']")).click();
        header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Форум", header);
        assertTrue(driver.findElement(By.cssSelector("footer.site-footer")).isDisplayed());
    }

        @Test
        void navigationPanelTest6() {
        driver.get(BASE_URL + "/career");
        driver.findElement(By.cssSelector("nav > a[href='/posts']")).click();
        header = driver.findElement(By.className("gb-header__title")).getText();
        assertEquals("Блог", header);
            assertTrue(driver.findElement(By.cssSelector("footer.site-footer")).isDisplayed());
        }
}


