package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoPage;
import ultilities.Driver;

import java.time.Duration;

public class Demokadefinitions{
    DemoPage demoPage=new DemoPage();
    @Then("Alerts sekmesine tiklar")
    public void alerts_sekmesine_tiklar() {
        demoPage.alertSekmesi.click();

    }
    @Then("ustten ikinci click me butonuna basar")
    public void ustten_ikinci_click_me_butonuna_basar() {
        demoPage.alertButton.click();

    }
    @Then("Allert in gorunur olmasini bekler")
    public void allert_in_gorunur_olmasini_bekler() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(40));

    }
    @Then("Allert uzerindeki yazinin {string} oldugunu test eder")
    public void allert_uzerindeki_yazinin_oldugunu_test_eder(String string) {

    }
    @Then("Ok diyerek alerti kapatir")
    public void ok_diyerek_alerti_kapatir() {

    }

}
