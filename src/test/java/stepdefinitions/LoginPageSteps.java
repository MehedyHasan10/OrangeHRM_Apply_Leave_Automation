package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageSteps {
    private final LoginPage loginPage = new LoginPage();
    
    @Given("User is on the OrangeHRM login page")
    public void isLoginPageDisplayed() {
        loginPage.state().isDisplayed();
    }
    
    @When("User enters username {string}")
    public void enterUserName(String userName) {
        loginPage.enterUserName(userName);
    }
    
    @And("User enters password {string}")
    public void enterUserPassword(String password) {
        loginPage.enterUserPassword(password);
    }

    @And("User clicks on login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }
}
