package com.massmutualtest.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class SolWorkObjPage extends PortalPage {

	public SolWorkObjPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[starts-with(@id,'lbl_val')]")
	private List<WebElement> listOfValues;

	@FindBy(xpath = "//*[starts-with(@id,'txt_val')]")
	private List<WebElement> listOfAmounts;

	@FindBy(id = "lbl_ttl_val")
	private WebElement totalBalance;

	@FindBy(id = "txt_ttl_val")
	private WebElement totalBalanceAmount;

	// Methods for mock page
	public void verifyMockPage() {
		if (totalBalance.isDisplayed()) {
			Reporter.log("Mock page opend sucessfully");
		} else {

			Reporter.log("Unable to open Mock page sucessfully");

		}
	}

	public void verifyAmmounts() {

		Assert.assertTrue(listOfAmounts.size() > 0, "Ammounts are not displayed in page");

	}

	public void countOfValuesAmounts(int count) {

		Assert.assertTrue(listOfValues.size() == count && listOfAmounts.size() == count,
				"Values count =" + listOfValues.size() + " and Ammounts count " + listOfAmounts.size()
						+ " Values and Amounts counts are not matching");

	}

	public void amountsGreaterThanZero() {

		for (WebElement webElementAmount : listOfAmounts) {
			String amount = webElementAmount.getAttribute("value");
			String newAmount = amount.replaceAll("[$,]", "");
			Assert.assertTrue(Float.parseFloat(newAmount) > 0, newAmount + " is lessthan or equal to zero");

		}

	}

	public void amountsCurrency(String currency) {

		for (WebElement webElementAmount : listOfAmounts) {
			String amount = webElementAmount.getAttribute("value");
			Assert.assertTrue(amount.startsWith(currency), amount + " is not having $ as currency");

		}

	}
	
	public void totalAmountBalance() {
		float totalAccountBalance = 0F;
		String totalBalanceAmountValue = totalBalanceAmount.getAttribute("value");
		float totalBalanceAmount = Float.parseFloat(totalBalanceAmountValue.replaceAll("[$,]", ""));
		for (WebElement webElementAmount : listOfAmounts) {
			String amount = webElementAmount.getAttribute("value");
			float newAmount = Float.parseFloat(amount.replaceAll("[$,]", ""));
			totalAccountBalance = totalAccountBalance+newAmount;
		}
		Assert.assertEquals(totalBalanceAmount, totalAccountBalance,"Toatl balance amount matches the Total account balance ");

	}
}
