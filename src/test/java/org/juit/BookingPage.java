package org.juit;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends BaseClass {
	
	public BookingPage() {
		PageFactory.initElements(driver , this);
	}
	
	@FindBy(id = "first_name")
	private WebElement txtBoxFirstName;
	
	@FindBy(id = "last_name")
	private WebElement txtBoxLastName;
	
	@FindBy(id = "address")
	private WebElement billingAddress;

	@FindBy(id = "cc_num")
	private WebElement ccNumber;
	
	@FindBy(id = "cc_type")
	private WebElement ccType;

	@FindBy(id = "cc_exp_month")
	private WebElement ccExpMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement ccExpYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement ccvTxt;
	
	
	@FindBy(id = "book_now")
	private WebElement Btnsubmit;


	public WebElement getTxtBoxFirstName() {
		return txtBoxFirstName;
	}


	public WebElement getTxtBoxLastName() {
		return txtBoxLastName;
	}


	public WebElement getBillingAddress() {
		return billingAddress;
	}


	public WebElement getCcNumber() {
		return ccNumber;
	}


	public WebElement getCcType() {
		return ccType;
	}


	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}


	public WebElement getCcExpYear() {
		return ccExpYear;
	}


	public WebElement getCcvTxt() {
		return ccvTxt;
	}


	public WebElement getBtnsubmit() {
		return Btnsubmit;
	}

	
}
