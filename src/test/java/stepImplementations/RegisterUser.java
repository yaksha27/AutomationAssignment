package stepImplementations;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import runnerPackage.TestRunner;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import actionsOnWebPage.ActionsToRegisterAUser;

public class RegisterUser extends TestRunner{

	
	@Given("^user has opened the Retail Web-site and Sign in is visible$")
	public void user_has_opened_the_Retail_Web_site_and_Sign_in_is_visible() throws Throwable {
		String currentWorkingDirectory = System.getProperty("user.dir");
		System.out.println("CWD : " + currentWorkingDirectory);
		System.setProperty("webdriver.chrome.driver", currentWorkingDirectory+"\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		Assert.assertEquals(true,ActionsToRegisterAUser.signInVisible());
	}

	@When("^Click on Sign in button$")
	public void click_on_Sign_in_button() throws Throwable {
		ActionsToRegisterAUser.clickOnSignIn();
	}
	
	@Then("^Authentication Page is displayed$")
	public void authentication_Page_is_displayed() throws Throwable {
		Assert.assertEquals(true,ActionsToRegisterAUser.authenticationLblVisible());
	}
	@And("^User enters valid email ID \"([^\"]*)\"$")
	public void user_enters_valid_email_ID(String emailID) throws Throwable {
		ActionsToRegisterAUser.enterEmailId(emailID);
	}
	
	@And("^Clicks on Create Account Button$")
	public void clicks_on_Create_Account_Button() throws Throwable {
		ActionsToRegisterAUser.clickOnCreateAccountBtn();
	}
	
	@And("^select the title \"([^\"]*)\"$")
	public void select_the_title(String title) throws Throwable {
		ActionsToRegisterAUser.selectTitle(title);
	}
	
	@And("^enter first name \"([^\"]*)\"$")
	public void enter_first_name(String firstName) throws Throwable {
		ActionsToRegisterAUser.enterFirstNameOfTheUser(firstName);
	}
	
	@And("^enter last name \"([^\"]*)\"$")
	public void enter_last_name(String lastName) throws Throwable {
		ActionsToRegisterAUser.enterLastNameOfTheUser(lastName);
	}
	
	@And("^enter password \"([^\"]*)\"$")
	public void enter_password(String password) throws Throwable {
		ActionsToRegisterAUser.enterPassword(password);
	}
	
	@And("^select date \"([^\"]*)\"$")
	public void select_date(String date) throws Throwable {
		ActionsToRegisterAUser.selectDateOfDOB(date);
	}
	
	@And("^select month (\\d+)$")
	public void select_month(int month) throws Throwable {
		ActionsToRegisterAUser.selectMonthOfDOB(month);
	}
	
	@And("^select year \"([^\"]*)\"$")
	public void select_year(String year) throws Throwable {
		ActionsToRegisterAUser.selectYearOfDOB(year);
	}
	
	@And("^enter address \"([^\"]*)\"$")
	public void enter_address(String address) throws Throwable {
		ActionsToRegisterAUser.enterAddress(address);
	}
	
	@And("^enter city \"([^\"]*)\"$")
	public void enter_city(String city) throws Throwable {
		ActionsToRegisterAUser.enterCity(city);
	}
	
	@And("^select state \"([^\"]*)\"$")
	public void select_state(String state) throws Throwable {
		ActionsToRegisterAUser.selectState(state);
	}
	
	@And("^enter zip code \"([^\"]*)\"$")
	public void enter_zip_code(String zipCode) throws Throwable {
		ActionsToRegisterAUser.enterZipCode(zipCode);
	}
	
	@And("^enter phone number \"([^\"]*)\"$")
	public void enter_phone_number(String phoneNumber) throws Throwable {
		ActionsToRegisterAUser.enterMobileNumber(phoneNumber);
	}
	@Then("^click on register button$")
	public void click_on_register_button() throws InterruptedException {		
		ActionsToRegisterAUser.clickOnRegister();
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}
}

