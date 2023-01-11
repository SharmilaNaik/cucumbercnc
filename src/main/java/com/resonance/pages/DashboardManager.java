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
	@FindBy(xpath="(//span[contains(text(),'Picking')])[1]")
	private WebElement picking_tab;
	
	@FindBy(xpath="//span[text()=' Short QTY']")
	private WebElement short_Qty;
	
	public void clickOnPickingtab() {
		picking_tab.click();

	}
	public void shortqty() {
		short_Qty.click();

	}
	
	@FindBy(xpath="//*[@id=\"picking_confirm_picked_order\"]/a/span")
	private WebElement confirm_picked_order;
	  
	@FindBy(xpath="//input[@id='start_date']")
	private WebElement form_date;
	
	@FindBy(xpath="//input[@id='start_date']")
	private WebElement select_date;
	
	
	public void pickingtab() {
		picking_tab.click();
		 
	}
	
	public void confirmpickedordertab() {
 		confirm_picked_order.click();

	}
	 public void clickOnFromDate() {
		 form_date.click();
	 }
	
	public void selectDateFromDropDown() {
		select_date.sendKeys("01/01/2023");
		
	}
}

	

