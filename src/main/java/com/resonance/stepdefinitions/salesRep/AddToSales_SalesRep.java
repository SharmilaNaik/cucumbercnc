package com.resonance.stepdefinitions.salesRep;

import com.resonance.pages.DashboardSalesRep;
import com.resonance.pages.HomePage;
import com.resonance.pages.Sales_Rep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToSales_SalesRep {
	
	HomePage hp=new HomePage();
	DashboardSalesRep dsr=new DashboardSalesRep(); 
	
	@Given("user logs into the system as sales rep")
	public void user_logs_into_the_system_as_sales_rep() {
		HomePage hp= new HomePage();
		hp.loginAsSalesRep();
		
	}

	@When("user clickon add customer tab")
	public void user_clickon_add_sales_tab() {
	    dsr.clickOnCustomerTab();   
	}
	
	@Then("user select customer jig")
	public void user_clickOn_Jig()  {
	    dsr.clickOnCustomer_Jig();
	    
	    
	}
	@Then("customer details should be display")
	public void customer_details_should_be_display() throws InterruptedException {
		Thread.sleep(3000);
		dsr.clickOnCustomer_Details();
		Thread.sleep(3000);
	}


}
