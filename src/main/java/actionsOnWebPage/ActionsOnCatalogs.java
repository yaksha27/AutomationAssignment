package actionsOnWebPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import actionsOnWebPage.XPaths.DressPage;
import runnerPackage.TestRunner;

public class ActionsOnCatalogs extends TestRunner{

	
	public static void clickOnDresses() throws InterruptedException {
		driver.findElement(By.xpath(DressPage.dressesLink)).click();
		Thread.sleep(2000);
	}
	
	public static void clickOnSummerDresses() throws InterruptedException {
		driver.findElement(By.xpath(DressPage.summerDressLink)).click();
		Thread.sleep(3000);
	}
	
	public static boolean verifySummerDressLabel() throws InterruptedException {
		String verifySummerDressLbl = driver.findElement(By.xpath(DressPage.summerDressesLable)).getText();
		System.out.println("Summer Dress Label : " + verifySummerDressLbl);
		if(verifySummerDressLbl.equalsIgnoreCase("Summer Dresses")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void clickOnSortByPrice() throws InterruptedException {
		JavascriptExecutor scrollToSortBy = (JavascriptExecutor) driver;
		scrollToSortBy.executeScript("window.scrollBy(0,575)", "");
		Thread.sleep(2000);
		Select sortByPrice = new Select(driver.findElement(By.xpath(DressPage.selectSortBy)));
		sortByPrice.selectByIndex(1);
		Thread.sleep(6000);
	}
	
	public static boolean verifyIfDressesAreSortedByPrice() {
		ArrayList<WebElement> priceList = (ArrayList<WebElement>) driver.findElements(By.xpath(DressPage.priceList));
		ArrayList<Double> list = new ArrayList<Double>();
		ArrayList<Double> checkTheList = new ArrayList<Double>();
		for(int i = 0; i < priceList.size(); i++) {
			list.add(Double.parseDouble(priceList.get(i).getText().substring(1)));
			checkTheList.add(Double.parseDouble(priceList.get(i).getText().substring(1)));
		}
		boolean flag = false;
		for(int i = 0; i < priceList.size(); i++) {
			for(int j = i+1; j < priceList.size(); j++) {
				if(list.get(i) <= list.get(j)) {
					flag = true;
				}else {
					flag = false;
					System.out.println("The price is not sorted in ascending order");
					break;
				}
			}
		}
		return flag;
		
	}	
}
