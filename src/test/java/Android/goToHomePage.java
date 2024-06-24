package Android;

import baseCommand.commonPageAndroid;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;

import java.net.URISyntaxException;

public class goToHomePage extends commonPageAndroid {
    public void verifyGoToHomePageByNext() throws URISyntaxException {
        commonPageAndroid command = new commonPageAndroid();
        command.startAndroidApp();
        command.clickAndroidElementByXpath("//android.widget.Button[@resource-id=\"com.studiobluelime.ecommerceapp:id/btn_next\"]\n");
        command.clickAndroidElementByXpath("//android.widget.Button[@resource-id=\"com.studiobluelime.ecommerceapp:id/btn_next\"]\n");
        command.clickAndroidElementByXpath("//android.widget.Button[@resource-id=\"com.studiobluelime.ecommerceapp:id/btn_next\"]\n");
        command.assertElementText("//android.widget.TextView[@text=\"eCommerce App\"]\n", "eCommerce App");
    }

    public void verifyGoToHomePageBySkip() throws URISyntaxException {
        commonPageAndroid command = new commonPageAndroid();
        command.startAndroidApp();
        command.clickAndroidElementByXpath("//android.widget.Button[@resource-id=\"com.studiobluelime.ecommerceapp:id/btn_skip\"]\n");
        command.assertElementText("//android.widget.TextView[@text=\"eCommerce App\"]\n", "eCommerce App");
    }
}
