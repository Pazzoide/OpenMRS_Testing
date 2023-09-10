package Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MyFunction {
    public static void Bekle(int sn){
        try {
            Thread.sleep(sn*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void TakeScreenShot(WebDriver driver) throws Exception {
        SimpleDateFormat tarihFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date date = new Date();
        TakesScreenshot ss = (TakesScreenshot) driver;
        String tarih = tarihFormat.format(date);
        File screenShot = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShot, new File("src/screenshots/screenshot_" + tarih + ".png"));
    }
    public static int RandomGenerator(int Limit){
        return (int)(Math.random()*Limit);
    }
    public static boolean ListContainsString(List<WebElement> List, String Aranan){
        boolean Bulundu = false;
        for (WebElement X : List){
            if (X.getText().toLowerCase().equals(Aranan.toLowerCase())){
                Bulundu = true;
                break;
            }
        }
        return Bulundu;
    }
}
