package com.massmutualtest.details;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverDetails {
	
	public static ResourceBundle rb = ResourceBundle.getBundle("application");
	public static WebDriver driver;
	
	public static WebDriver getDriverInfo() {
		String browser = rb.getString("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", rb.getString("webdriver.chrome.driver"));
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", rb.getString("webdriver.gecko.driver"));
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	
}
