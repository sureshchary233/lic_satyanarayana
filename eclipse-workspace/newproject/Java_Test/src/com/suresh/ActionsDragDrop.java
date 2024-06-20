package com.suresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragDrop {

//.....................................................//not working.........................................................

	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/LENOVO/Downloads/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");



		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		Actions a = new Actions(driver);
	
		WebElement source = driver.findElement(By.xpath("img[alt='The chalet at the Green mountain lake']"));
		WebElement target = driver.findElement(By.cssSelector("div[id='trash']"));
		
		a.dragAndDrop(source, target).build().perform();
		
}
}