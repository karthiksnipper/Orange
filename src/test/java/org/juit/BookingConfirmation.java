package org.juit;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseClass {
	
	public BookingConfirmation() {
	PageFactory.initElements(driver, this);	}
	
	

	@FindBy(id = "order_no")
	private WebElement orderCnfm;



	public WebElement getOrderCnfm() {
		return orderCnfm;
	}	
	
	
}
