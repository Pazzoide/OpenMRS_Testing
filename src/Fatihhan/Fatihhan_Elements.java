package Fatihhan;

import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fatihhan_Elements {
    public Fatihhan_Elements() {
        PageFactory.initElements(BaseDriverParameter.driver, this);
    }
    @FindBy(css = "a[class='zak-button']")
    public WebElement DemoButton;
    @FindBy(xpath = "//span[@class='elementor-button-text' and text()='Explore OpenMRS 2']")
    public WebElement ExploreOpenMRS2_button;
    @FindBy(xpath = "//span[@class='elementor-button-text' and text()='Enter the OpenMRS 2 Demo']/../..")
    public WebElement EnterTheOpenMRS2_button;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(css = "input[id='loginButton']")
    public WebElement loginButton;
    @FindBy(id = "sessionLocationError")
    public WebElement YouMustChoose_a_Location;
    @FindBy(css = " li[id='Laboratory']")
    public WebElement LaboratoryLocation;
    @FindBy(id = "error-message")
    public WebElement InvalidUsernameError;
    @FindBy(css = "li[class='nav-item identifier']")
    public WebElement LoginControl;

    @FindBy(linkText = "Logout")
    public WebElement LogoutButton;


}
