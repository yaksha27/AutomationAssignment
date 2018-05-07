package stepImplementations;

import org.junit.Assert;

import actionsOnWebPage.ActionsOnCatalogs;
import cucumber.api.java.en.*;

public class SortByPriceValidation {
	
	@And("^verify if Dresses are sorted according to their price in ascending order$")
	public void verify_if_Dresses_are_sorted_according_to_their_price_in_ascending_order() throws InterruptedException {
		ActionsOnCatalogs.clickOnSortByPrice();
		Assert.assertEquals(true, ActionsOnCatalogs.verifyIfDressesAreSortedByPrice());
		System.out.println("The price is sorted in ascending order");
	}

}
