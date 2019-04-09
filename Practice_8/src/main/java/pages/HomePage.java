package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(xpath = ".//*[@id='column-center']/section/div[1]/a")
    private WebElement computerCategory;

    @FindBy(xpath = ".//*[@id='column-center']/section/div[6]/a")
    private WebElement buildingCategory;

    @FindBy(xpath = "//*[@title=\"Диваны для гостинной\"]")
    private WebElement sofaCategory;

    public HomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public ComputerPage choiceComputerCategory(){
        computerCategory.click();
        return new ComputerPage(driver);
    }

    public SofaPage choiceSofaCategory(){
        sofaCategory.click();
        return  new SofaPage(driver);
    }
}
