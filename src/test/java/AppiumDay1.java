import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDay1 {
  @Test
          public void test01() throws MalformedURLException {
   DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
 desiredCapabilities.setCapability("platformName","Android");
 desiredCapabilities.setCapability("platformVersion","10.0");
 desiredCapabilities.setCapability("deviceName","SM J610F");
 desiredCapabilities.setCapability("automationName","UiAutomator2");
 desiredCapabilities.setCapability("app","C:\\Users\\Win10\\Desktop\\AppiumWise\\src\\Apps\\HM.apk");
    AndroidDriver<AndroidElement> driver =  new AndroidDriver<AndroidElement>(new URL("http:127.0.0.1:4723/wd/hub"),desiredCapabilities);
     // driver.findElementById("com.google.android.calculator:id/digit_9").click();
     // driver.findElementById("com.google.android.calculator:id/op_add").click();
    //  driver.findElementById("com.google.android.calculator:id/digit_5").click();
    //  driver.findElementById("com.google.android.calculator:id/eq").click();
      driver.findElementByAccessibilityId("7").click();
      driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"2\"]").click();


    }
}







