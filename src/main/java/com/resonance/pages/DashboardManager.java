package com.resonance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resonance.config.BaseFramework;
import com.resonance.utility.Keyword;

public class DashboardManager {
	Keyword keyword= null;
	
	public DashboardManager() {
		BaseFramework base = new BaseFramework();
		PageFactory.initElements(base.thread.get(), this);
		keyword = new Keyword();
	}
	@FindBy(xpath="//span[text()=' Picking                 ']")
	private WebElement picking_tab;
	
	@FindBy(xpath="//span[text()=' Short QTY']")
	private WebElement short_Qty;
	
	public void clickOnPickingtab() {
		picking_tab.click();

	}
	public void shortqty() {
		short_Qty.click();

	}
	
}
