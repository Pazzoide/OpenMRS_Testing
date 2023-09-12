package US_MRS_10;

import Utility.BaseDriverParameter;
import Utility.MyFunction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US_MRS_10 extends BaseDriverParameter {


    @Test(dataProvider = "patientname")

      public void Test(String patientName){

        US_MRS_10_Elements elements = new US_MRS_10_Elements();
        SoftAssert _softAssert=new SoftAssert();

        elements.demo.click();
        elements.expOpenMRS2.click();
        MyFunction.Bekle(2);
        wait.until(ExpectedConditions.elementToBeClickable(elements.expOpenMRS2Demo)).click();
        MyFunction.Bekle(2);
        elements.userName.sendKeys("Admin");
        elements.passWord.sendKeys("Admin123");
        int randomSecim=MyFunction.randomGenerator(elements.location.size());
        wait.until(ExpectedConditions.elementToBeClickable(elements.location.get(randomSecim))).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.loginButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.AppointmentScheduling)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.ManageAppointments)).click();
        elements.ManageAppointmentsSerch.sendKeys(patientName);
        wait.until(ExpectedConditions.elementToBeClickable(elements.ManageAppointmentsSerchClick)).click();

        _softAssert.assertTrue(elements.noteError.getText().contains(
                "Your computer is not set to the right time zone. " +
                        "Please change to Coordinated Universal Time and then close and restart " +
                        "your browser to assure proper scheduling functionality."),"Sistem saat dilimi UTC+0 (GMT+O) olarak ayarlı");

        System.out.println(elements.noteError.getText());
    }
        @DataProvider
        public Object[] patientname(){
            Object[] name={"Ramirez"};
            return name;
        }


}
