package Karthik.KarthikMaven;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Single {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
driver.get("https://www.amazon.in/");

driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
driver.findElement(By.xpath("//input[@type='submit']")).click();

driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (64GB) - Black']")).click();
Set<String> allWindId = driver.getWindowHandles();
System.out.println(allWindId);
	
}
	
}
