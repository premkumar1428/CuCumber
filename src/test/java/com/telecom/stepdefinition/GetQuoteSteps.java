package com.telecom.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetQuoteSteps {
	    static WebDriver driver;
	
	@Given("User launches Rac application")
	public void user_launches_Rac_application() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rac.com.au/products/insurance?gclid=CjwKCAjwzruGBhBAEiwAUqMR8HEgOa2iKFia8mAOItXY0NqMRAarpqRVQ-MBF1eGwwTFespKFyt8VxoCflsQAvD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
	   
	}

	@Given("user click get a quote")
	public void user_click_get_a_quote() {
		
		driver.findElement(By.xpath("(//a[text()='Get a quote'])[1]")).click();
		
	    
	}

	@Given("user click car quote option")
	public void user_click_car_quote_option() {
		
		driver.findElement(By.xpath("(//a[text()='Car'])[1]")).click();
		
		
	   
	}

	@When("user need to fillup the fields")
	public void user_need_to_fillup_the_fields() {
	   driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("ZZZ999");
	   driver.findElement(By.xpath("(//span[text()='Select'])[10]")).sendKeys("private");
	   
	}

	@When("user click the continue button")
	public void user_click_the_continue_button() {
		
	}

	@When("user need to fill the fields")
	public void user_need_to_fill_the_fields() {
	   
	}

	@Then("user click the get quote button")
	public void user_click_the_get_quote_button() {
	    
	}

	@Then("user verify quote is generated")
	public void user_verify_quote_is_generated() {
	
	}



}
