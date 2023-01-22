package org.juit;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotels extends BaseClass {
	
	public SearchHotels() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "location")
	private WebElement ddLocation;
	
	@FindBy(id = "hotels")
	private WebElement ddHotel;
	
	@FindBy(id = "room_type")
	private WebElement ddRoomType;
	
	@FindBy(id = "room_nos")
	private WebElement ddRoomNo;
	
	@FindBy(id = "datepick_in")
	private WebElement dateIn;
	
	@FindBy(id = "datepick_out")
	private WebElement dateOut;

	@FindBy(id = "adult_room")
	private WebElement ddAdultNo;
	
	@FindBy(id = "child_room")
	private WebElement ddChildNo;
	
	@FindBy(id = "Submit")
	private WebElement btnSearch;
	
	//checkout_span
	@FindBy(id = "checkout_span")
	private WebElement errorMsg;	
	
	public WebElement getDdLocation() {
		return ddLocation;
	}

	public WebElement getDdHotel() {
		return ddHotel;
	}

	public WebElement getDdRoomType() {
		return ddRoomType;
	}

	public WebElement getRoomNo() {
		return ddRoomNo;
	}

	public WebElement getDateIn() {
		return dateIn;
	}

	public WebElement getDateOut() {
		return dateOut;
	}

	public WebElement getDdAdultNo() {
		return ddAdultNo;
	}

	public WebElement getDdChildNo() {
		return ddChildNo;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getErrorMsg() {
		return errorMsg;
	}
	
	public void searchListHotel (String data,String hotelname, String roomtype, String roomnum, String dateout, String datein, String adultnum, String childnum ){
		
//		String userText = getDataFromCell("datas", 2, 2);
		selectByText(getDdLocation(), data);
		
		
//		String hotelText = getDataFromCell("datas", 2, 3);
		selectByText(getDdHotel(), hotelname);
		
//		String roomText = getDataFromCell("datas", 2, 4);
		selectByText(getDdRoomType(), roomtype);
		
//		String roomNoText = getDataFromCell("datas", 2, 5);
		selectByText(getRoomNo(), roomnum);
		

		//String ddOutDateText = getDataFromCell("datas", 2, 7);
		getDateOut().clear();
		elementSendkeys(getDateOut(), dateout);

//		String ddDateText = getDataFromCell("datas", 2, 6);
		getDateIn().clear();
		elementSendkeys(getDateIn(), datein);
		

//		String ddAdultsText = getDataFromCell("datas", 2, 8);
		selectByText(getDdAdultNo(), adultnum);
		
		WebElement ddChilds = hotel.getDdChildNo();
//		String ddChildsText = getDataFromCell("datas", 2, 9);
		selectByText(ddChilds, childnum);
		
		WebElement btnSumbit = hotel.getBtnSearch();
		elementClick(btnSumbit);

	}
	
	
}
