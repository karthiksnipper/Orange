package Karthik.KarthikMaven;


import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ab {
	public static void main(String[] args) throws IOException, AWTException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	Robot rb = new Robot ();
	rb.keyPress(KeyEvent.VK_ESCAPE);
	rb.keyRelease(KeyEvent.VK_ESCAPE);
	WebElement searchBox = driver.findElement(By.xpath("//*[@type='text']"));
	searchBox.sendKeys("iphone");
	
	} 
	
	
	
	
	}

