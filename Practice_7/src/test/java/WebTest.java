import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTest {
    private static String siteHomePage = "https://pn.com.ua/";
    private static WebDriver driver;
    private HomePage homePage;
    private ComputerPage computerPage;
    private SofaPage sofaPage;

    @BeforeClass
    public static void testBeforeClass(){
        System.setProperty("webdriver.gecko.driver","/home/evgen/IdeaProjects/QA/Practice_6/src/main/resources/geckodriver-v0.24.0-linux64/geckodriver");
        driver = new FirefoxDriver();
        driver.get(siteHomePage);
    }

    @Test
    public void testComputerCategory(){
        driver.get(siteHomePage);
        homePage = PageFactory.initElements(driver, HomePage.class);
        computerPage = homePage.choiceComputerCategory();
        System.out.println(computerPage.getTextITService());
        computerPage.getTextITService();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertTrue("", computerPage.getTextITService().contains("IT услуги"));

    }

    @Test
    public void myTest(){
        /*driver.get(siteHomePage);
        driver.findElement(By.xpath(".//*[text()=\"Диваны\"]")).click();
        driver.findElement(By.xpath(".//*[@class=\"popular\"]")).click();
        List<WebElement> sofas = driver.findElements(By.xpath(".//*[@class=\"catalog-block-head\"]"));
        for (int i = 0; i <sofas.size() ; i++) {
            Assert.assertTrue("Не все товары из спика нужной фирмы", sofas.get(i).getText().contains("AMF"));
        }*/
        driver.get(siteHomePage);
        homePage = PageFactory.initElements(driver, HomePage.class);
        sofaPage = homePage.choiceSofaCategory();
        List<String> s = sofaPage.getTopPopularNames();
        System.out.println(s);
        for (String st:s) {
            Assert.assertTrue("Не все товары из спика нужной фирмы", st.contains("AMF"));
        }
    }

    @AfterClass
    public static void testAfterClass(){
        driver.close();
    }
 }
