package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPhysicianPage {
    public MedunnaPhysicianPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[normalize-space()='Physician']") public WebElement createNewPhysicianButton;
    @FindBy(xpath = "//input[@id='useSSNSearch']") public WebElement useSearchCheckBox;
    @FindBy(xpath = "//input[@id='searchSSN']") public WebElement searchSSN;
    @FindBy(xpath = "//button[normalize-space()='Search User']") public WebElement searchUserButton;
    @FindBy(xpath = "//input[@id='physician-firstName']") public WebElement physicianUserName;
    @FindBy(xpath = "//input[@id='physician-lastName']") public WebElement physicianLastName;
    @FindBy(xpath = "//select[@id='physician-gender']") public WebElement physicianGender;
    @FindBy(xpath = "//select[@id='physician-speciality']") public WebElement physicianSpeciality;
    @FindBy(xpath = "//select[@id='physician-bloodGroup']") public WebElement physicianBloodGroup;
    @FindBy(xpath = "//div[@role='alert']") public WebElement userFoundAlert;






}
