import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid {
    static WebDriver driver;
    static DesiredCapabilities capabilities;

    @BeforeClass
    public static void setUp() throws MalformedURLException{
        capabilities = DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.LINUX);
        driver = new RemoteWebDriver(new URL("http://192.168.0.111:6666/wd/hub/"), capabilities);
        driver.get("https://pn.com.ua/");
    }

    @Test
    public void testTestFirst(){
        driver.findElement(By.xpath(".//*[@href=\"/computer/\"]")).click();
    }

    @AfterClass
    public static void simpleTest(){
        driver.quit();
    }
}
