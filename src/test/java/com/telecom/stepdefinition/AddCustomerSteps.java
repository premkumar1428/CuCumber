package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.telecom.objectrepository.AddCustomerPage;

import com.telecom.resources.Commonaction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomerSteps extends Commonaction {
	
	AddCustomerPage ac = new AddCustomerPage();
	Commonaction ca = new Commonaction();
	
	
	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		
		System.out.println("Background");
		ca.button(ac.getAddcustomerbutton());
		
	   
	}

	@When("user need to fill up the fields")
	public void user_need_to_fill_up_the_fields() {
		ca.button(ac.getDonebutton());
		ca.insertText(ac.getFname(), "prem");
		ca.insertText(ac.getLname(), "kumar");
        ca.insertText(ac.getMail(), "premjan1994@gmail.com");
		ca.insertText(ac.getAddress(), "chennai");
		ca.insertText(ac.getPhoneno(), "872886687");
		
		
	}
		
		
		@When("user need to fill up the fields in oneDim list")
		public void user_need_to_fill_up_the_fields_in_oneDim_list(DataTable dataTable) {
			
			List<String> data = dataTable.asList(String.class);
			
			ca.button(ac.getDonebutton());
			ca.insertText(ac.getFname(), data.get(0));
			ca.insertText(ac.getLname(), data.get(1));
	        ca.insertText(ac.getMail(), data.get(2));
			ca.insertText(ac.getAddress(), data.get(3));
			ca.insertText(ac.getPhoneno(), data.get(4));
			
			
			/*Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
			Hooks.driver.findElement(By.id("fname")).sendKeys(data.get(0));
			Hooks.driver.findElement(By.id("lname")).sendKeys(data.get(1));
			Hooks.driver.findElement(By.id("email")).sendKeys(data.get(2));
			Hooks.driver.findElement(By.name("addr")).sendKeys(data.get(3));
			Hooks.driver.findElement(By.id("telephoneno")).sendKeys(data.get(4));*/	    
		

		
	    
	}
		
		@When("user need to fill up the fields in oneDim map")
		public void user_need_to_fill_up_the_fields_in_oneDim_map(DataTable dataTable) {
			
			Map<String, String> data = dataTable.asMap(String.class, String.class);
			
			ca.button(ac.getDonebutton());
			ca.insertText(ac.getFname(), data.get("fname"));
			ca.insertText(ac.getLname(), data.get("lname"));
	        ca.insertText(ac.getMail(), data.get("email"));
			ca.insertText(ac.getAddress(), data.get("Address"));
			ca.insertText(ac.getPhoneno(), data.get("phone no"));
			
			
			/*Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
			Hooks.driver.findElement(By.id("fname")).sendKeys(data.get("fname"));
			Hooks.driver.findElement(By.id("lname")).sendKeys(data.get("lname"));
			Hooks.driver.findElement(By.id("email")).sendKeys(data.get("email"));
			Hooks.driver.findElement(By.name("addr")).sendKeys(data.get("Address"));
			Hooks.driver.findElement(By.id("telephoneno")).sendKeys(data.get("phone no"));*/	  
			
		}
		
		@When("user need to fill up the fields in twoDim list")
		public void user_need_to_fill_up_the_fields_in_twoDim_list(DataTable dataTable) {
			  
			List<List<String>> data = dataTable.asLists(String.class);
			
			ca.button(ac.getDonebutton());
			ca.insertText(ac.getFname(), data.get(2).get(0));
			ca.insertText(ac.getLname(), data.get(1).get(1));
	        ca.insertText(ac.getMail(), data.get(3).get(2));
			ca.insertText(ac.getAddress(), data.get(0).get(1));
			ca.insertText(ac.getPhoneno(), data.get(0).get(4));
			
			
			
			/*Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
			Hooks.driver.findElement(By.id("fname")).sendKeys(data.get(2).get(0));
			Hooks.driver.findElement(By.id("lname")).sendKeys(data.get(1).get(1));
			Hooks.driver.findElement(By.id("email")).sendKeys(data.get(3).get(2));
			Hooks.driver.findElement(By.name("addr")).sendKeys(data.get(0).get(1));
			Hooks.driver.findElement(By.id("telephoneno")).sendKeys(data.get(0).get(4));*/	    
		}
		
		
		@When("user need to fill up the fields in twoDim map")
		public void user_need_to_fill_up_the_fields_in_twoDim_map(DataTable dataTable) {
			List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
			
			ca.button(ac.getDonebutton());
			ca.insertText(ac.getFname(), data.get(1).get("f name"));
			ca.insertText(ac.getLname(), data.get(1).get("l name"));
	        ca.insertText(ac.getMail(), data.get(3).get("mail"));
			ca.insertText(ac.getAddress(), data.get(0).get("address"));
			ca.insertText(ac.getPhoneno(), data.get(0).get("phone no"));
			
		
			
			/*Hooks.driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
			Hooks.driver.findElement(By.id("fname")).sendKeys(data.get(1).get("f name"));
			Hooks.driver.findElement(By.id("lname")).sendKeys(data.get(1).get("l name"));
			Hooks.driver.findElement(By.id("email")).sendKeys(data.get(3).get("mail"));
			Hooks.driver.findElement(By.name("addr")).sendKeys(data.get(0).get("address"));
			Hooks.driver.findElement(By.id("telephoneno")).sendKeys(data.get(0).get("phone no"));*/	    
		}


	@When("user click on submit button")
	public void user_click_on_submit_button() {
		System.out.println("scenario");
		ca.button(ac.getSubmitbutton());
	    
	  
	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
		 Assert.assertTrue(Hooks.driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		 
	   
	}



}
