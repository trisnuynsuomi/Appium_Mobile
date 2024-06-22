import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class launchApp {
    public static void main(String[] args){
    }

    public AndroidDriver driverAndroid;
    @Test
    public void startAndroidApp() throws URISyntaxException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("appium:appPackage", "com.android.settings");
        capabilities.setCapability("appium:appActivity", ".Settings");

        try {
            driverAndroid = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    public IOSDriver driverIOS;
    public void startIOSApp(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    }
}
