import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {

    private WebDriver driver;
    @FindBy(xpath = ".//*[@id=\'column-center\']/section/div[4]/article[3]/div/div")
    private WebElement ITService;

    public ComputerPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public String getTextITService(){
        return ITService.getText();
    }
}
