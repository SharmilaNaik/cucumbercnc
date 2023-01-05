package com.resonance.stepdefinitions.shortqty;

import com.resonance.pages.DashboardManager;
import com.resonance.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Shortqty {
	
	DashboardManager dm= new DashboardManager();
	@Given("user login as manager")
	
	public void loginManager() {
		HomePage hp= new HomePage();
		hp.loginAsManager();
	}
	
	@When("user click on picking Tab")
	public void pickingtab() throws InterruptedException {
		dm.clickOnPickingtab();
		Thread.sleep(3000);
	}
	
		
	@Then("short QTY page should be display")
	public void shortqty() {
		dm.shortqty();

	}
	}
		