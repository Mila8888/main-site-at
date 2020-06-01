package ru.geekbraibs.main.site.at;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import ru.geekbraibs.main.site.at.base.BaseTest;
import ru.geekbrains.main.site.at.pages.NavigationTab;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;


    @Execution(value = ExecutionMode.CONCURRENT)
    public class NavigationTest extends BaseTest {

        public static Stream<String> pageGenerator() {
            return Stream.of("Карьера", "Тесты", "Блог", "Форум", "Вебинары", "Курсы");
        }

        @BeforeEach
        public void openSite() {
            driver.get(BASE_URL + "/career");
        }

        @ParameterizedTest
        @DisplayName("check navigation items")
        @MethodSource("pageGenerator")
        public void navigationPanelTest(String buttonTitle) {
            new NavigationTab(driver)
                    .clickButton(buttonTitle)
                    .checkHeader(buttonTitle);
        }


//    public int count = 0;

//    @ParameterizedTest
//    @MethodSource("navigation")
//    public void navigationPanelTest(String icon, String header, String word, String footer) {
//
//        driver.get(BASE_URL + "/career");
//        driver.findElement(By.cssSelector(icon)).click();
//        if(count == 2){
//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//            driver.findElement(By.xpath("//div/div/button[*]")).click();
//        }
//        header = driver.findElement(By.className(header)).getText();
//        assertEquals(word, header);
//        assertTrue(driver.findElement(By.cssSelector(footer)).isDisplayed());
//        count++;
//    }
//
//    public static Stream<Arguments> navigation() {
//        return Stream.of(
//                Arguments.of("nav > a[href='/career']", "gb-header__title", "Карьера", "footer.site-footer"),
//                Arguments.of("nav > a[href='/tests']", "gb-header__title", "Тесты", "footer.site-footer"),
//                Arguments.of("nav.gb-left-menu__nav .svg-icon.icon-courses", "gb-header__title", "Курсы", "footer.site-footer"),
//                Arguments.of("nav > a[href='/events']", "gb-header__title", "Вебинары", "footer.site-footer"),
//                Arguments.of("nav > a[href='/topics']", "gb-header__title", "Форум", "footer.site-footer"),
//                Arguments.of("nav > a[href='/posts']", "gb-header__title", "Блог", "footer.site-footer")
//                );
//    }
}
