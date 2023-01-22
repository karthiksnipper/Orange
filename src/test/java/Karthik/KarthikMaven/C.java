package Karthik.KarthikMaven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.tc.SampleStatic;

import com.graphbuilder.struc.LinkedList;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C {
	
	public static void main(String[] args) throws Throwable {
		C ss = new C();
		
	ss.booking();	
		
	}

	public void booking() throws Throwable {
	BaseClass bc = new BaseClass ();
	ExcelDatas datas = new ExcelDatas();

	bc.getDriver();
	bc.enterApplyUrl("http://adactinhotelapp.com/");
	bc.maximizeWindow();
	WebElement txtUsername = bc.elementById("username");
	bc.elementSendkeys(txtUsername, "Satheeshkumarjeya");
	
	WebElement txtPassword = bc.elementById("password");
	String pas1 = datas.getDataFromCell("datas", 2, 1);
	bc.elementSendkeys(txtPassword, pas1);

	WebElement btnLogin = bc.elementById("login");
	bc.elementClick(btnLogin);
	
	Thread.sleep(3000);
	
	WebElement locationDD = bc.elementById("location");
	String locationSel = datas.getDataFromCell("datas", 2, 2);
	bc.selectByText(locationDD, locationSel);

	WebElement hotelDD = bc.elementById("hotels");
	String hotelSel = datas.getDataFromCell("datas", 2, 3);
	bc.selectByText(hotelDD, hotelSel);

	WebElement roomDD = bc.elementById("room_type");
	String roomSel = datas.getDataFromCell("datas", 2, 4);
	bc.selectByText(roomDD, roomSel);

	WebElement roomNoDD = bc.elementById("room_nos");
	String noOfRoomSel = datas.getDataFromCell("datas", 2, 5);
	bc.selectByText(roomNoDD, noOfRoomSel);
	
	WebElement dateDD = bc.elementById("datepick_in");
	String dateSel = datas.getDataFromCell("datas", 2, 6);
	bc.elementSendkeys(dateDD, dateSel);	
	
	WebElement outDateDD = bc.elementById("datepick_out");
	String outDateSel = datas.getDataFromCell("datas", 2, 7);
	bc.elementSendkeys(outDateDD, outDateSel);	
	
	WebElement adultPerDD = bc.elementById("adult_room");
	String adultSel = datas.getDataFromCell("datas", 2, 8);
	bc.selectByText(adultPerDD, adultSel);	
	
	WebElement childPerDD = bc.elementById("child_room");
	String childSel = datas.getDataFromCell("datas", 2, 9);
	bc.selectByText(childPerDD, childSel);	
	
	WebElement searchBtn = bc.elementById("Submit");
	bc.elementClick(searchBtn);
	Thread.sleep(2500);
	
	WebElement radioSelHotel = bc.elementById("radiobutton_0");
	bc.elementClick(radioSelHotel);
	
	WebElement continueBtn = bc.elementById("continue");
	bc.elementClick(continueBtn);
	Thread.sleep(3500);
	
	WebElement billingFirstName = bc.elementById("first_name");
	String billingName = datas.getDataFromCell("datas", 2 , 0);
	bc.elementSendkeys(billingFirstName, billingName);
	
	WebElement billingLastName = bc.elementById("last_name");
	String billingLstName = datas.getDataFromCell("datas", 2 , 0);
	bc.elementSendkeys(billingLastName, billingLstName);

	WebElement billingAddress = bc.elementById("address");
	String textAddress = datas.getDataFromCell("datas", 2 , 10);
	bc.elementSendkeys(billingAddress, textAddress);

	WebElement ccNo = bc.elementById("cc_num");
	String ccText = datas.getDataFromCell("datas", 2 , 11);
	bc.elementSendkeys(ccNo, ccText);	
	
	WebElement ccType = bc.elementById("cc_type");
	String ccTypeText = datas.getDataFromCell("datas", 2 , 12);
	bc.selectByText(ccType, ccTypeText);	
	
	WebElement ccExpiryMonth = bc.elementById("cc_exp_month");
	String ccExpiryText = datas.getDataFromCell("datas", 2 , 13);
	bc.selectByText(ccExpiryMonth, ccExpiryText);	
	
	WebElement ccExpiryYear = bc.elementById("cc_exp_year");
	String ccExpYearText = datas.getDataFromCell("datas", 2 , 14);
	bc.selectByText(ccExpiryYear, ccExpYearText);	
	
	WebElement cvvNo = bc.elementById("cc_cvv");
	String cvvNoText = datas.getDataFromCell("datas", 2 , 15);
	bc.elementSendkeys(cvvNo, cvvNoText);	
	
	WebElement bookNow = bc.elementById("book_now");
	bc.elementClick(bookNow);
	Thread.sleep(10000);
	
	WebElement orderId1 = bc.elementById("order_no");
	
	
	String valueOrder = bc.insertedValueTextBox(orderId1, "value");
System.out.println(valueOrder);
	datas.writeCellData("datas", 2, 16, valueOrder);
//	
	
	}
		
	}
		
