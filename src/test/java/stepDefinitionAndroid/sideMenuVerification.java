package stepDefinitionAndroid;

import Android.verifySideMenu;
import io.cucumber.java.en.Then;

public class sideMenuVerification {
    verifySideMenu sideMenuCommand = new verifySideMenu();
    @Then("^I verify Menu Items$")
    public void verify_menu_item() {
        sideMenuCommand.sideMenuItemVerify();
    }
}
