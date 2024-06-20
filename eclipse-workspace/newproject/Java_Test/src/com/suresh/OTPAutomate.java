package com.suresh;

import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OTPAutomate {
	
	

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver", "C:/Users/LENOVO/Downloads/edgedriver_win64/msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C://Users//LENOVO//Downloads//chromedriver-win64 (2)//chromedriver-win64//chromedriver.exe");
		
		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

	
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, 10);
	
	
		driver.get("https://otp.dev/en/login/start/");
		driver.manage().window().maximize();
		
		Set<String> windowHandles = driver.getWindowHandles();

		Iterator<String> it = windowHandles.iterator();
		String parentId = it.next();
//		String childId = it.next();
		
//		driver.switchTo().window(childId);
//		System.out.println(driver.findElement(By.xpath("//div[@class='example']")).getText());
		Thread.sleep(3000);
//		driver.switchTo().window(parentId)
		
//		Duration implicitWaitDuration = Duration.ofSeconds(10);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@class='btn btn-primary btn-block btn-lg mb-6']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("suresh@acenet.io");
		driver.findElement(By.xpath("//button[@name='Send OTP']")).click();
		Thread.sleep(5000);
	
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/LENOVO/Downloads/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		
		
		
		driver1.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=19&ct=1704802174&rver=7.0.6738.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3da2e3b64d-ed5a-1aa6-3912-fd8df2a4e78e&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
		
		driver1.manage().window().maximize();
		Thread.sleep(10000);
		driver1.findElement(By.xpath("//*[@class='form-control ltr_override input ext-input text-box ext-text-box']")).sendKeys("suresh@acenet.io");
		Thread.sleep(3000);
		driver1.findElement(By.xpath("//*[@id='idSIButton9']")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath("//*[@class='form-control input ext-input text-box ext-text-box']")).sendKeys("Avusula@1234");
		Thread.sleep(5000);
		driver1.findElement(By.xpath("//*[@id='idSIButton9']")).click();
		Thread.sleep(3000);
		driver1.findElement(By.xpath("//*[@id='idSIButton9']")).click();
		Thread.sleep(10000);
		
		Thread.sleep(3000);
		driver1.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div/div[3]/div/div/div[1]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div")).click();		
		Thread.sleep(3000);
		
		WebElement Otp = driver1.findElement(By.xpath("//span[@class='x_code']"));
	
		String Otpelemet = Otp.getText();
		System.out.println("fetched OTP :: " + Otpelemet);
		driver1.close();
		

//		Pattern pattern = Pattern.compile("\\d+");
//		Matcher matcher = pattern.matcher(Otpelemet);
//		
//		
//		String numericValue = null;
//		while (matcher.find()) {
//		    numericValue = matcher.group();
//		}
//		
		Thread.sleep(3000);

//		driver.switchTo().window(parentId);
		
	
		driver.findElement(By.xpath("//input[@name='pin']")).sendKeys(Otpelemet);
		driver.findElement(By.xpath("//button[@name='Verify OTP']")).click();
		
	
	return;		
	}
	
	
//	private static String parseOTP(String content) {
//		String otpPattern = "\\b\\d{6}\\b";
//		Matcher matcher = Pattern.compile(otpPattern).matcher(content);
//		if(matcher.find()) {
//			return matcher.group();
//	
//		}
//		return null;
//	}
//	

}
