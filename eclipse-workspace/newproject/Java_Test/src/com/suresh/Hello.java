package com.suresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hello {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/LENOVO/Downloads/chromedriver-win32 (1)/chromedriver-win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
//		driver.quit();
	}

}
