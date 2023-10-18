package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuappPage;

public class HerokuappStepdefinitions {

    HerokuappPage herokuappPage= new HerokuappPage();




    @When("Add Element butona basar")
    public void add_element_butona_basar() {
        herokuappPage.addElementButonu.click();

    }
    @When("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        //buton implicitly wait suresi icerisinde gorunur oldugundan
        // bu adimda kod yazilmadi

    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButonu.isDisplayed());


    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokuappPage.deleteButonu.click();

    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
        try {

            if (herokuappPage.deleteButonu.isDisplayed()){
                Assert.assertTrue(false);
            }
        } catch (NoSuchElementException e) {
            Assert.assertTrue(true);
        }

    }
}