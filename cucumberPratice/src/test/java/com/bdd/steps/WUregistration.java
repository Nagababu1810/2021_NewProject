package com.bdd.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WUregistration {

public 	WebDriver driver;
	
	@Given("user lunch the browser")
	public void user_lunch_the_browser() {
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumResources\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);   
	    
	}

	@When("user enteries application url")
	public void user_enteries_application_url() {
		driver.get("https://www.westernunion.com/in/en/web/user/register");
		driver.manage().window().maximize();
	    
	}

	@Then("verify user landing homepage")
	public void verify_user_landing_homepage() {
	    
		driver.getCurrentUrl();
		//Assert.assertEquals("https://www.westernunion.com/in/en/web/user/register", "driver.getCurrentUrl();");
	    //Assert.assertEquals("Registra profile with Westran", "driver.gettitle();");
	}

	@Then("userfilling the user details of the application")
	public void userfilling_the_user_details_of_the_application() {
	    
		driver.findElement(By.name("txtFName")).sendKeys("naga");
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("babu");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("maddi");
		driver.findElement(By.cssSelector("#dob")).sendKeys("18/10/1991");
		
		driver.findElement(By.cssSelector("#address1")).sendKeys("kakinada");
		driver.findElement(By.name("mobileNumber")).sendKeys("9059506469");
		
		driver.findElement(By.id("option3")).click();
		
		Select sl=new Select(driver.findElement(By.id("dropdown-nationality")));
		sl.selectByVisibleText("American Samoa");
		
		Select sl1=new Select(driver.findElement(By.id("question")));
		sl1.selectByVisibleText("What is your place of birth?");
		
		driver.findElement(By.name("answer")).sendKeys("kakinada");
	
	}

	@Then("user click on submit button on the button of section")
	public void user_click_on_submit_button_on_the_button_of_section() {
	    
	    //driver.findElement(By.linkText(" Finish "));
	    driver.findElement(By.xpath("//*[@id=\"button-continue\"]/span/span/span"));
	}

	@Then("user close the application")
	public void user_close_the_application() {
	    
	 driver.close();
		
	}

	
	
	
	
	
	
	
}
