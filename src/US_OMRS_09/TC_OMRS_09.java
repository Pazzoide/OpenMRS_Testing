package US_OMRS_09;

import Utility.BaseDriverParameter;
import Utility.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class TC_OMRS_09 extends BaseDriverParameter {
    @Test(groups = "Regression")

    public void mergeTest() {
        TC_OMRS_09_Elements e = new TC_OMRS_09_Elements();

        driver.get("https://demo.openmrs.org/openmrs/login.htm");

        int randomSecim = MyFunction.RandomGenerator(e.locations.size());
        e.locations.get(randomSecim).click();
        e.username.sendKeys("admin");
        e.password.sendKeys("Admin123");
        e.loginButton.click();
        e.registerPatient.click();
        e.given.sendKeys("Cenk");
        e.familyName.sendKeys("Tosun");
        e.nextButton.click();
        e.genderMale.click();
        e.nextButton1.click();
        e.day.sendKeys("10");
        Select select = new Select(e.month);
        select.selectByIndex(4);
        e.year.sendKeys("2000");
        e.nextButton2.click();
        e.adress.sendKeys("Kemalpasa caddesi No : 12");
        e.city.sendKeys("Bursa");
        e.state.sendKeys("Kemalpasa");
        e.country.sendKeys("Türkiye");
        e.postalCode.sendKeys("009091");
        e.nextButton3.click();
        e.phoneNumber.sendKeys("0900910890");
        e.nextButton4.click();
        Select select1 = new Select(e.relationshipType);
        select1.selectByVisibleText("Doctor");
        e.personName.sendKeys("Devlet Bahceli");
        e.nextButton5.click();
        e.submitButton.click();
        SoftAssert softAssert1 = new SoftAssert();
        softAssert1.assertEquals("Cenk Tosun",e.nameControl,"Kayit ismi Dogrulanmadi!!");
        e.mainMenu.click();
        e.registerPatient2.click();
        e.given2.sendKeys("Alara");
        e.familyName2.sendKeys("Demir");
        e.nextBtn.click();
        e.genderMale2.click();
        e.nextBtn1.click();
        e.day2.sendKeys("20");
        Select select2 = new Select(e.month2);
        select2.selectByIndex(6);
        e.year2.sendKeys("2002");
        e.nextBtn2.click();
        e.adress2.sendKeys("Cumhuriyet caddesi No : 12");
        e.city2.sendKeys("Ankara");
        e.state2.sendKeys("Mamak");
        e.country2.sendKeys("Türkiye");
        e.postalCode2.sendKeys("06600");
        e.nextBtn3.click();
        e.phoneNumber2.sendKeys("088080080");
        e.nextBtn4.click();
        e.nextBtn5.click();
        e.submitButton2.click();
        SoftAssert softAssert2 = new SoftAssert();
        softAssert2.assertEquals("Alara Demir",e.nameControl2,"Kayit Ismi Dogru Degil!!");
        e.mainMenu2.click();
        e.dataManagement.click();
        e.mergePatient.click();
        e.patientSearch1.sendKeys("Cenk Tosun");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='odd']")));
        e.merge1.click();
        MyFunction.Bekle(2);
        e.patientSearch2.clear();
        e.patientSearch2.sendKeys("Alara Demir");
        wait.until(ExpectedConditions.textToBe(By.cssSelector("[class='odd'] >:nth-child(2)"),"Alara Demir"));
        e.merge2.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("confirm-button")));
        e.continueButton.click();
        e.secondPatient.click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        e.continueButton2.click();
        SoftAssert softAssert3 = new SoftAssert();
        softAssert3.assertEquals(e.idler1,e.idler2,"ID ler tutmuyor");






















    }

}
