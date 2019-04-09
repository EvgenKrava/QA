import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(value = SerenityRunner.class)
public class TestSerenity {

    private String siteHomePage = "https://pn.com.ua/";

    @Steps
    StepsForSerenity stepsForSerenity;

    @Test
    public void verifySubCategory(){
        //GIVEN
        stepsForSerenity.a_user_visits_a_page(siteHomePage);

        //WHEN
        stepsForSerenity.the_user_chooses_category_Computer();

        //THEN
        stepsForSerenity.the_user_can_see_subcategory_ITSesvice("IT услуги");
    }

    @Test
    public void verifySofaCount(){
        //GIVEN
        stepsForSerenity.a_user_visits_a_page(siteHomePage);

        //WHEN
        stepsForSerenity.the_user_chooses_category_Sofa();

        //THEN
        stepsForSerenity.the_user_can_see_sofas();
    }
}
