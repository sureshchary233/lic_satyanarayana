package stepss;

import static org.junit.Assert.fail;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ebay_stepss {
	WebDriver driver;

	public ebay_stepss(commonsteps commonsteps) {
		this.driver = commonsteps.getDriver();
	}

	@Given("i am navigated to home page")
	public void i_am_navigated_to_home_page() {
//		System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver.exe");
//		driver = new ChromeDriver();
//		System.out.println("i am navigated to home page");
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");

	}

	@When("i click on advanced link")
	public void i_click_on_advanced_link() throws InterruptedException {
		System.out.println("i click on advanced link");
		driver.findElement(By.linkText("Advanced")).click();
		Thread.sleep(5000);

	}

	@And("i navigated advanced page")
	public void i_navigated_advanced_page() throws InterruptedException {
		System.out.println("i navigated advanced page");
		String expUrl = "https://www.ebay.com/sch/ebayadvsearch";
		String actUrl = driver.getCurrentUrl();
		if (expUrl.equals(actUrl)) {
//			fail("pls dose not navigated to expected page");
			
		driver.findElement(By.xpath("//*[@id='_nkw']")).sendKeys("suresh");
		Thread.sleep(5000);
		WebElement dropdown = driver.findElement(By.xpath("//*[@name='_in_kw']"));
		Select select = new Select (dropdown);
		select.selectByVisibleText("Any words, any order");
		Thread.sleep(5000);
		
		}
		
	}
	

	@When("search for i phone11")
	public void search_for_i_phone11() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("iphone12");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
	    
	}

	@Then("validating the item count")
	public void validating_the_item_count() {
		String itemCount = driver.findElement(By.xpath("(//h1[@class='srp-controls__count-heading'])//span[@class='BOLD'][1]")).getText().trim();
		String itemCount2 = itemCount.replace(",", "");
		int itemCountInt = Integer.parseInt(itemCount2);
		if (itemCountInt <= 1000) {
			fail("less then 1000 results shown"); 
		}
		System.out.println("inside" + itemCountInt);
		
		
	}
	
	

}
