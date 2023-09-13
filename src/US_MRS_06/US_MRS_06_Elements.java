package US_MRS_06;

import Utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_MRS_06_Elements {

    public US_MRS_06_Elements(){

        PageFactory.initElements(BaseDriverParameter.driver, this);
    }

    @FindBy(xpath = "//div[class='logo']]")
    public WebElement loginHtml;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(css = " li[id='Laboratory']")
    public WebElement Laboratory;

    @FindBy(xpath = "//input[@id='loginButton']")
    public WebElement loginButton;

    @FindBy(css="a[id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']")
    public WebElement FindPatientRecord;


    @FindBy(xpath = ("//input[@id='patient-search']")
            public WebElement searchBox;












}
