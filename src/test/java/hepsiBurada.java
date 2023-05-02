import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class hepsiBurada {
    @Test
   public void setup() throws MalformedURLException, InterruptedException {
      DesiredCapabilities caps=new DesiredCapabilities();
      caps.setCapability("platformName","android");
      caps.setCapability("platformversion","10.0");
      caps.setCapability("devicename","SM J610F");
      caps.setCapability("automationName","UiAutomator2");
      caps.setCapability("app","C:\\Users\\Win10\\Desktop\\AppiumWise\\src\\Apps\\Hepsiburada.apk");
      AndroidDriver<AndroidElement> driver =  new AndroidDriver<AndroidElement>(new URL("http:127.0.0.1:4723/wd/hub"),caps);
       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox")).click();
        driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox")).sendKeys("iphone 14" );
        driver.findElement(By.id("com.pozitron.hepsiburada:id/search_suggestion_title")).click();
        String actualUrun=driver.findElementByAccessibilityId("iphone 14 (10000) Ürün").getText();
        String expectecUrun="iphone 14 (10.000+)";
        Assert.assertEquals(actualUrun,expectecUrun);


    }
}
