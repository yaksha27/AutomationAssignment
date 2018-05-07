package stepImplementations;

import actionsOnWebPage.ActionsOnCatalogs;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class MegaMenuValidation {
	
	
	@Then("^click on Dresses$")
	public void click_on_Dresses() throws Throwable {
		ActionsOnCatalogs.clickOnDresses();
	}

	@Then("^Click on Summer Dresses$")
	public void click_on_Summer_Dresses() throws Throwable {
		ActionsOnCatalogs.clickOnSummerDresses();
	}
	@Then("^verify if summer dresses catalog is visible$")
	public void verify_if_summer_dresses_catalog_is_visible() throws Throwable {
		Assert.assertEquals(true, ActionsOnCatalogs.verifySummerDressLabel());
	}

}
