package com.massmutualtest.pages;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;

import com.massmutualtest.details.DriverDetails;

public class PortalPage {

	public static ResourceBundle rb = ResourceBundle.getBundle("application");
	public static WebDriver driver;

	public void lauchPortal() {
		driver = DriverDetails.getDriverInfo();
		String url = rb.getString("url");
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void closeBrowser() {
		driver.quit();
	}

}
