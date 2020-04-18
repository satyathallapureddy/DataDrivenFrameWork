package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverBase {

	WebDriver driver;

	public driverBase(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void launchBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}

	}

}
