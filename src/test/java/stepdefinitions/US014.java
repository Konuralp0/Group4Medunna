package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaMainPage;

import java.util.List;

public class US014 {
    MedunnaMainPage mainPage=new MedunnaMainPage();
    @And("View butonuna tiklar")
    public void viewButonunaTiklar() {
        mainPage.appointmentViewButton.click();

    }

    @Then(value = "istenilen bilgilerin goruntulendigini kontrol eder")
    public void istenilenBilgilerinGoruntulendiginiKontrolEder() {

        Assert.assertTrue(mainPage.appointmentIDView.isDisplayed());
        Assert.assertTrue(mainPage.appointmentStartDateView.isDisplayed());
        Assert.assertTrue(mainPage.appointmentEndDateView.isDisplayed());
        Assert.assertTrue(mainPage.appointmentDescriptionView.isDisplayed());
        Assert.assertTrue(mainPage.appointmentCreateDateView.isDisplayed());
        Assert.assertTrue(mainPage.appointmentStatusView.isDisplayed());
        Assert.assertTrue(mainPage.appointmentPatientView.isDisplayed());

    }

    @And("Edit butonuna tiklar")
    public void editButonunaTiklar() {
        mainPage.appointmentEditButton.click();
    }

    @Then("istenilen bilgilerin guncellenebildigini kontrol eder")
    public void istenilenBilgilerinGuncellenebildiginiKontrolEder() {
        Assert.assertTrue(mainPage.appointmentIDEdit.isDisplayed());
        Assert.assertTrue(mainPage.appointmentStartDateEdit.isDisplayed());
        Assert.assertTrue(mainPage.appointmentEndDateEdit.isDisplayed());
        Assert.assertTrue(mainPage.appointmentDescriptionEdit.isDisplayed());
        Assert.assertTrue(mainPage.appointmentStatusEdit.isDisplayed());
        Assert.assertTrue(mainPage.appointmentEPatientEdit.isDisplayed());

    }

    @Then("Status un guncellenebildigini kontrol eder")
    public void statusUnGuncellenebildiginiKontrolEder() {

        String[] statusType = {"UNAPPROVED, DISCHARGED, STILL, STAYING, CANCELLED"};
        Select appointmentStatus =new Select(mainPage.appointmentStatusEdit);

        List<WebElement> status = appointmentStatus.getOptions();
        for (WebElement condition:status) {
            boolean match = false;
            for (int i=0; i<statusType.length; i++){
                if (condition.getText().equals(statusType[i])){
                    match = true;
                }
            }
            Assert.assertTrue(match);

        }

        }



    }

