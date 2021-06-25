package org.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.Commonaction;

public class AddTariffPlanPage extends Commonaction {
	
	public AddTariffPlanPage() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//a[text()='Add Tariff Plan']")
	private WebElement addtariffbutton;
	
	@FindBy(id="rental1")
	private WebElement rental;
	
	@FindBy(id="local_minutes")
	private WebElement localmins;
	
	@FindBy(id="inter_minutes")
	private WebElement intermins;
	
	@FindBy(id="sms_pack")
	private WebElement smspack;
	
	@FindBy(id="minutes_charges")
	private WebElement minscharges;
	
	@FindBy(id="inter_charges")
	private WebElement intercharges;
	
	@FindBy(id="sms_charges")
	private WebElement smscharges;
	
	@FindBy(xpath="\"//input[@type='submit']\"")
	private WebElement submitbutton;

	public WebElement getAddtariffbutton() {
		return addtariffbutton;
	}

	public WebElement getRental() {
		return rental;
	}

	public WebElement getLocalmins() {
		return localmins;
	}

	public WebElement getIntermins() {
		return intermins;
	}

	public WebElement getSmspack() {
		return smspack;
	}

	public WebElement getMinscharges() {
		return minscharges;
	}

	public WebElement getIntercharges() {
		return intercharges;
	}

	public WebElement getSmscharges() {
		return smscharges;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	
	
	

}
