package com.techinfuse.day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Rajnish\\chromedriver_win32_Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		//driver.ta
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		
		
		
	//	driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Rajnish\\a.txt");
		
		/*driver.findElement(By.id("uploadmode1")).click();
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Rajnish\\FileUpload2.exe");	
	//	Thread.sleep(2000);
		//driver.findElement(By.className("field_check")).click();
		Thread.sleep(2000);
		driver.close();*/
	}

}
