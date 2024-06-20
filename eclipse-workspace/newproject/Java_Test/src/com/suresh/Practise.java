package com.suresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Practise {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/LENOVO/Downloads/chromedriver-win64 (2)/chromedriver-win64/chromedriver.exe");



		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("checkBoxOption2")).click();
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//div[@class='right-align']/fieldset/label[2]")).getText();
		System.out.println(text);
		
		
		WebElement OP2 = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

		Select dropdown = new Select(OP2);
		dropdown.selectByVisibleText(text);		
	
		
		driver.findElement(By.cssSelector("input[class='inputs']")).sendKeys(text);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		
		System.out.println("Option 2 is available :"+driver.switchTo().alert().getText().contains(text));	
		
	}
	
	
}