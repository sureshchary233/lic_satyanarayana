package com.suresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class new_class {
	public static void main(String args[]) {
//		System.setProperty("webdriver.chrome.driver", "C:/Users/LENOVO/Downloads/chromedriver-win32 (1)/chromedriver-win32/chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
		
		String input = "autonhhhat15882ic";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        
        if (matcher.find()) {
            String number = matcher.group();
            System.out.println(number); // Output: 152
        }
    }

		
	}


