package ru.geekbraibs.main.site.at;

import org.junit.jupiter.api.*;
import ru.geekbraibs.main.site.at.base.BaseTest;
import ru.geekbrains.main.site.at.pages.Page;

public class SearchTest extends BaseTest {

    @BeforeEach
    public void Test() {
        driver.get(BASE_URL + "/courses");
    }

    @Test

    public void searchWordTest() {
        new Page(driver)
                .popUpClosed()
                .openSearchButton()
                .wordInput()
                .waiting()

                .profCountSearch()
                .coursesCountSearch()
                .webinarsCountSearch()
                .blogsCountSearch()
                .forumsCountSearch()
                .testsCountSearch()
                .companyVisibility();
    }
}
