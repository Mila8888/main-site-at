package ru.geekbraibs.main.site.at;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled
public class SearchTest extends BaseTest {

    int profCount;
    int coursesCount;
    int webinarsCount;
    int blogsCount;
    int forumsCount;
    int testsCount;

    @Test
    void searchJavaTest() {
        int professionsCount;

        driver.get(BASE_URL + "/courses");
        driver.findElement(By.xpath("//div/div/button[*]")).click();

        WebElement searchButton = driver.findElement(By.cssSelector("ul > li > .show-search-form"));
        searchButton.click();

        WebElement searchInput = driver.findElement(By.cssSelector(".search-panel__search-field"));
        searchInput.sendKeys("java");

        WebDriverWait wait = new WebDriverWait(driver, 60);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul.search-page-tabs")));

        WebElement professionsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='professions']"));

        assertTrue(professionsTab.isDisplayed());


        WebElement coursesTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='courses']"));
        WebElement webinarsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='webinars']"));
        WebElement blogsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='blogs']"));
        WebElement forumsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='forums']"));
        WebElement testsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='tests']"));
        WebElement companiesTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='companies']"));

        assertTrue(coursesTab.isDisplayed());
        assertTrue(webinarsTab.isDisplayed());
        assertTrue(blogsTab.isDisplayed());
        assertTrue(forumsTab.isDisplayed());
        assertTrue(testsTab.isDisplayed());
        assertTrue(companiesTab.isDisplayed());

        profCount = Integer.parseInt(driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='professions'] > span")).getText());
        if (profCount >= 2) {
            System.out.println("true");
        }
        coursesCount = Integer.parseInt(driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='courses'] > span")).getText());
        if (coursesCount > 15) {
            System.out.println("true");
        }
        webinarsCount = Integer.parseInt(driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='webinars'] > span")).getText());
        if (webinarsCount > 180 & webinarsCount < 300) {
            System.out.println("true");
        }
        blogsCount = Integer.parseInt(driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='blogs'] > span")).getText());
        if (blogsCount > 300) {
            System.out.println("true");
        }
        forumsCount = Integer.parseInt(driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='forums'] > span")).getText());
        if (forumsCount != 350) {
            System.out.println("true");
        }
        testsCount = Integer.parseInt(driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='tests'] > span")).getText());
        if (testsCount != 0) {
            System.out.println("true");
        }

    }
}