package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MedunnaMainPage;


public class US006 {
    MedunnaMainPage mainPage = new MedunnaMainPage();
    @And("Kullanici menusu butonuna tiklar")
    public void kullaniciMenusuButonunaTiklar() {
        mainPage.userMenusu.click();

    }

    @And("Settings butonuna tiklar")
    public void settingsButonunaTiklar() {
        mainPage.settings.click();
    }

    @Then("Kullanici bilgilerinin dogrulugunu test eder")
    public void kullaniciBilgilerininDogrulugunuTestEder() {
        String userFirstNameText= mainPage.userFirstName.getText();
        Assert.assertEquals("info", userFirstNameText);
        String userLastNameText= mainPage.userLastName.getText();
        Assert.assertEquals("tech", userLastNameText);
        String userEmailText= mainPage.userEmail.getText();
        Assert.assertEquals("infotech@medunna.com", userEmailText);

    }

    @Then("Firstname, lastname ve Email guncelleme seceneginin oldugunu kontrol eder")
    public void firstnameLastnameVeEmailGuncellemeSecenegininOldugunuKontrolEder() {
    }


}
