package com.resonance.stepdefinitions;

import org.testng.Assert;

import com.resonance.pages.HomePage;
import com.resonance.utility.Keyword;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PickerListSteps {
	
	@Given("User logs in to the application as manager")
	public void loginToTheApplication() {
		HomePage home = new HomePage();
		home.loginAsManager();
		
	}
	
	@When("Manager select picking option")
	public void selectPickingOption() {
		
	}
	
	@Then("Manager should see details of picking list")
	public void verifyPickingList() {
		Assert.assertEquals(false, false);
		
	}
	
	

}
