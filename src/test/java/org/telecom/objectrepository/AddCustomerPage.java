package org.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.Commonaction;

public class AddCustomerPage extends Commonaction {
	
	public AddCustomerPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement addcustomerbutton;
	
	
	@FindBy(xpath="(//label[@for='done'])[1]")
	private WebElement donebutton;
	
	
	@FindBy(id="fname")
	private WebElement Fname;
	
	@FindBy(id="lname")
	private WebElement lname;
	
	@FindBy(id="email")
	private WebElement mail;
	
	@FindBy(name="addr")
	private WebElement address;
	
	@FindBy(id="telephoneno")
	private WebElement phoneno;
	
	@FindBy(xpath="\"(//input[@type='submit'])[1]\"")
	private WebElement submitbutton;

	public WebElement getAddcustomerbutton() {
		return addcustomerbutton;
	}

	public WebElement getDonebutton() {
		return donebutton;
	}

	public WebElement getFname() {
		return Fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getPhoneno() {
		return phoneno;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	
	
	

}
