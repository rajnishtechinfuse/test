package com.techinfuse.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Rajnish\\personal\\Shubham\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Rajnish\\a.txt");
		
		driver.findElement(By.className("field_check")).click();

	}

}
