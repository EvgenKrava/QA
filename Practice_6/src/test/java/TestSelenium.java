import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestSelenium {

    static WebDriver WEBDRIVER;

    @BeforeClass
    public static void setWebDriver() {
        System.setProperty("webdriver.gecko.driver", "/home/evgen/IdeaProjects/QA/Practice_6/src/main/resources/geckodriver-v0.24.0-linux64/geckodriver");
        WEBDRIVER = new FirefoxDriver();
        WEBDRIVER.get("https://pn.com.ua/");
    }

    @Test
    public void Test1() {
        WEBDRIVER.findElement(By.xpath(".//*[text()=\"Диваны\"]")).click();
        WEBDRIVER.findElement(By.xpath(".//*[@class=\"popular\"]")).click();
        List<WebElement> sofas = WEBDRIVER.findElements(By.xpath(".//*[@class=\"catalog-block-head\"]"));
        for (int i = 0; i < sofas.size(); i++) {
            Assert.assertEquals("Не все товары из спика нужной фирмы", sofas.get(i).getText().contains("AMF"), true);
        }
    }

    @Test
    public void Test2() {
        WEBDRIVER.get("https://pn.com.ua/");
        int count = 0;
        WEBDRIVER.findElement(By.xpath(".//*[text()=\"Диваны\"]")).click();
        WEBDRIVER.findElement(By.xpath(".//*[@class=\"popular\"]")).click();
        List<WebElement> sofas = WEBDRIVER.findElements(By.xpath(".//*[@class=\"catalog-block-head\"]"));
        count += sofas.size();
        int c = Integer.valueOf(WEBDRIVER.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[1]/ul/li[3]/small/b")).getText());
        WEBDRIVER.findElement(By.xpath("*//*[@class=\"page-next\"]/a")).click();
        sofas = WEBDRIVER.findElements(By.xpath(".//*[@class=\"catalog-block-head\"]"));
        count += sofas.size();
        Assert.assertEquals("", count, c);
    }

    @Test
    public void Test3() {
        WEBDRIVER.get("https://pn.com.ua/");
        WEBDRIVER.findElement(By.xpath(".//*[text()=\"Холодильники\"]")).click();
        List<WebElement> list = WEBDRIVER.findElements(By.xpath(".//*[@class=\"item td-table\"]"));
        for (int i = 0; i < 2; i++) {
            list.get(i).findElement(By.xpath(".//*[@class=\"add-to-compare-link\"]")).click();
        }
        WEBDRIVER.findElement(By.xpath(".//*[@href=\"/compare/2163/\"]")).click();
        Assert.assertEquals("", WEBDRIVER.findElements(By.xpath(".//*[@class=\"item\"]")).size(), 2);
        WEBDRIVER.manage().deleteAllCookies();
    }

    @Test
    public void Test4() {
        WEBDRIVER.get("https://pn.com.ua/");
        WEBDRIVER.findElement(By.xpath(".//*[text()=\"Холодильники\"]")).click();
        List<WebElement> list = WEBDRIVER.findElements(By.xpath(".//*[@class=\"item td-table\"]"));
        for (int i = 0; i < 4; i++) {
            list.get(i).findElement(By.xpath(".//*[@class=\"add-to-compare-link\"]")).click();
        }
        WEBDRIVER.findElement(By.xpath(".//*[@href=\"/compare/2163/\"]")).click();
        Assert.assertEquals("", WEBDRIVER.findElements(By.xpath(".//*[@class=\"item\"]")).size(), 4);
        WEBDRIVER.findElement(By.xpath(".//*[@href=\"/compare/delete/\"]")).click();
        Assert.assertEquals("", WEBDRIVER.findElements(By.xpath(".//*[@class=\"item\"]")).size(), 3);
        WEBDRIVER.manage().deleteAllCookies();
    }

    @Test
    public void Test5() {
        WEBDRIVER.get("https://pn.com.ua/");
        WEBDRIVER.findElement(By.xpath(".//*[text()=\"Холодильники\"]")).click();
        List<WebElement> list = WEBDRIVER.findElements(By.xpath(".//*[@class=\"item td-table\"]"));
        for (int i = 0; i < 4; i++) {
            list.get(i).findElement(By.xpath(".//*[@class=\"add-to-compare-link\"]")).click();
        }
        WEBDRIVER.findElement(By.xpath(".//*[@href=\"/compare/2163/\"]")).click();
        WEBDRIVER.findElement(By.xpath(".//*[@class=\"delete\"]")).click();
        WEBDRIVER.switchTo().alert().accept();
        Assert.assertEquals("", WEBDRIVER.getCurrentUrl(), "https://pn.com.ua/compare/2163/");
    }

    @Test
    public void Test6() {
        WEBDRIVER.get("https://pn.com.ua/ct/1232/");
        WEBDRIVER.findElement(By.xpath(".//*[@type=\"text\"]")).sendKeys("Samsung");
        WEBDRIVER.findElement(By.xpath(".//*[@value=\"Найти\"]")).click();
        List<WebElement> list = WEBDRIVER.findElements(By.xpath(".//*[@class=\"catalog-block-head\"]/a"));
        for (int i = 0; i < list.size(); i++) {
            Assert.assertEquals("", list.get(i).getText().contains("Samsung"), true);
        }
    }

    @AfterClass
    public static void closeWebDriver() {
        WEBDRIVER.close();
    }
}
