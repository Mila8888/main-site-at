package ru.geekbrains.main.site.at.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.*;


public class Page extends BasePage {

    @FindBy(className = "gb-header__title")
    private WebElement pageHeader;

    @Step("Check {expected} is header on page")
    public Page checkHeader(String expected) {
        assertEquals(expected, pageHeader.getText());
        return this;
    }

    @FindBy(css = "footer.site-footer")
    private WebElement pageFooter;

    @Step("Check footer on page")
    public Page checkFooter(String namePage) {
        assertTrue(pageFooter.isDisplayed());
        return this;
    }

    @FindBy(xpath = "//div/div/button[*]")
    private WebElement buttonPopUpClosed;

    public Page popUpClosed() {
        buttonPopUpClosed.click();
        return this;
    }

    @FindBy(css = "ul > li > .show-search-form")
    private WebElement searchButton;

    public Page openSearchButton() {
        searchButton.click();
        return this;
    }

    @FindBy(css = ".search-panel__search-field")
    private WebElement searchInput;

    public Page wordInput() {
        searchInput.sendKeys("java");
        return this;
    }

    WebDriverWait wait = new WebDriverWait(driver, 60);

    public Page waiting() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul.search-page-tabs")));
        return this;
    }

    private Navigation navigationTab;

    public Page(WebDriver driver) {
        super(driver);
        navigationTab = new Navigation(driver);
    }

    @Step("In navigation tab")
    public Navigation getNavigationTab() {
        return navigationTab;
    }

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='professions']")
    private WebElement searchProfLocator;
    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='professions'] > span")
    private WebElement profCount;

    public Page profCountSearch() {
        searchProfLocator.isDisplayed();
        int profCountInt = Integer.parseInt(profCount.getText());
        int minExpected = 2;
        assertTrue(profCountInt >= minExpected);
        return this;
    }

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='courses']")
    private WebElement searchCoursesLocator;
    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='courses'] > span")
    private WebElement coursesCount;

    public Page coursesCountSearch() {
        searchCoursesLocator.isDisplayed();
        int coursesCountInt = Integer.parseInt(coursesCount.getText());
        int minExpected = 15;
        assertTrue(coursesCountInt > minExpected);
        return this;
    }

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='webinars']")
    private WebElement searchWebinarsLocator;
    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='webinars'] > span")
    private WebElement webinarsCount;

    public Page webinarsCountSearch() {
        searchWebinarsLocator.isDisplayed();
        int webinarsCountInt = Integer.parseInt(webinarsCount.getText());
        int minExpected = 180;
        int maxExpected = 300;
        assertTrue(webinarsCountInt >= minExpected & webinarsCountInt < maxExpected);
        return this;
    }

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='blogs']")
    private WebElement searchBlogsLocator;
    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='blogs'] > span")
    private WebElement blogsCount;

    public Page blogsCountSearch() {
        searchBlogsLocator.isDisplayed();
        int blogsCountInt = Integer.parseInt(blogsCount.getText());
        int minExpected = 300;
        assertTrue(blogsCountInt > minExpected);
        return this;
    }

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='forums']")
    private WebElement searchForumsLocator;
    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='forums'] > span")
    private WebElement forumsCount;

    public Page forumsCountSearch() {
        searchForumsLocator.isDisplayed();
        int forumsCountInt = Integer.parseInt(forumsCount.getText());
        int minExpected = 350;
        assertTrue(forumsCountInt != minExpected);
        return this;
    }

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='tests']")
    private WebElement searchTestsLocator;
    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='tests'] > span")
    private WebElement testsCount;

    public Page testsCountSearch() {
        searchTestsLocator.isDisplayed();
        int testsCountInt = Integer.parseInt(testsCount.getText());
        int minExpected = 0;
        assertTrue(testsCountInt != minExpected);
        return this;
    }

    @FindBy(css = "ul.search-page-tabs > li > a[data-tab='companies']")
    private WebElement searchCompanyLocator;

    public Page companyVisibility() {
        searchCompanyLocator.isDisplayed();
        return this;
    }
}