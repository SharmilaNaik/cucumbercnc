package com.resonance.stepdefinitions.confirmpickedorder;

import com.resonance.pages.DashboardManager;
import com.resonance.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConfirmPickedOrder {
	DashboardManager dmm = new DashboardManager();
	//WebDriver driver=new ChromeDriver();

	@Given("user login as manager")
	public void loginasmanager() {
		HomePage home = new HomePage();
		home.loginAsManager();
	}

	@When("user click on Picking tab")
	public void picking() throws InterruptedException {
		dmm.pickingtab();
		Thread.sleep(1000);
	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	}


	@Then("user click on ConfirmPickedOrder tab")
	public void confirmpickedorder() {
		
		dmm.confirmpickedordertab();
		
	}
	@Then("click on from date tab")
	public void clickOnFromDate() throws InterruptedException {
		Thread.sleep(3000);
		dmm.clickOnFromDate();
	}
	@Then("select date from table")
	public void selectDate() {
		dmm.selectDateFromDropDown();
	}
}


