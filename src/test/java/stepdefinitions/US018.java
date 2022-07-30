package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaAdminItemsAndTitles;
import pages.MedunnaMainPage;
import pages.MedunnaPhysicianPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US018 {
    MedunnaMainPage mainPage = new MedunnaMainPage();
    MedunnaPhysicianPage physicianPage = new MedunnaPhysicianPage();
    MedunnaAdminItemsAndTitles medunnaAdminItemsAndTitles=new MedunnaAdminItemsAndTitles();
    @And("Physicians menusune giris yapar")
    public void physiciansMenusuneGirisYapar() {
        medunnaAdminItemsAndTitles.physicianButton.click();
        Driver.wait(2);
    }

    @Then("Create a new Physician butonuna tiklar")
    public void createANewPhysicianButonunaTiklar() {
        physicianPage.createNewPhysicianButton.click();
        Driver.wait(2);
    }

    @Given("Use Search kutusunu isaretle")
    public void useSearchKutusunuIsaretle() {
        physicianPage.useSearchCheckBox.click();
        Driver.wait(2);
    }

    @And("Istenilen kisinin SSN kimligini girer")
    public void istenilenKisininSSNKimliginiGirer() {
        physicianPage.searchSSN.sendKeys("321-48-7891");
        Driver.wait(2);
    }

    @And("Search User butonuna tiklar")
    public void searchUserButonunaTiklar() {
        physicianPage.searchUserButton.click();
        Driver.wait(2);
    }

    @Then("Verilerin goruntulendigini kontrol eder")
    public void verilerinGoruntulendiginiKontrolEder() {
        Assert.assertTrue(physicianPage.userFoundAlert.isDisplayed());


    }

    @Given("Speciality butonua tiklar")
    public void specialityButonuaTiklar() {
    }

    @Then("Speciality secebildigini kontrol eder")
    public void specialitySecebildiginiKontrolEder() {
    }

    @Given("Exam fee butonuna tiklar")
    public void examFeeButonunaTiklar() {
    }

    @Then("Exam fee girilebildigini kontrol eder")
    public void examFeeGirilebildiginiKontrolEder() {
    }

    @And("Fotograg yukleme butonuna tiklar")
    public void fotogragYuklemeButonunaTiklar() {
    }

    @Then("Fotograg yuklenebilirligini kontrol eder")
    public void fotogragYuklenebilirliginiKontrolEder() {
    }

    @Given("Admin olaral giris yapilir")
    public void adminOlaralGirisYapilir() {
        mainPage.signInRegister.click();
        mainPage.signIn.click();
        mainPage.username.sendKeys(ConfigReader.getProperty("infoTech") + Keys.TAB);
        mainPage.password.sendKeys(ConfigReader.getProperty("Admin123.")+Keys.TAB);
        mainPage.sigInButton.click();
        Driver.wait(2);

    }

    @Then("adi soyadi dogum tarihi vb bilgilerinin oldugunu test eder")
    public void adiSoyadiDogumTarihiVbBilgilerininOldugunuTestEder() {
        Assert.assertTrue(physicianPage.physicianUserName.isDisplayed());
        Assert.assertTrue(physicianPage.physicianLastName.isDisplayed());
        Assert.assertTrue(physicianPage.physicianGender.isDisplayed());
        Assert.assertTrue(physicianPage.physicianSpeciality.isDisplayed());
        Assert.assertTrue(physicianPage.physicianBloodGroup.isDisplayed());
    }
}
