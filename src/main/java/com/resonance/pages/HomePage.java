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
	private WebElement userNameTxtBx;

	@FindBy(xpath = "//input[@type=\"password\"]")
	private WebElement passwordTxtBx;

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
		userNameTxtBx.sendKeys(userName);
	}

	public void enterPassword(String password) {
		passwordTxtBx.sendKeys(password);
	}

	private void loginAsManager() {
		// TODO Auto-generated method stub

	}

}
