package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MedunnaMainPage;

public class US010 {
    MedunnaMainPage mainPage = new MedunnaMainPage();
    @And("Items&titles butonuna tiklar")
    public void itemsTitlesButonunaTiklar() {
        mainPage.itemsTitles.click();
    }

    @And("Appointments butonuna tiklar")
    public void appointmentsButonunaTiklar() {
        mainPage.appointment.click();
    }

    @Then("randevu listesi ve zaman dilimleri oldugunu kontrol eder")
    public void randevuListesiVeZamanDilimleriOldugunuKontrolEder() {
        Assert.assertTrue(mainPage.randevuListesi.isDisplayed());
        Assert.assertTrue(mainPage.randevuZamanDilimiBaslangic.isDisplayed());
        Assert.assertTrue(mainPage.randevuZamanDilimiBitis.isDisplayed());

    }

    @Then("patient id, start date, end date ve status bilgileri oldugunu kontrol eder")
    public void patientIdStartDateEndDateVeStatusBilgileriOldugunuKontrolEder() {
        Assert.assertTrue(mainPage.appointmentPatientID.isDisplayed());
        Assert.assertTrue(mainPage.appointmentStartDate.isDisplayed());
        Assert.assertTrue(mainPage.appointmentEndDate.isDisplayed());
        Assert.assertTrue(mainPage.appointmentStatus.isDisplayed());



    }
}
