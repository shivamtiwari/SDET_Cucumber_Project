package com.java.jobPortalCucumber;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class StepDefActions3 {
	WebDriver driver;

	@Given("^Open browser with Alchemy Jobs site$")
	public void open_browser_with_Alchemy_Jobs_site() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("*********************************************");
		System.setProperty("webdriver.gecko.driver", "resources/drivers/geckodriver.exe");

//		WebDriver driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver = new ChromeDriver();
		this.driver = driver;

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

//		*****************************************************

		driver.navigate().to("https://alchemy.hguy.co/jobs/");

		driver.findElement(By.xpath("//a[text()='Jobs']")).isDisplayed();
	}



	@When("^Go to Post a Job page$")
	public void go_to_Post_a_Job_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()='Post a Job']")).click();
		}
	
	String description;

	@Then("^Read job information from the Feature file table and fill in the details$")
	public void read_job_information_from_the_Feature_file_table_and_fill_in_the_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//form[@id='submit-job-form']//input[contains(@name,'email')]")).clear();
		driver.findElement(By.xpath("//form[@id='submit-job-form']//input[contains(@name,'email')]"))
				.sendKeys("test" + printRandomString(5) + "@gmail.com");

		driver.findElement(By.xpath("//form[@id='submit-job-form']//input[contains(@name,'title')]")).clear();
		driver.findElement(By.xpath("//form[@id='submit-job-form']//input[contains(@name,'title')]"))
				.sendKeys("Automation test Specialist");

		Select dropdown_jobType = new Select(
				driver.findElement(By.xpath("//form[@id='submit-job-form']//select[contains(@name,'type')]")));
		dropdown_jobType.selectByVisibleText("Full Time");

		driver.switchTo().frame(0);
		 description = "Looking for experienced engineer.";
		driver.findElement(By.tagName("p")).click();
		driver.findElement(By.tagName("p")).sendKeys(description);

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//form[@id='submit-job-form']//input[contains(@name,'application')]")).clear();
		driver.findElement(By.xpath("//form[@id='submit-job-form']//input[contains(@name,'application')]"))
				.sendKeys("test" + printRandomString(5) + "@gmail.com");

		driver.findElement(By.xpath("//form[@id='submit-job-form']//input[contains(@name,'company_name')]")).clear();
		driver.findElement(By.xpath("//form[@id='submit-job-form']//input[contains(@name,'company_name')]"))
				.sendKeys("IBM");	}

	@Then("^Click submit\\.$")
	public void click_submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//form[@id='submit-job-form']//input[contains(@name,'submit_job')]")).click();
	}

	@Then("^Go to the Jobs page$")
	public void go_to_the_Jobs_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='continue']")).isDisplayed();
		driver.findElement(By.xpath("//input[@name='continue']")).click();	}

	@Then("^Confirm job listing is shown on page$")
	public void confirm_job_listing_is_shown_on_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()='click here']")).isDisplayed();
		driver.findElement(By.xpath("//a[text()='click here']")).click();

		Assert.assertTrue(driver.findElement(By.xpath("//*[text()='" + description + "']")).isDisplayed());	}

	@Then("^Close the browser1$")
	public void browserClose() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
driver.close();
}

	public void executeJs(String script) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(script, (Object) null);
	}

	public String printRandomString(int n) {
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		String res = "";
		for (int i = 0; i < n; i++)
			res = res + alphabet[(int) (Math.random() * 10 % 26)];

		return res.toUpperCase();
	}

}
