package com.techinfuse.selday1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingCSS {

	public static void main(String[] args) {
		//setting the system property for the required browser
		System.setProperty("webdriver.chrome.driver", "C:\\Rajnish\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		driver.get("http://techinfuse.co");
	/*	try {
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//locators
		driver.findElement(By.name("txtNkkkkkkkame")).sendKeys("KK");
		driver.findElement(By.id("txtEmail")).sendKeys("abc@abc.com");
										
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			driver.close(); //To close the browser all instances.
		}
		*/
		
		
				
	}
}
