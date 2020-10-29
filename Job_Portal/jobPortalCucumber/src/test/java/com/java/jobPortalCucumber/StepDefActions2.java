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

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class StepDefActions2 {
	WebDriver driver;

	@Given("^Open browser with Alchemy Jobs site and navigate to Jobs page$")
	public void user_is_on_Admin_Home_Page() throws Throwable {
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

	@When("^Find the Keywords search input field$")
	public void find_the_Keywords_search_input_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()='Jobs']")).click();

		Assert.assertTrue(driver.findElement(By.id("search_keywords")).isDisplayed());
	}

	@Then("^Type in keywords to search for jobs and change the Job type$")
	public void type_in_keywords_to_search_for_jobs_and_change_the_Job_type() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("search_keywords")).click();
		driver.findElement(By.id("search_keywords")).sendKeys("Automation");
	}

	@Then("^Find the filter using XPath and filter job type to show only “Full Time” jobs\\.$")
	public void find_the_filter_using_XPath_and_filter_job_type_to_show_only_Full_Time_jobs() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		List<WebElement> filters = driver.findElements(By.xpath("//input[@type='checkbox']"));

		filters.get(0).click();
		filters.get(2).click();
		filters.get(3).click();
		filters.get(4).click();

		driver.findElement(By.id("search_keywords")).sendKeys(Keys.ENTER);
	}

	@Then("^Find a job listing using XPath and it to see job details\\.$")
	public void find_a_job_listing_using_XPath_and_it_to_see_job_details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[contains(.,'Automation')]//img")).isDisplayed();

		driver.findElement(By.xpath("//ul[@class='job_listings']/li//a")).click();
	}

	@Then("^Find and Click on the “Apply for job” button\\.$")
	public void find_and_Click_on_the_Apply_for_job_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@value='Apply for job']")).click();

		System.out.println(
				driver.findElement(By.xpath("//*[@class='application_details']//a")).getAttribute("outerText"));
		System.out.println(driver.getTitle());
	}

	@Then("^Close the browser2$")
	public void close_browser() throws Throwable {
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
