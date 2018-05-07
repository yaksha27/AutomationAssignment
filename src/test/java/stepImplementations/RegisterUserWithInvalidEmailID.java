package stepImplementations;

import org.junit.Assert;
import actionsOnWebPage.ActionsToRegisterAUser;
import cucumber.api.java.en.*;
import runnerPackage.TestRunner;

public class RegisterUserWithInvalidEmailID extends TestRunner {
	
	@And("^User enters invalid email ID$")
	public void User_enters_invalid_email_ID() throws InterruptedException {
		ActionsToRegisterAUser.enterInvalidEmailId("73uygd7w83");	
	}
	
	
	@Then("^an error should pop up$")
	public void an_error_should_pop_up() throws Throwable {
		Assert.assertEquals(true, ActionsToRegisterAUser.verifyInvalidEmailAlert());
	}
}
