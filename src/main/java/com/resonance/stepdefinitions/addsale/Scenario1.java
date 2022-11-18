package com.resonance.stepdefinitions.addsale;

import com.resonance.pages.DashboardSalesRep;
import com.resonance.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Scenario1 {

	DashboardSalesRep dsr = new DashboardSalesRep();
	
	@Given("User Logs in as a Sales Representative")
	public void loginAsSalesRep() {
		HomePage home = new HomePage();
		home.loginAsSalesRep();
	}
	
	@Then("User Searches for a Customer and clicks on the First Result")
	public void searchCustomer() {	
		dsr.selectCustomer("Jig");

	}

}
