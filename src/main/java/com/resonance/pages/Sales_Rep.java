package com.resonance.pages;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resonance.config.BaseFramework;
import com.resonance.utility.Keyword;

public class Sales_Rep {

	@FindBy(xpath = "//div[@id=\"s2id_slcustomer\"]")
	private WebElement add_Tab;

	@FindBy(xpath = "//input[@id=\"s2id_autogen29_search\"]")
	private WebElement customer_Tab;

	Keyword keyword = null;

	public Sales_Rep() {
		BaseFramework base = new BaseFramework();
		PageFactory.initElements(base.thread.get(), this);
		keyword = new Keyword();
	}

	public void addTab() {
		try {
			add_Tab.click();
		} catch (ElementNotInteractableException e) {
			keyword.waitForElementToBeClickable(add_Tab);
			add_Tab.click();
		}
	}

	public void customer() {
		try {
			customer_Tab.click();
		} catch (ElementNotInteractableException e) {
			keyword.waitForElementToBeClickable(customer_Tab);
			customer_Tab.click();
		}
	}

}
