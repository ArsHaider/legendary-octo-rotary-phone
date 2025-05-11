package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    @Given("user is able to access the HRMS application")
    public void user_is_able_to_access_the_hrms_application() {
        OpenBrowserLaunchApplication();
    }

    @When("user enters valid login username and password")
    public void user_enters_valid_login_username_and_password() {
        sendText(ConfigReader.read("username"), loginPage.usernameField);
        sendText(ConfigReader.read("password"), loginPage.passwordField);
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        click(loginPage.loginButton);
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        System.out.println("Test passed");
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        sendText("random", loginPage.usernameField);
        sendText("random", loginPage.passwordField);
    }

    @Then("user is able to see error message")
    public void user_is_able_to_see_error_message() {
        String errorMessage = loginPage.errormessage.getText();
        Assert.assertEquals(errorMessage, "Invalid credentials");
        System.out.println("error is shown");

        Assert.assertTrue(loginPage.errormessage.isDisplayed());
    }

}
