package actionsOnWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import actionsOnWebPage.XPaths.*;
import runnerPackage.TestRunner;
public class ActionsToRegisterAUser extends TestRunner {
	
	public static void clickOnSignIn() {
		driver.findElement(By.xpath(signInPage.signInButton)).click();
	}
	
	public static boolean signInVisible() throws InterruptedException {
		Thread.sleep(2000);
		boolean isDisplayed = driver.findElement(By.xpath(signInPage.signInButton)).isEnabled();
		return isDisplayed;
	}
	
	public static boolean authenticationLblVisible() throws InterruptedException {
		Thread.sleep(2000);
		boolean isLblDisplayed = driver.findElement(By.xpath(signInPage.authenticationLbl)).isDisplayed();
		return isLblDisplayed;
	}
	
	public static void enterEmailId(String emailId) throws InterruptedException {
		driver.findElement(By.xpath(signInPage.emailIdTxt)).sendKeys(emailId);
		Thread.sleep(5000);
	}
	
	public static void clickOnCreateAccountBtn() throws InterruptedException {
		driver.findElement(By.xpath(signInPage.createAnAccountBtn)).click();
		Thread.sleep(3000);
	}
	
	public static void selectTitle(String title) throws InterruptedException {
		if(title.equals("Mr")) {
			driver.findElement(By.xpath(ApplicationFormPage.radioBtnMr)).click();
			Thread.sleep(3000);
		}else {
			driver.findElement(By.xpath(ApplicationFormPage.radioBtnMrs)).click();
			Thread.sleep(3000);
		}
	}
	public static void enterFirstNameOfTheUser(String firstName) throws InterruptedException {
		driver.findElement(By.xpath(ApplicationFormPage.firstNameTxt)).sendKeys(firstName);
		Thread.sleep(3000);
	}
	
	public static void enterLastNameOfTheUser(String lastName) throws InterruptedException {
		driver.findElement(By.xpath(ApplicationFormPage.lastNameTxt)).sendKeys(lastName);
		Thread.sleep(3000);
	}
	
	public static void enterPassword(String password) throws InterruptedException {
		driver.findElement(By.xpath(ApplicationFormPage.passwordTxt)).sendKeys(password);
		Thread.sleep(3000);
	}
	
	public static void selectDateOfDOB(String date) throws InterruptedException {
		Select dateDropDown = new Select(driver.findElement(By.xpath(ApplicationFormPage.daysDropDown)));
		dateDropDown.selectByValue(date);
		Thread.sleep(3000);
	}
	
	public static void selectMonthOfDOB(int month) throws InterruptedException {
		Select monthDropDown = new Select(driver.findElement(By.xpath(ApplicationFormPage.monthsDropDown)));
		monthDropDown.selectByIndex(month);;
		Thread.sleep(3000);
	}
	
	public static void selectYearOfDOB(String year) throws InterruptedException {
		Select yearDropDown = new Select(driver.findElement(By.xpath(ApplicationFormPage.yearsDropDown)));
		yearDropDown.selectByValue(year);
		Thread.sleep(3000);
	}
	
	public static void enterAddress(String address) throws InterruptedException {
		JavascriptExecutor scrollDownThePage = (JavascriptExecutor) driver;
		scrollDownThePage.executeScript("arguments[0].scrollIntoView", driver.findElement(By.xpath(ApplicationFormPage.phoneNumTxt)));
		Thread.sleep(2000);
		driver.findElement(By.xpath(ApplicationFormPage.addressLineTxt)).sendKeys(address);
		Thread.sleep(3000);
	}
	
	public static void enterCity(String city) throws InterruptedException {
		driver.findElement(By.xpath(ApplicationFormPage.cityTxt)).sendKeys(city);
		Thread.sleep(3000);
	}
	
	public static void selectState(String state) throws InterruptedException {
		Select stateDropDown = new Select(driver.findElement(By.xpath(ApplicationFormPage.stateDropDown)));
		stateDropDown.selectByVisibleText(state);
		Thread.sleep(3000);
	}
	
	public static void enterZipCode(String zipCode) throws InterruptedException {
		driver.findElement(By.xpath(ApplicationFormPage.zipCodeTxt)).sendKeys(zipCode);
		Thread.sleep(3000);
	}
	
	public static void enterMobileNumber(String mobileNumber) throws InterruptedException {
		driver.findElement(By.xpath(ApplicationFormPage.phoneNumTxt)).sendKeys(mobileNumber);
		Thread.sleep(3000);
	}
	
	public static void clickOnRegister() throws InterruptedException {
		JavascriptExecutor scrollDownThePage = (JavascriptExecutor) driver;
		scrollDownThePage.executeScript("arguments[0].scrollIntoView", driver.findElement(By.xpath(ApplicationFormPage.registerBtn)));
		Thread.sleep(2000);
		driver.findElement(By.xpath(ApplicationFormPage.registerBtn)).click();
		Thread.sleep(3000);
	}
	
	public static void enterInvalidEmailId(String invalidEmailId) throws InterruptedException {
		driver.findElement(By.xpath(signInPage.emailIdTxt)).sendKeys(invalidEmailId);
		Thread.sleep(3000);
	}
	
	public static boolean verifyInvalidEmailAlert() {
		boolean alertPresent = driver.findElement(By.xpath(signInPage.invalidEmailAlert)).isDisplayed();
		return alertPresent;
	}
}
