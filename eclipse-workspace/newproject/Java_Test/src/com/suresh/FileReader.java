package com.suresh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.chrome.ChromeOptions;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileReader {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C://Users//LENOVO//Downloads//chromedriver-win64 (2)//chromedriver-win64//chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		

		driver.get("https://uat.svaagath.thejo-engg.com/home");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/form/input[1]")).sendKeys("corphr");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/form/input[2]")).sendKeys("Thejo@0123");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/form/div/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/button")).click();
		Thread.sleep(2000);

//   List<Customer> custList = readXLSFile("D:\\Test\\CustDetails.xls");
		try {
			HSSFWorkbook workbook = new HSSFWorkbook(
					new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\newproject\\Java_Test\\src\\abcd.xls"));
			HSSFSheet sheet = workbook.getSheet("Sheet1");
			HSSFRow row = null;
			int i = 1;
			while ((row = sheet.getRow(i)) != null) {

				String c1, c2, c3;
				c1 = row.getCell(0).getStringCellValue();
				c2 = row.getCell(1).getStringCellValue();
				c3 = row.getCell(2).getStringCellValue();
				
		
				driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(c1);
				driver.findElement(By.xpath("(//*[@id='floatingInputGrid'])[2]")).sendKeys(c2);
				driver.findElement(By.xpath("(//*[@id='floatingInputGrid'])[3]")).sendKeys(c3);
				
				
				System.out.println(c1 + " " + c2 + " " + c3);
				i++;
			}
		} catch (Exception ex) {
			System.out.print(ex);
		}

//   for(Customer cust : custList){
//    System.out.println(cust);
//   }
//  } catch (IOException e) {
//   e.printStackTrace();
	}

}

// private static List<Customer> readXLSFile(String file) throws FileNotFoundException, IOException {
//  HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(file));
//  HSSFSheet sheet = workbook.getSheet("Customer");
//  List<Customer> listCust = new ArrayList<Customer>();
//  HSSFRow row = null;
//  int i=0;
//  while((row=sheet.getRow(i)) != null){
//   int custId,pinCode;
//   String custName,custCity,stateCode;
//   try{
//    custId = (int) row.getCell(0).getNumericCellValue();
//   }
//   catch(Exception e){custId = 0;}
//   try{
//    custName = row.getCell(1).getStringCellValue();
//   }
//   catch(Exception e){custName = null;}
//   try{
//    custCity = row.getCell(2).getStringCellValue();
//   }
//   catch(Exception e){custCity = null;}
//   try{
//    pinCode = (int) row.getCell(3).getNumericCellValue();
//   }
//   catch(Exception e){pinCode = 0;}
//   try{
//    stateCode = row.getCell(4).getStringCellValue();
//   }
//   catch(Exception e){stateCode = null;}
//   Customer cust = new Customer(custId,custName,custCity,pinCode,stateCode);
//   listCust.add(cust);
//    i++;    
//  }
//  workbook.close();
//  return listCust;
// }
//}