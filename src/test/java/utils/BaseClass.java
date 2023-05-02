package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    @Test
    public AndroidDriver<MobileElement> getAndroidDriver() throws MalformedURLException {
        DesiredCapabilities caps =new DesiredCapabilities();
        caps.setCapability("mobileCapabilityType.PLATFORM_NAME","Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"SM J610F");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\Win10\\Desktop\\AppiumWise\\src\\Apps\\Udemy.apk");
        AndroidDriver<MobileElement> driver =  new AndroidDriver<MobileElement>(new URL("http:127.0.0.1:4723/wd/hub"),caps);

       return driver;
    }
}
