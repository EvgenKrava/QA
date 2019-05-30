import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ComputerPage;
import pages.HomePage;
import pages.SofaPage;

import java.util.List;


class StepsForSerenity {
    private HomePage homePage;

    private WebDriver driver;

    private ComputerPage computerPage;

    private SofaPage sofaPage;

    private String siteHomePage = "https://pn.com.ua/";

    @Step("Given the user visit a page https://pn.com.ua/")
    public void a_user_visits_a_page(String homePage){
        this.siteHomePage = homePage;
    }

    @Step("When the user chooses category Computer")
    public void the_user_chooses_category_Computer(){
        System.setProperty("webdriver.chrome.driver","/home/evgen/IdeaProjects/QA/Practice_8/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get(siteHomePage);
        computerPage = homePage.choiceComputerCategory();
    }

    @Step("Then the user sees IT Service subcategory")
    public void the_user_can_see_subcategory_ITSesvice(String subCategory){
        assert(computerPage.getTextITService().contains(subCategory));
        driver.close();
    }

    @Step("When the user chooses category Sofa")
    public void the_user_chooses_category_Sofa() {
        System.setProperty("webdriver.chrome.driver","/home/evgen/IdeaProjects/QA/Practice_8/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get(siteHomePage);
        sofaPage = homePage.choiceSofaCategory();
    }

    @Step("Then the user sees Top popular subcategory")
    public void the_user_can_see_sofas(){
        List<String> s = sofaPage.getTopPopularNames();
        System.out.println(s);
        for (String st:s) {
            assert(st.contains("AMF"));
        }
        driver.close();
    }
}
