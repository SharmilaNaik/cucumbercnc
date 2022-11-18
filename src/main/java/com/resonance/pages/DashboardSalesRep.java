package com.resonance.pages;

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

}
