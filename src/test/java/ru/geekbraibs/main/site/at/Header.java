package ru.geekbraibs.main.site.at;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbraibs.main.site.at.base.BaseTest;

public class Header extends BaseTest {

    WebElement scan = driver.findElement(By.xpath("//li/a[@class='show-search-form']"));
    WebElement schedule = driver.findElement(By.xpath("//li[@class=\"gb-top-menu__item\"]/a[@class='schedule-opener js-schedule-opener']"));
    WebElement bell = driver.findElement(By.xpath("//a[@class='js-notices-link']"));
    WebElement like = driver.findElement(By.xpath("//li[@class=\"gb-top-menu__item\"]/a[@href=\"/thanks\"]"));
    WebElement messages = driver.findElement(By.xpath("//li[@class=\"gb-top-menu__item\"]/a[@class='chat-button']"));
    WebElement user = driver.findElement(By.xpath("//li[@class=\"gb-top-menu__item dropdown\"]"));

}
