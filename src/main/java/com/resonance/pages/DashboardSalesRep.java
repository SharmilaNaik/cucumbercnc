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
	@FindBy(xpath="(//ul/li/div/span[@class='select2-match'])[1]")
	private WebElement customer_details;
	
	
	@FindBy(xpath="//a[@href=\"https://qa-cnc.rameesystems.com/admin/sales/customer_histry/2\"]")
	private WebElement view_Tab;
	
	@FindBy(xpath="//a[@href=\"https://qa-cnc.rameesystems.com/admin/sales/view/19\"]")
	private WebElement order_ID;
	
	@FindBy(xpath="//button[@onclick=\"window.print();\"]")
	private WebElement print_Btn;

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

	}
	public void clickOnCustomer_Details() {
		try {
			customer_details.click();
		} catch (ElementNotInteractableException e) {
			keyword.waitForElementToBeClickable(customer_details);
			customer_details.click();
		}

	}
	public void clickOn_View() {
		try {
			view_Tab.click();
		} catch (ElementNotInteractableException e) {
			keyword.waitForElementToBeClickable(view_Tab);
			view_Tab.click();
		}

	}
	public void clickOn_OrderID() {
		try {
			order_ID.click();
		} catch (ElementNotInteractableException e) {
			keyword.waitForElementToBeClickable(order_ID);
			order_ID.click();
		}

	}
	public void clickOn_PrintBtn() {
		try {
			print_Btn.click();
		} catch (ElementNotInteractableException e) {
			keyword.waitForElementToBeClickable(print_Btn);
			print_Btn.click();
		}

	}


}
