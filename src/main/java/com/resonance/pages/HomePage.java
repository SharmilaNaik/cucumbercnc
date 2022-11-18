package com.resonance.pages;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resonance.config.BaseFramework;
import com.resonance.utility.Keyword;

public class HomePage {

	@FindBy(xpath = "//ul[@class='list-inline nav pull-right']/li[2]/div")
	private WebElement loginBtn;

	@FindBy(xpath = "//input[@placeholder=\"Email\"]")
	private WebElement userNameTxtBox;

	@FindBy(xpath = "//input[@type=\"password\"]")
	private WebElement passwordTxtBox;

	@FindBy(xpath = "//button[@value=\"login\"]")
	private WebElement loginSubmitBtn;

	Keyword keyword = null;

	public HomePage() {
		BaseFramework base = new BaseFramework();
		PageFactory.initElements(base.thread.get(), this);
		keyword = new Keyword();
	}

	public void clickOnLogin() {
		try {
			loginBtn.click();
		} catch (ElementNotInteractableException e) {
			keyword.waitForElementToBeClickable(loginBtn);
			loginBtn.click();
		}
	}

	public void enterUserName(String userName) {
		userNameTxtBox.sendKeys(userName);
	}

	public void enterPassword(String password) {
		passwordTxtBox.sendKeys(password);
	}

	public void clickOnLoginSubmit() {
		loginSubmitBtn.click();

	}

//	Author: Sandesh
	public void loginAsManager() {
		clickOnLogin();
		enterUserName("Manager");
		enterPassword("12345678");
		clickOnLoginSubmit();

	}

//	Author: Sandesh
	public void loginAsSalesRep() {
		clickOnLogin();
		enterUserName("Sales_rep");
		enterPassword("12345678");
		clickOnLoginSubmit();

	}

}
