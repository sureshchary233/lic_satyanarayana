package stepss;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ebayadvancepage {
	WebDriver driver;
	
	public ebayadvancepage(commonsteps commonsteps) {
		this.driver = commonsteps.getDriver();
		
	}
	
	@Given("i navigated to home page")
	public void i_navigated_to_home_page() throws InterruptedException {
//		driver = new ChromeDriver();
//		System.out.println("i navigated to home page");
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		
	   
	}

	@When("i click on ebay log")
	public void i_click_on_ebay_log() throws InterruptedException {
		driver.findElement(By.linkText("Music")).click();
	

		
	    
	}

	@When("finally on ebay clicks")
	public void finally_on_ebay_clicks() throws InterruptedException {
		driver.findElement(By.xpath("(//*[@id='search'])[3]")).sendKeys("prabhas");
		driver.findElement(By.xpath("(//*[@class='style-scope ytd-searchbox'])[7]")).click();
	
		

	}
	

	@Then("iam sending keys")
	public void iam_sending_keys() {

	}

	
// dataTables scenario 11-ebay advancesteps

	
	@When("i click on advanced link page")
	public void i_click_on_advanced_link_page() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='gh-as-a']")).click();
	
		
	}

	@Then("i advanced search on items")
	public void i_advanced_search_on_items(DataTable dataTable) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys(dataTable.cell(1, 0));
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='_in_kw']"));
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("All words, any order");
	
		driver.findElement(By.xpath("//input[@id='_ex_kw']")).sendKeys(dataTable.cell(1, 1));
		driver.findElement(By.xpath("//*[@name='_udlo']")).sendKeys(dataTable.cell(1, 2));
	
		driver.findElement(By.xpath("//*[@name='_udhi']")).sendKeys(dataTable.cell(1, 3));
	
		driver.findElement(By.xpath("(//*[@class='btn btn--primary'])[2]")).click();

		
		
		
	   
	}

//Scenario 12 Data tables : scenario outline 
	
	@When("i click on {string}")
	public void i_click_on(String string) throws InterruptedException {
		driver.findElement(By.linkText(string)).click();	
		
	}

	@Then("i valiodates that page navigates to {string} and title contains {string}")
	public void i_valiodates_that_page_navigates_to_and_title_contains(String url, String title) {
		String actUrl = driver.getCurrentUrl();
		String actTitle = driver.getTitle();
		if (!actUrl.contains(url)) {
			System.out.println("----------------->"+actUrl + "\n" + url);
			fail("page dose navigate to expected url : " + url );
		}
	    
		if (!actTitle.contains(title)) {
			System.out.println("----------------->"+actTitle + "\n" + title);
			fail("title mismatch");
		}
	}
}
