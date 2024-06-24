package stepDefinitionAndroid;

import Android.goToHomePage;
import io.cucumber.java.en.Given;

import java.net.URISyntaxException;

public class goToHomePageStep {
    goToHomePage homePageCommand = new goToHomePage();

    @Given("^I want to go to Home Page by Next$")
    public void go_to_home_page_step_next() throws URISyntaxException {
        homePageCommand.verifyGoToHomePageByNext();
    }

    @Given("^I want to go to Home Page by Skip$")
    public  void go_to_home_page_step_skip() throws URISyntaxException {
        homePageCommand.verifyGoToHomePageBySkip();
    }
}
