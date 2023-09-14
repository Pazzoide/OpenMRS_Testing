package US_OMRS_09;

import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC_OMRS_09_Elements {

    public TC_OMRS_09_Elements() {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }
    @FindBy(css = "[id='sessionLocation']>li")
    public List<WebElement> locations;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "loginButton")
    public WebElement loginButton;
    @FindBy(css = "[class='icon-user']")
    public WebElement registerPatient;
    @FindBy(css = "[name='givenName']")
    public WebElement given;
    @FindBy(css = "[name='familyName']")
    public WebElement familyName;
    @FindBy(id = "next-button")
    public WebElement nextButton;
    @FindBy(css = "[value='M']")
    public WebElement genderMale;
    @FindBy(id = "next-button")
    public WebElement nextButton1;
    @FindBy(id = "birthdateDay-field")
    public WebElement day;
    @FindBy(id = "birthdateMonth-field")
    public WebElement month;
    @FindBy(id = "birthdateYear-field")
    public WebElement year;
    @FindBy(id = "next-button")
    public WebElement nextButton2;
    @FindBy(id = "address1")
    public WebElement adress;
    @FindBy(id = "cityVillage")
    public WebElement city;
    @FindBy(id = "stateProvince")
    public WebElement state;
    @FindBy(id = "country")
    public WebElement country;
    @FindBy(id = "postalCode")
    public WebElement postalCode;
    @FindBy(id = "next-button")
    public WebElement nextButton3;
    @FindBy(css = "[name='phoneNumber']")
    public WebElement phoneNumber;
    @FindBy(id = "next-button")
    public WebElement nextButton4;
    @FindBy(id = "relationship_type")
    public WebElement relationshipType;
    @FindBy(css = "[placeholder='Person Name']")
    public WebElement personName;
    @FindBy(id = "next-button")
    public WebElement nextButton5;
    @FindBy(id = "submit")
    public WebElement submitButton;
    @FindBy(css = "[class='col-12 col-sm-auto']")
    public WebElement nameControl;
    @FindBy(xpath = "//ul[@id='breadcrumbs']//li[1]")
    public WebElement mainMenu;
    @FindBy(css = "[class='icon-user']")
    public WebElement registerPatient2;
    @FindBy(css = "[name='givenName']")
    public WebElement given2;
    @FindBy(css = "[name='familyName']")
    public WebElement familyName2;
    @FindBy(id = "next-button")
    public WebElement nextBtn;
    @FindBy(css = "[value='F']")
    public WebElement genderMale2;
    @FindBy(id = "next-button")
    public WebElement nextBtn1;
    @FindBy(id = "birthdateDay-field")
    public WebElement day2;
    @FindBy(id = "birthdateMonth-field")
    public WebElement month2;
    @FindBy(id = "birthdateYear-field")
    public WebElement year2;
    @FindBy(id = "next-button")
    public WebElement nextBtn2;
    @FindBy(id = "address1")
    public WebElement adress2;
    @FindBy(id = "cityVillage")
    public WebElement city2;
    @FindBy(id = "stateProvince")
    public WebElement state2;
    @FindBy(id = "country")
    public WebElement country2;
    @FindBy(id = "postalCode")
    public WebElement postalCode2;
    @FindBy(id = "next-button")
    public WebElement nextBtn3;
    @FindBy(css = "[name='phoneNumber']")
    public WebElement phoneNumber2;
    @FindBy(id = "next-button")
    public WebElement nextBtn4;
    @FindBy(id = "next-button")
    public WebElement nextBtn5;
    @FindBy(id = "submit")
    public WebElement submitButton2;
    @FindBy(css = "[class='col-12 col-sm-auto']")
    public WebElement nameControl2;
    @FindBy(xpath = "//ul[@id='breadcrumbs']//li[1]")
    public WebElement mainMenu2;
    @FindBy(css = "[class='icon-hdd']")
    public WebElement dataManagement;
    @FindBy(css = "[class='icon-group']")
    public WebElement mergePatient;
    @FindBy(id = "patient-search")
    public WebElement patientSearch1;
    @FindBy(css = "[class='odd']")
    public WebElement merge1;
    @FindBy(id = "patient-search")
    public WebElement patientSearch2;
    @FindBy(css = "[class='odd']")
    public WebElement merge2;
    @FindBy(id = "confirm-button")
    public WebElement continueButton;
    @FindBy(css = "[class='row identifiers'] > div")
    public List<WebElement> idler1;
    @FindBy(id = "second-patient")
    public WebElement secondPatient;
    @FindBy(id = "confirm-button")
    public WebElement continueButton2;
    @FindBy(css = "[class='float-sm-right'] > span")
    public List<WebElement> idler2;









}
