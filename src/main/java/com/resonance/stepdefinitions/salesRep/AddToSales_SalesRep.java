package com.resonance.stepdefinitions.salesRep;

import com.resonance.pages.HomePage;
import com.resonance.pages.Sales_Rep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToSales_SalesRep {
	
	Sales_Rep sp=new Sales_Rep();
	
	@Given("user logs into the system as sales rep")
	public void user_logs_into_the_system_as_sales_rep() {
		HomePage hp= new HomePage();
		hp.loginAsSalesRep();
	}

	@When("user clickon add sales Tab")
	public void user_clickon_add_sales_tab() throws InterruptedException {
	    sp.addTab();
	    Thread.sleep(3000);
	    
	}

	@Then("customer details should be display")
	public void customer_details_should_be_display() throws InterruptedException {
		sp.customer();
		Thread.sleep(3000);
	}


}
