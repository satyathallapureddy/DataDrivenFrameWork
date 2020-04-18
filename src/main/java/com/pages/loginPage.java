package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	// Instantiate the driver

	WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	// properties of elements
	private By usernameTextbox = By.id("email");
	private By passwordTextbox = By.id("pass");
	private By signInBtn = By.id("u_0_b");

	// Enter userName
	public void enterUserName(String userName) {
		driver.findElement(usernameTextbox).sendKeys(userName);
	}

	// Enter passWord
	public void enterpassWord(String password) {
		driver.findElement(passwordTextbox).sendKeys(password);
	}

	// click SignIn button
	public void clickSignInbtn() {
		driver.findElement(signInBtn).click();
	}

	// login
	public void Login(String userName, String password) {
		enterUserName(userName);
		enterpassWord(password);
		clickSignInbtn();

	}

}
