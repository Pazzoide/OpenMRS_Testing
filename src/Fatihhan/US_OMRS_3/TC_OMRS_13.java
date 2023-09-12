package Fatihhan.US_OMRS_3;

import Fatihhan.Fatihhan_Elements;
import Utility.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_OMRS_13 extends BaseDriverParameter {

    @Test(groups = "smoke")
    public void Sistemden_Cikis() {
        Fatihhan_Elements e = new Fatihhan_Elements();
        driver.get("https://openmrs.org/demo/");

        wait.until(ExpectedConditions.elementToBeClickable(e.DemoButton)).click();
        e.ExploreOpenMRS2_button.click();
        e.EnterTheOpenMRS2_button.click();

        wait.until(ExpectedConditions.visibilityOf(e.username));

        e.username.sendKeys("admin");
        e.password.sendKeys("Admin123");
        e.LaboratoryLocation.click();
        e.loginButton.click();

        Assert.assertEquals(e.LoginControl.getText(), "admin", "Beklenen ile oluşan aynı değil");

        e.LogoutButton.click();

        Assert.assertTrue(e.username.isDisplayed(), "Çıkış yapma hatası");
    }
}
