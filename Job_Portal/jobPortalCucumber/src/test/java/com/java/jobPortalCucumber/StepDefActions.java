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

public class StepDefActions {
	WebDriver driver;

	@Given("^User is on Admin Home Page$")
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

		driver.navigate().to("https://alchemy.hguy.co/jobs/wp-admin");
		String Username = "root";
		String Password = "pa$$w0rd";

		driver.findElement(By.xpath("//form[@id='loginform']//input[@type='text']")).sendKeys(Username);
		driver.findElement(By.xpath("//form[@id='loginform']//input[@type='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//form[@id='loginform']//input[@type='submit']")).click();

		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Dashboard']")).isDisplayed());

	}

	@When("^Click on User and navigate Add New$")
	public void click_on_User_and_navigate_Add_New() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String className = driver.findElement(By.xpath("//*[@id='menu-users']")).getAttribute("class");

		executeJs(
				"document.getElementsByClassName('" + className + "')[0].className = '" + className + " opensub" + "'");

		driver.findElement(By.xpath("//*[@id='menu-users']//a[text()='Add New']")).click();

	}

	String email;
	@Then("^Fill in the necessary details$")
	public void fill_in_the_necessary_details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		List<WebElement> textBox = driver.findElements(By.xpath("//table[@role='presentation']//input"));

		textBox.get(0).sendKeys("TestAutomation"+printRandomString(5));
		email = "test" + printRandomString(5) + "@gmail.com";
		textBox.get(1).sendKeys(email);

		
	}

	@Then("^Click the Add New User button$")
	public void click_the_Add_New_User_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("createusersub")).click();
	}

	@Then("^Verify that the user was created$")
	public void verify_that_the_user_was_created() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("user-search-input")).click();
		driver.findElement(By.id("user-search-input")).sendKeys(email);
		driver.findElement(By.id("user-search-input")).sendKeys(Keys.ENTER);
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='"+email+"']")).isDisplayed());
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
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
