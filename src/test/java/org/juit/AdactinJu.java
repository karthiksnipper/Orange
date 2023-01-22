package org.juit;
import java.io.IOException;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebElement;



public class AdactinJu extends BaseClass {
	
	@BeforeClass
	public static void beforeClass() {
		getDriver();
		maximizeWindow();
		implicitWait();
		enterApplyUrl("http://adactinhotelapp.com/");

	}
	@Before
	public void before() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		}
	@After
	public void after() {
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
	
	
	@Test
	public void tc1() throws Throwable {
	
		
		LoginPage lo = new LoginPage ();
		
		lo.firstLogin(getDataFromCell("datas", 2, 0), getDataFromCell("datas", 2, 1));
	
		WebElement welcomeMsg = lo.getTxtWelcome();
		String textBox = insertedValueTextBox(welcomeMsg, "value");
		boolean contains = textBox.contains(insertedValueTextBox(welcomeMsg, "value"));
		Assert.assertTrue("verify welcome", contains);
		
	}
	@Test
	public void tc2() throws Throwable {
		SearchHotels hotel = new SearchHotels();
	
		String userText = getDataFromCell("datas", 2, 2);
		
	
		String hotelText = getDataFromCell("datas", 2, 3);
		
		
		String roomText = getDataFromCell("datas", 2, 4);
		
		String roomNoText = getDataFromCell("datas", 2, 5);
		

		String ddOutDateText = getDataFromCell("datas", 2, 7);

		String ddDateText = getDataFromCell("datas", 2, 6);
		

		String ddAdultsText = getDataFromCell("datas", 2, 8);
		
		String ddChildsText = getDataFromCell("datas", 2, 9);
	
		hotel.searchListHotel(userText, hotelText, roomText, roomNoText, ddOutDateText, ddDateText, ddAdultsText, ddChildsText);
		WebElement btnSumbit = hotel.getBtnSearch();
		elementClick(btnSumbit);
		
		WebElement errorOutMsg = hotel.getErrorMsg();
		String errorOutTxt = getText(errorOutMsg);
		Assert.assertEquals("Check-Out", errorOutTxt);
		System.out.println(errorOutTxt);
		
		
	}


@Test
public void tc4() throws IOException{
	SelectHotel selHotel = new SelectHotel ();
	
	WebElement radioBtn = selHotel.getRadioBtn();
	radioBtn.click();
	WebElement continueBtn = selHotel.getBtnContinue();
	continueBtn.click();
	
	
}
@Test
public void tc5() throws IOException {
	BookingPage bPage = new BookingPage();
	
	
	WebElement billingFirstName = bPage.getTxtBoxFirstName();
	String billingName = getDataFromCell("datas", 2 , 0);
	elementSendkeys(billingFirstName, billingName);
	
	WebElement billingLastName = bPage.getTxtBoxLastName();
	String billingLstName = getDataFromCell("datas", 2 , 0);
	elementSendkeys(billingLastName, billingLstName);

	WebElement billingAddress = bPage.getBillingAddress();
	String textAddress = getDataFromCell("datas", 2 , 10);
	elementSendkeys(billingAddress, textAddress);

	WebElement ccNo = bPage.getCcNumber();
	String ccText = getDataFromCell("datas", 2 , 11);
	elementSendkeys(ccNo, ccText);	
	
	WebElement ccType = bPage.getCcType();
	String ccTypeText = getDataFromCell("datas", 2 , 12);
	selectByText(ccType, ccTypeText);	
	
	WebElement ccExpiryMonth = bPage.getCcExpMonth();
	String ccExpiryText = getDataFromCell("datas", 2 , 13);
	selectByText(ccExpiryMonth, ccExpiryText);	
	
	WebElement ccExpiryYear = bPage.getCcExpYear();
	String ccExpYearText = getDataFromCell("datas", 2 , 14);
	selectByText(ccExpiryYear, ccExpYearText);	
	
	WebElement cvvNo = bPage.getCcvTxt();
	String cvvNoText = getDataFromCell("datas", 2 , 15);
	elementSendkeys(cvvNo, cvvNoText);	
	
	WebElement bookNow = bPage.getBtnsubmit();
	elementClick(bookNow);
//	Thread.sleep(10000);
	
	
	
}


@Test
public void tc6() throws Throwable {
BookingConfirmation cnf = new BookingConfirmation();
	
	WebElement orderId1 = cnf.getOrderCnfm();
	String valueOrder = insertedValueTextBox(orderId1, "value");
System.out.println(valueOrder);
	writeCellData("datas", 2, 16, valueOrder);
	

}


}


