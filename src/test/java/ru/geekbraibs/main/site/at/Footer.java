package ru.geekbraibs.main.site.at;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbraibs.main.site.at.base.BaseTest;

public class Footer extends BaseTest {

    WebElement facebook = driver.findElement(By.cssSelector("footer>* a.site-footer__icon[href*='facebook']"));
    WebElement vk = driver.findElement(By.cssSelector("footer>* a.site-footer__icon[href*='vk']"));
    WebElement instagram = driver.findElement(By.cssSelector("footer>* a.site-footer__icon[href*='instagram']"));
    WebElement youtube = driver.findElement(By.cssSelector("footer>* a.site-footer__icon[href*='youtube']"));
    WebElement telegram = driver.findElement(By.cssSelector("footer>* a.site-footer__icon[href*='telegram']"));
    WebElement reviews = driver.findElement(By.xpath("//footer/div//a[text()='Отзывы']"));
    WebElement aid = driver.findElement(By.xpath("//footer/div//a[text()='Помощь']"));
    WebElement company = driver.findElement(By.xpath("//footer/div//a[text()='О проекте']"));
    WebElement license = driver.findElement(By.xpath("//footer/div//a[text()='Лицензия']"));
    WebElement career = driver.findElement(By.xpath("//footer/div//a[text()='Вакансии']"));
    WebElement forBusiness = driver.findElement(By.xpath("//footer/div//a[text()='Компаниям']"));
    WebElement phone = driver.findElement(By.xpath("//footer/div//a[@class='site-footer__phone']"));
    WebElement sk= driver.findElement(By.xpath("//footer//a[@class='site-footer__icon-sk']"));

}
