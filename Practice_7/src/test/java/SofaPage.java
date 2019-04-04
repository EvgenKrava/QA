import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.List;

public class SofaPage {
    private WebDriver driver;

    @FindBy(xpath = ".//*[@class=\"popular\"]")
    private WebElement populars;

    SofaPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public List<String> getTopPopularNames(){
        driver.findElement(By.xpath(".//*[@class=\"popular\"]")).click();
        List<String> s = new ArrayList<String>();
        List<WebElement> populars = driver.findElements(By.xpath(".//*[@class=\"catalog-block-head\"]"));
        for (int i = 0; i < populars.size(); i++) {
            s.add(populars.get(i).getText());
        }
        return s;
    }
}
