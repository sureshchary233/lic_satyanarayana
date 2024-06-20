package com.suresh;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.chrome.ChromeOptions;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.miv.pherd.ntree.CellData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.util.set.Array;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().driverVersion("124.0.6367.119").setup();
//		System.setProperty("webdriver.edge.driver", "C:/Users/LENOVO/Downloads/edgedriver_win64/msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/LENOVO/Downloads/chromedriver-win32 (1)/chromedriver-win32/chromedriver.exe");

//		WebDriver driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

	
		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		long timeoutInSeconds = 10;
		driver.manage().timeouts().implicitlyWait(timeoutInSeconds, TimeUnit.SECONDS);

	
		driver.get("https://uat.bg.thejo-engg.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("TEST_BGReq");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Thejo@0823	");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/div/form/div[3]/button")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/img")).click();
		Thread.sleep(2000);

		
		
		LocalDate today = LocalDate.now();
		
		LocalDate date15DaysAgo = today.minusDays(15);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
		String date15DaysAgoString = date15DaysAgo.format(formatter);
		String todayString = today.format(formatter);

		WebElement datePicker = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/div[2]/div[3]/div[1]/div/input"));
		Thread.sleep(5000);
		datePicker.sendKeys(date15DaysAgoString);

		Thread.sleep(5000);
				
				
				
//				
//		LocalDate today = LocalDate.now();
//
//        // Subtract 15 days from today's date
//        LocalDate date15DaysAgo = today.minusDays(15);
//
//        // Print the result
//        System.out.println("Today's date: " + today);
//        System.out.println("Date 15 days ago: " + date15DaysAgo);
		
		
		
		
		
		
	}
	}
		
		
		
		
//
//		WebElement dropdownElement = driver.findElement(By.xpath("//select[@class='form-control']"));
//		Select dropdown = new Select(
//				dropdownElement);
//		dropdown.selectByVisibleText("Consultant");
//		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
//		driver.findElement(By.cssSelector("input[value='Sign In']")).click();
//		
//		
//	
//		List <WebElement> cartItems = driver.findElements(By.cssSelector("button[class='btn btn-info']"));
//		
//		for(int i=0; i<cartItems.size(); i++)
//		{
//			cartItems.get(i).click();
//		}
//		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
//		

	
	
	
	
	
//		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
//		addItems(driver, itemsNeeded);
//	}
//
//	public static void addItems(WebDriver driver, String[] itemsNeeded) {
//	
//		int j = 0;
//		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
//		
//		for (int i = 0; i < products.size(); i++) {
//			String[] name = products.get(i).getText().split("-");
//			String formattedName = name[0].trim();
//
//			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
//			if (itemsNeededList.contains(formattedName))
//			{
//				j++;
//
//				
//				driver.findElements(By.xpath("//*[@class='product-action']")).get(i).click();
//				if (j == itemsNeeded.length)
//				{
//					break;
//				}
//			}
//		
//		}





// ................multiple arrays.....................................>>>>>>>>>>>>>>>>>>>>>>

//public class Testing {
//
//	public static void main(String[] args) throws InterruptedException {
//
////		System.setProperty("webdriver.edge.driver", "C:/Users/LENOVO/Downloads/edgedriver_win64/msedgedriver.exe");
//		System.setProperty("webdriver.chrome.driver",
//				"C:/Users/LENOVO/Downloads/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");
//
////		WebDriver driver = new ChromeDriver();
//
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//
//		WebDriver driver = new ChromeDriver(options);
//
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
//		driver.manage().window().maximize();
//		Thread.sleep(5000);
//		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
//		addItems(driver, itemsNeeded);
//	}
//
//	public static void addItems(WebDriver driver, String[] itemsNeeded) {
//	
//		int j = 0;
//		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
//		
//		for (int i = 0; i < products.size(); i++) {
//			String[] name = products.get(i).getText().split("-");
//			String formattedName = name[0].trim();
//
//			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
//			if (itemsNeededList.contains(formattedName))
//			{
//				j++;
//
//				
//				driver.findElements(By.xpath("//*[@class='product-action']")).get(i).click();
//				if (j == itemsNeeded.length)
//				{
//					break;
//				}
//			}
//		
//		}
//	}
//}

//.......................single array clicking by taking contains cucumber word in for loop..................

//public static void main(String[] args) throws InterruptedException {
//
////	System.setProperty("webdriver.edge.driver", "C:/Users/LENOVO/Downloads/edgedriver_win64/msedgedriver.exe");
//	System.setProperty("webdriver.chrome.driver",
//			"C:/Users/LENOVO/Downloads/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");
//
////	WebDriver driver = new ChromeDriver();
//
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--disable-notifications");
//
//	WebDriver driver = new ChromeDriver(options);
//
//	driver.get("https://rahulshettyacademy.com/seleniumPractise/");
//	driver.manage().window().maximize();
//	Thread.sleep(5000);
//	List<WebElement> item = driver.findElements(By.cssSelector("h4.product-name"));
//	Thread.sleep(3000);
//	for (int i = 0; i < item.size(); i++) {
//		String name = item.get(i).getText();
//		if (name.contains("Cucumber")) {
//			Thread.sleep(2000);
//			driver.findElements(By.xpath("//*[@class='product-action']")).get(i).click();
//			break;
//		}
//
//	}
//}
//}

//		
//		
//System.out.println(driver.findElement(By.xpath("//div[text()='Unaccompanied Minor']")).isDisplayed());
//
//
//driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]")).click();
//Thread.sleep(3000);
//
//for(int i=1; i<5; i++)
//{
//	driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
//}
//
//driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]")).click();
//
//Assert.assertEquals(driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")).getText(), "5 Adults");
//System.out.println(driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")).getText());

//............Auto sujjecst dropdown...........................................

//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//driver.manage().window().maximize();
//
//driver.findElement(By.id("autosuggest")).sendKeys("ind");
//Thread.sleep(3000);
//
//List <WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//
//for(WebElement option: options) {
//
//	if(option.getText().equalsIgnoreCase("India")) {
//		option.click();
//		break;
//	}
//
//	
//}

//...............disable notification............(allow or block)

//
//ChromeOptions options = new ChromeOptions();
//options.addArguments("--disable-notifications");
//
//WebDriver driver = new ChromeDriver(options);

/////...................OTP

//
//driver.get("https://otp.dev/en/login/start/");
//driver.manage().window().maximize();
//Duration implicitWaitDuration = Duration.ofSeconds(10);
//Thread.sleep(10000);
//driver.findElement(By.xpath("//*[@class='btn btn-primary btn-block btn-lg mb-6']")).click();
//Thread.sleep(10000);
//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("suresh@acenet.io");
//driver.findElement(By.xpath("//button[@name='Send OTP']")).click();
//Thread.sleep(5000);
//
//
// 
//System.setProperty("webdriver.chrome.driver", "C:/Users/LENOVO/Downloads/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");
//
//WebDriver driver1 = new ChromeDriver();
//driver1.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=19&ct=1704802174&rver=7.0.6738.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3da2e3b64d-ed5a-1aa6-3912-fd8df2a4e78e&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
//Thread.sleep(10000);
//driver1.findElement(By.xpath("//*[@class='form-control ltr_override input ext-input text-box ext-text-box']")).sendKeys("suresh@acenet.io");
//Thread.sleep(3000);
//driver1.findElement(By.xpath("//*[@id='idSIButton9']")).click();
//Thread.sleep(5000);
//driver1.findElement(By.xpath("//*[@class='form-control input ext-input text-box ext-text-box']")).sendKeys("Avusula@1234");
//Thread.sleep(5000);
//driver1.findElement(By.xpath("//*[@id='idSIButton9']")).click();
//Thread.sleep(3000);
//driver1.findElement(By.xpath("//*[@id='idSIButton9']")).click();
//Thread.sleep(10000);
//driver1.findElement(By.xpath("//*[@class='gtcPn u0T8k LPIso OPUpK wk4Sg']")).click();
//Thread.sleep(5000);

// importing excel data

//		driver.get("https://uat.svaagath.thejo-engg.com/home");
////		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/form/input[1]")).sendKeys("corphr");
//	    driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/form/input[2]")).sendKeys("Thejo@0123");
//	    driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/form/div/input")).click();
//	     
//	    Thread.sleep(3000);
//	    driver.findElement(By.xpath("//*[@class='addClassBack']")).click();
//	    Thread.sleep(2000);  
//		FileInputStream fis  = FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\newproject\\Java_Test\\src\\com\\suresh\\file_example_XLSX_50.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook();
//		XSSFSheet sheet = workbook.getSheet("Sheet1");
//		
//		int rowcount = sheet.getLastRowNum();
//		int colcount = sheet.getRow(1).getLastCellNum();
//		System.out.println("rowcount : " +rowcount +" + colcount :"+ colcount);
//		for(int i=1; i<=rowcount;i++) 
//		{
//			XSSFRow celldata = sheet.getRow(i);
//			String mail = celldata.getCell(0).getStringCellValue();
//			String createpwd=celldata.getCell(1).getStringCellValue();
//			String lastname = celldata.getCell(2).getStringCellValue();
//			
//			
//			driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("suresh");
//			driver.findElement(By.xpath("(//*[@id='floatingInputGrid'])[2]")).sendKeys("chary");
//			driver.findElement(By.xpath("(//*[@id='floatingInputGrid'])[3]")).sendKeys("kumar");
//			
//			System.out.println(i+"."+mail+" || "+createpwd+" || "+lastname);
//			
//			
//		}
//		
//	}
//
//	private static FileInputStream FileInputStream(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//		
//	}

/*
 * driver.findElement(By.id("email")).sendKeys("8464045484");
 * driver.findElement(By.id("pass")).sendKeys("Avusula@1234");
 * 
 * driver.findElement(By.
 * xpath("//*[contains(@class,'_6ltg')]/button[text()='Log in']")).click();
 * Thread.sleep(10000);
 * 
 * 
 * 
 * 
 * // scroll the page JavascriptExecutor jse = (JavascriptExecutor) driver;
 * jse.executeScript("scroll(0, 1000)"); Thread.sleep(5000);
 */

// select dropdown
//		Select drpdown = new Select(driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
//		drpdown.selectByVisibleText("Aruba");
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//li[@id=\"menu-item-6898\"]/a")).click();
//		Thread.sleep(5000);
//		 

// iframe and slider moving
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
//		driver.switchTo().frame(frame);	
//		
//		WebElement green = driver.findElement(By.xpath("(//*[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
//		
//		Actions actions = new Actions(driver);
//		actions.dragAndDropBy(green, 100, 60).perform();
//		Thread.sleep(5000);
//		
//		driver.quit();

//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(5000);
//		System.out.println(alert.getText());
//		alert.accept();
//		Thread.sleep(10000);
//		driver.quit();

//	}

//	private static FileInputStream FileInputStream(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}

//		try {
//			WebDriverWait wait = new WebDriverWait(driver, 30);
//			if(wait.until(ExpectedConditions.alertIsPresent())==null){
//				System.out.println("alert not displayed");
//				
//			}
//			
//			else {
//				driver.switchTo().alert().accept();
//			}		
//	}
//		catch (Exception e) {
//			// TODO: handle exception
//		}

//		try {
//			Alert alert = driver.switchTo().alert();
//			alert.accept();
//			Thread.sleep(5000);
//		}catch(NoAlertPresentException ne) {
//			System.out.println("noticifaction not displayed");
//			ne.printStackTrace();
//			Thread.sleep(5000);
//			driver.quit();

//		try {
//			// Specify the URL you want to open
//			String url = "https://www.google.com";
//
//			// Create a URI object from the URL
//			URI uri = new URI(url);
//
//			// Check if the Desktop class is supported on the current platform
//			if (Desktop.isDesktopSupported()) {
//				// Get the Desktop instance
//				Desktop desktop = Desktop.getDesktop();
//
//				// Check if the default browser is supported
//				if (desktop.isSupported(Desktop.Action.BROWSE)) {
//					// Open the URL in the default web browser
//					desktop.browse(uri);
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
