package com.resonance.pages;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resonance.config.BaseFramework;
import com.resonance.utility.Keyword;

/**
 * Page Object Model of Dashboard after logging in as Sales_Rep
 * 
 * @author Sandesh
 *
 */

public class DashboardSalesRep {

	@FindBy(xpath = "//span[starts-with(text(), \"Select Customer\")]")
	private WebElement searchBox;

	@FindBy(xpath = "//input[@id=\"s2id_autogen29_search\"]")
	private WebElement searchTxtBox;
	
	@FindBy(xpath = "//*[@id=\"select2-result-label-30\"]")
	private WebElement selectFirstResult;
	
	@FindBy(xpath = "//div[@id=\"s2id_slcustomer\"]")
	private WebElement customerbtn;
	
	
	@FindBy(xpath = "//input[@id=\"s2id_autogen29_search\"]")
	private WebElement customer_jig;
	
	
	//@FindBy(css = "ul.select2-results li[role=\"presentation\"]:nth-child(1)")
	//private WebElement customer_details;
	@FindBy(xpath="//div[@id=\"select2-result-label-33\"]")
	private WebElement customer_details;

	Keyword keyword = null;

	public DashboardSalesRep() {
		BaseFramework base = new BaseFramework();
		PageFactory.initElements(base.thread.get(), this);
		keyword = new Keyword();
	}

	public void clickOnSearchBox() {
		searchBox.click();

	}

	public void searchCustomer(String customerName) {
		searchBox.click();
		searchTxtBox.sendKeys(customerName);

	}
	
	public void selectCustomer(String customerName) {
		searchBox.click();
		searchTxtBox.sendKeys(customerName);
		selectFirstResult.click();
	}
	
	public void clickOnCustomerTab() {
		try {
			customerbtn.click();
		} catch (ElementNotInteractableException e) {
			keyword.waitForElementToBeClickable(customerbtn);
			customerbtn.click();
		}

	}
	public void clickOnCustomer_Jig() {
		try {
			customer_jig.sendKeys("jig");
		} catch (ElementNotInteractableException e) {
			keyword.waitForElementToBeClickable(customer_jig);
			customer_jig.sendKeys("jig");
		}

	}public void clickOnCustomer_Details() {
		try {
			customer_details.click();
		} catch (ElementNotInteractableException e) {
			keyword.waitForElementToBeClickable(customer_details);
			customer_details.click();
		}

	}


}
