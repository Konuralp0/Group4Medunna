package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MedunnaMainPage;
import pages.MedunnaRegisterPage;

public class US002 {
    MedunnaMainPage mainPage = new MedunnaMainPage();
    MedunnaRegisterPage registerPage = new MedunnaRegisterPage();

    @And("username kutusuna uygun username girer")
    public void usernameKutusunaUygunUsernameGirer() {
        mainPage.username.sendKeys("12*,abc");
    }

    @Then("hata mesajinin cikmadigini test eder.")
    public void hataMesajininCikmadiginiTestEder() {
        Assert.assertTrue(mainPage.usernameVerification.isDisplayed());
    }

    @And("tarayiciyi kapatir.")
    public void tarayiciyiKapatir() {
    }

    @And("Email kutusuna uygun Email adresi girer")
    public void emailKutusunaUygunEmailAdresiGirer() {
    }

    @Then("Email adresi hata mesaji cikmadigini test eder")
    public void emailAdresiHataMesajiCikmadiginiTestEder() {

        Assert.assertTrue(mainPage.emailVerification.isDisplayed());



    }
}
