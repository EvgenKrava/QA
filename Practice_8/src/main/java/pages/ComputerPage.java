package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[text()=\"IT услуги            \"]")
    private WebElement ITService;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div/div[1]/ul/li[1]/a/span")
    private WebElement returnHomePage;

    public ComputerPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage returnHomePage(){
        returnHomePage.click();
        return new HomePage(driver);
    }

    public String getTextITService(){
        return ITService.getText();
    }
}
