package stepss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class commonsteps {

	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		
	}
	
	@After
	public void tearDown() throws Exception  {
		if (driver != null) {
		driver.close();
		}
		Thread.sleep(1000);
		
	}
	public WebDriver getDriver() {
		return driver;
	}
}
