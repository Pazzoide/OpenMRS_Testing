package US_MRS_06;

import Utility.BaseDriverParameter;
import Utility.MyFunction;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_MRS_06 extends BaseDriverParameter {


    @Test(groups = "PatientManagement")

    public void HastaListesindeArama_Test_06(){

        US_MRS_06_Elements e =new US_MRS_06_Elements();

        driver.get("https://demo.openmrs.org/openmrs/login.htm");

        MyFunction.Bekle(2);

        e.username.sendKeys("admin");
        e.password.sendKeys("Admin123");
        e.Laboratory.click();
        e.loginButton.click();
        e.FindPatientRecord.click();
        e.searchBox.sendKeys("Ali Cabbar"+ Keys.ENTER);

        Assert.assertTrue(e.searchBox.getText(),"Ali Cabbar", "Aranan hasta bulunamadı!"");

        e.searchBox.clear();
        e.searchBox.sendKeys("Veli Cabbar"+Keys.ENTER);


















        Finish();
    }
}
