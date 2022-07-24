package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;
import utilities.Driver;

public class MedunnaMainPage {

    public MedunnaMainPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath="//a[@class='appointment-btn scrollto']")
    public WebElement makeAnAppointment;
    @FindBy(xpath="//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signInRegister;


    @FindBy(xpath="//input[@id='appoDate']") public WebElement appoDate;

    @FindBy(xpath="//span[normalize-space()='Appointment date can not be past date!']") public WebElement appointmentDateCanNotBePa;






    @FindBy(xpath="//input[@id='firstName']")
    public WebElement firstName;
    @FindBy (xpath ="//input[@class= 'is-touched is-dirty av-valid form-control' and @id='firstName']")
    public WebElement nameVerification;

    @FindBy(xpath="//input[@id='ssn']")
    public WebElement SSN;
    @FindBy (xpath ="//input[@class= 'is-touched is-dirty av-valid form-control' and @id='ssn']")
    public WebElement ssnVerification;


    @FindBy(xpath="//input[@id='lastName']")
    public WebElement lastName;
    @FindBy (xpath ="//input[@class= 'is-touched is-dirty av-valid form-control' and @id='lastName']")
    public WebElement lastNameVerification;

    @FindBy(xpath="//input[@id='email']")
    public WebElement email;
    @FindBy (xpath ="//input[@class= 'is-touched is-dirty av-valid form-control' and @id='email']")
    public WebElement emailVerification;

    @FindBy(xpath="//input[@id='phone']")
    public WebElement phone;
    @FindBy (xpath ="//input[@class= 'is-touched is-dirty av-valid form-control' and @id='phone']")
    public WebElement phoneVerification;


    @FindBy(xpath="//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement openSignIn;
    @FindBy(xpath="//a[@id='login-item']")
    public WebElement SignIn;
    @FindBy(xpath="//input[@id='username']")
    public WebElement username;

    @FindBy(xpath="//input[@class='is-touched is-dirty av-valid form-control']")
    public WebElement usernameVerification;

    @FindBy(xpath="//input[@id='password']")
    public WebElement password;
    @FindBy(xpath="//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement SigInButton;

    @FindBy(xpath="//span[normalize-space()='Administration']")
    public WebElement administration;

    @FindBy(xpath ="(//span[normalize-space()='info tech'])[1]" )
    public WebElement userMenusu;

    @FindBy(xpath = "//span[normalize-space()='Settings']")
    public WebElement settings;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement userFirstName;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement userLastName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement userEmail;

    @FindBy(xpath = "//span[normalize-space()='Save']")
    public WebElement userSettingsSave;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement userDatesUpdatedVerification;

    @FindBy(xpath = "//span[normalize-space()='Items&Titles']")
    public WebElement itemsTitles;

    @FindBy(xpath = "//span[normalize-space()='Appointment']")
    public WebElement appointment;

    @FindBy(xpath ="//table[@class='table']")
    public WebElement randevuListesi;

    @FindBy(xpath = "//span[normalize-space()='Start DateTime']")
    public WebElement randevuZamanDilimiBaslangic;

    @FindBy(xpath = "//span[normalize-space()='End DateTime']")
    public WebElement randevuZamanDilimiBitis;

    @FindBy(xpath = "//a[normalize-space()='2301']")
    public WebElement appointmentPatientID;

    @FindBy(xpath = "//span[normalize-space()='15/12/21 01:00']")
    public WebElement appointmentStartDate;

    @FindBy(xpath = "//span[normalize-space()='17/12/21 02:00']")
    public WebElement appointmentEndDate;

    @FindBy(xpath = "(//span[contains(text(),'COMPLETED')])[1]")
    public WebElement appointmentStatus;

    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement appointmentViewButton;

    @FindBy(css = "div[class='col-md-8'] h2 b")
    public WebElement appointmentIDView;

    @FindBy(css = "dd:nth-child(21)")
    public WebElement appointmentStartDateView;

    @FindBy(css = "dd:nth-child(4)")
    public WebElement appointmentEndDateView;

    @FindBy(css = "dd:nth-child(16)")
    public WebElement appointmentDescriptionView;

    @FindBy(css = "dd:nth-child(6)")
    public WebElement appointmentStatusView;

    @FindBy(css = "dd:nth-child(22)")
    public WebElement appointmentPatientView;

    @FindBy(css = "css dd:nth-child(18)")
    public WebElement appointmentCreateDateView;

    @FindBy(xpath = "(//span[contains(text(),'Edit')])[1]")
    public WebElement appointmentEditButton;

    @FindBy(xpath = "//input[@id='appointment-id']")
    public WebElement appointmentIDEdit;

    @FindBy(xpath = "(//input[@id='appointment-startDate']")
    public WebElement appointmentStartDateEdit;

    @FindBy(xpath = "(//input[@id='appointment-endDate']")
    public WebElement appointmentEndDateEdit;

    @FindBy(xpath = "(//textarea[@id='appointment-description']")
    public WebElement appointmentDescriptionEdit;

    @FindBy(xpath = "(//select[@id='appointment-status']")

    public WebElement appointmentStatusEdit;

    @FindBy(xpath = "//select[@id='appointment-patient']")
    public WebElement appointmentEPatientEdit;























}
