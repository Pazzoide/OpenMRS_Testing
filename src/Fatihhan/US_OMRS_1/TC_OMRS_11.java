package Fatihhan.US_OMRS_1;

import Fatihhan.Fatihhan_Elements;
import Utility.BaseDriverParameter;
import Utility.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_OMRS_11 extends BaseDriverParameter {
    @Test(groups = "smoke")
    public void Sisteme_Giris_Hatalarini_Kontrol_Etmek() {
        Fatihhan_Elements e = new Fatihhan_Elements();
        driver.get("https://openmrs.org/demo/");

        wait.until(ExpectedConditions.elementToBeClickable(e.DemoButton)).click();
        e.ExploreOpenMRS2_button.click();
        e.EnterTheOpenMRS2_button.click();

        wait.until(ExpectedConditions.visibilityOf(e.username)).sendKeys("aaaaa");
        e.password.sendKeys("aaaaa");
        e.loginButton.click();

        Assert.assertEquals(e.YouMustChoose_a_Location.getText(), "You must choose a location!", "Beklenen ile oluşan aynı değil");


        e.LaboratoryLocation.click();
        e.loginButton.click();

        Assert.assertEquals(e.InvalidUsernameError.getText(), "Invalid username/password. Please try again.", "Beklenen ile oluşan aynı değil");

        e.username.sendKeys("admin");
        e.password.sendKeys("Admin123");
        e.LaboratoryLocation.click();
        e.loginButton.click();


    }
}
