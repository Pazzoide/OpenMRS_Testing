package US_MRS_10;

import Utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_MRS_10_Elements {

    public US_MRS_10_Elements() {

        PageFactory.initElements(BaseDriverParameter.driver ,this);
    }

    @FindBy(xpath = "//div[@class=\"zak-header-button zak-header-button--1\"]")
    public WebElement demo;

    @FindBy(xpath = "//a[@href='#openmrs2']")
    public WebElement expOpenMRS2;

    @FindBy(xpath = "//*[contains(@href,'https://demo.openmrs.org/openmrs/login.htm')]")
    public WebElement expOpenMRS2Demo;

    @FindBy(xpath = "//*[contains(@placeholder,'Enter your username')]")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passWord;

    @FindBy(xpath = "//input[@id='loginButton']")
    public WebElement loginButton;

    @FindBy(css = "ul[id='sessionLocation'] li")
    public List<WebElement> location;

    @FindBy(id = "appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension")
    public WebElement AppointmentScheduling;

    @FindBy(id = "appointmentschedulingui-manageAppointments-app")
    public WebElement ManageAppointments;

    @FindBy(id = "patient-search")
    public WebElement ManageAppointmentsSerch;

    @FindBy(css = "tbody tr td")//*[@class='odd']
    public WebElement ManageAppointmentsSerchClick;

    @FindBy(xpath = "//*[text()=' Your computer is not set to the right time zone. Please change to Coordinated Universal Time and then close and restart your browser to assure proper scheduling functionality.']")
    public WebElement noteError;

}
