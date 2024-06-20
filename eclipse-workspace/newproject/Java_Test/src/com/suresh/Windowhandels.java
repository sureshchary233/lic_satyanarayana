package com.suresh;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Windowhandels {
	


	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/LENOVO/Downloads/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");

//		window handle and getting the text from both the pages

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/windows");
		
	
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windowHandles = driver.getWindowHandles();

		Iterator<String> it = windowHandles.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
		Thread.sleep(3000);
		driver.switchTo().window(parentId);
		
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
	
	
	}

}
