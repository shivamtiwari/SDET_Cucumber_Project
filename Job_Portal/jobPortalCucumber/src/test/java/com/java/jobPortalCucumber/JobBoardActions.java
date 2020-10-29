package com.java.jobPortalCucumber;


import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JobBoardActions {
	WebDriver driver;
//	@Test
	public void completedTest1() {
		
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
		
		String className = driver.findElement(By.xpath("//*[@id='menu-users']")).getAttribute("class");

		executeJs(
				"document.getElementsByClassName('"+className+"')[0].className = '"
						+ className + " opensub" + "'");
		
		driver.findElement(By.xpath("//*[@id='menu-users']//a[text()='Add New']")).click();
		
		List<WebElement> textBox = driver.findElements(By.xpath("//table[@role='presentation']//input"));
		
		textBox.get(0).sendKeys("TestAutomation");
		String email = "test" + printRandomString(5) + "@gmail.com";
		textBox.get(1).sendKeys(email);
		
		driver.findElement(By.id("createusersub")).click();
		
		driver.findElement(By.id("user-search-input")).click();
		driver.findElement(By.id("user-search-input")).sendKeys(email);
		driver.findElement(By.id("user-search-input")).sendKeys(Keys.ENTER);
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='"+email+"']")).isDisplayed());
		
		driver.close();
	}
	
	
	//@Test
	public void completedTest2() {
		
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
		
		driver.findElement(By.xpath("//a[text()='Jobs']")).click();
		driver.findElement(By.id("search_keywords")).isDisplayed();
		driver.findElement(By.id("search_keywords")).click();
		driver.findElement(By.id("search_keywords")).sendKeys("Automation");
		
		List<WebElement> filters = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		filters.get(0).click();
		filters.get(2).click();
		filters.get(3).click();
		filters.get(4).click();
		
		driver.findElement(By.id("search_keywords")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[contains(.,'Automation')]//img")).isDisplayed();

		driver.findElement(By.xpath("//ul[@class='job_listings']/li//a")).click();

		driver.findElement(By.xpath("//*[@value='Apply for job']")).click();

		System.out.println(
				driver.findElement(By.xpath("//*[@class='application_details']//a")).getAttribute("outerText"));

		System.out.println(driver.getTitle());

	
		
		driver.close();
	}
	
	
	@Test
	public void completedTest3() {
		
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
		
		driver.findElement(By.xpath("//a[text()='Post a Job']")).click();

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
		String description = "Looking for experienced engineer.";
		driver.findElement(By.tagName("p")).click();
		driver.findElement(By.tagName("p")).sendKeys(description);

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//form[@id='submit-job-form']//input[contains(@name,'application')]")).clear();
		driver.findElement(By.xpath("//form[@id='submit-job-form']//input[contains(@name,'application')]"))
				.sendKeys("test" + printRandomString(5) + "@gmail.com");

		driver.findElement(By.xpath("//form[@id='submit-job-form']//input[contains(@name,'company_name')]")).clear();
		driver.findElement(By.xpath("//form[@id='submit-job-form']//input[contains(@name,'company_name')]"))
				.sendKeys("IBM");

		driver.findElement(By.xpath("//form[@id='submit-job-form']//input[contains(@name,'submit_job')]")).click();

		driver.findElement(By.xpath("//input[@name='continue']")).isDisplayed();
		driver.findElement(By.xpath("//input[@name='continue']")).click();

		driver.findElement(By.xpath("//a[text()='click here']")).isDisplayed();
		driver.findElement(By.xpath("//a[text()='click here']")).click();

		Assert.assertTrue(driver.findElement(By.xpath("//*[text()='" + description + "']")).isDisplayed());

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
