package Android;
import baseCommand.commonPageAndroid;
import org.testng.annotations.Test;

import java.net.URISyntaxException;

public class verifySideMenu extends commonPageAndroid  {
    commonPageAndroid command = new commonPageAndroid();
    goToHomePage homePageCommand = new goToHomePage();
    @Test
    public void sideMenuItemVerify() throws URISyntaxException {
        homePageCommand.verifyGoToHomePageByNext();
        command.clickAndroidElementByXpath("//android.widget.ImageButton[@content-desc=\"App\"]\n");
        String[] menuItems = {"New Arrivals", "Sale", "Filter", "My Account", "Cart", "Notifications", "Share App", "Info", "Social", "Contact Us" };
        for (String menuItem : menuItems) {
            var el = "//android.widget.CheckedTextView[@resource-id=\"com.studiobluelime.ecommerceapp:id/design_menu_item_text\" and @text=\"" + menuItem + "\"]\n";
            command.waitForElementToVisible(el);
            command.assertElementText(el, menuItem);
        }
    }
}
