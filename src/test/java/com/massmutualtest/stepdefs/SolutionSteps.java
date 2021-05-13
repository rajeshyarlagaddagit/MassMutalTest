package com.massmutualtest.stepdefs;

import com.massmutualtest.pages.SolWorkObjPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SolutionSteps {
	
	SolWorkObjPage solWorkObjPage = new SolWorkObjPage();
	
	@Given("^user navigated to mockpage$")
	public void user_navigated_to_mockpage() {
		solWorkObjPage.verifyMockPage();	
	}
	
	@When("^amounts are present in mockpage$")
	public void amounts_are_present_in_mockpage()  {
		solWorkObjPage.verifyAmmounts();	
	}
	
	@Then("^count of values should be \"([^\"]*)\"$")
	public void count_of_values_should_be(int count) {
		solWorkObjPage.countOfValuesAmounts(count);	
	}
	
	@Then("^amounts should be greater than zero$")
	public void amounts_should_be_greater_than_zero()  {
		solWorkObjPage.amountsGreaterThanZero();	
	}
	
	@Then("^amounts should be displayed as currencies \"([^\"]*)\"$")
	public void amounts_should_be_displayed_as_currencies(String currency) {
		solWorkObjPage.amountsCurrency(currency);	
	}
	
	@Then("^total balance must be equal to sum of the amounts$")
	public void total_balance_must_be_equal_to_sum_of_the_amounts()  {
		solWorkObjPage.totalAmountBalance();	
	}
}
