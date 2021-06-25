package com.telecom.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.telecom.objectrepository.AddTariffPlanPage;

import com.telecom.resources.Commonaction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class AddTariffPlanSteps extends Commonaction {
	
	AddTariffPlanPage at = new AddTariffPlanPage();
	Commonaction ca = new Commonaction();
	

		
		@Given("User click on add tariff button")
		public void user_click_on_add_tariff_button() {
			
			ca.button(at.getAddtariffbutton());
		  
		}

		@When("user need to fill up the plan details  {string},{string},{string},{string},{string},{string},{string}")
		public void user_need_to_fill_up_the_plan_details(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
			System.out.println(" scenario");

			ca.insertText(at.getRental(), "100");
			ca.insertText(at.getLocalmins(), "200");
		    ca.insertText(at.getSmspack(), "300");
		    ca.insertText(at.getMinscharges(), "400");
		    ca.insertText(at.getIntermins(), "1");
		    ca.insertText(at.getSmspack(), "3");
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
	
