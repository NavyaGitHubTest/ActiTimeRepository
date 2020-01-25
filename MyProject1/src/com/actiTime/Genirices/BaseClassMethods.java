package com.actiTime.Genirices;

import org.openqa.selenium.WebDriver;

public class BaseClassMethods
{

	static
	{
		System.setProperty("webdriver.chrome.driver",  ".//DriverExe//chromedriver.exe"); 
		System.setProperty("webdriver.gecko.driver",  ".//DriverExe//geckodriver.exe");
		System.setProperty("webdriver.ie.driver", ".//DriverExe//IEDriverServer.exe");
	}
	
	public WebDriver driver;
	
}
