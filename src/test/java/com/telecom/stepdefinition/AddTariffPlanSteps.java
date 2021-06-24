package com.telecom.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class AddTariffPlanSteps {
	

		
		@Given("User click on add tariff button")
		public void user_click_on_add_tariff_button() {
			
			Hooks.driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		  
		}

		@When("user need to fill up the plan details  {string},{string},{string},{string},{string},{string},{string}")
		public void user_need_to_fill_up_the_plan_details(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
			System.out.println(" scenario");

			Hooks.driver.findElement(By.id("rental1")).sendKeys(string);
		    Hooks.driver.findElement(By.id("local_minutes")).sendKeys(string2);
		    Hooks.driver.findElement(By.id("inter_minutes")).sendKeys(string3);
		    Hooks.driver.findElement(By.id("sms_pack")).sendKeys(string4);
		    Hooks.driver.findElement(By.id("minutes_charges")).sendKeys(string5);
		    Hooks.driver.findElement(By.id("inter_charges")).sendKeys(string6);
		    Hooks.driver.findElement(By.id("sms_charges")).sendKeys(string7);
		}

		@When("user clicked on submit button")
		public void user_clicked_on_submit_button() {
			Hooks.driver.findElement(By.xpath("//input[@type='submit']")).click();
		   
		}

		@Then("user verify congratulation message")
		public void user_verify_congratulation_message() {
			String text = Hooks.driver.findElement(By.xpath("//h2[contains(text(),'Con')]")).getText();
			
			Assert.assertEquals("Congratulation you add Tariff Plan", text);
			
			
		   
		
		}
		
	
	

	

}
	
