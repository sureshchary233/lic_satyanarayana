package stepss;

import static org.junit.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class parametarization {
	WebDriver driver;
	
	public parametarization(commonsteps commonsteps) {
		this.driver = commonsteps.getDriver();
		
	}
//scenario P4 , Ebay_home 
	
	@When("i search for {string}")
	public void i_search_for(String string) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000); 
	   
	}

	@Then("i validate atleast {int} search count")
	public void i_validate_atleast_search_count(Integer int1) {
		String itemCount = driver.findElement(By.xpath("(//h1[@class='srp-controls__count-heading'])//span[@class='BOLD'][1]")).getText().trim();
		String itemCount2 = itemCount.replace(",", "");
		int itemCountInt = Integer.parseInt(itemCount2);
		if (itemCountInt <= int1) {
			fail("less then 1000 results shown"); 
		}
		System.out.println("inside" + itemCountInt);
	}  

	
	
//parameterization giving multiple values
//	scenario 5
	
	@When("i search for {string} in {string} category")
	public void i_search_for_in_category(String string, String string2) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys(string);
		List<WebElement> cat = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		for(WebElement x : cat) {
			if(x.getText().trim().equals(string2)) {
				x.click();
				break;
				
			}
		}
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		
		  
	   
	}

	
	
}
