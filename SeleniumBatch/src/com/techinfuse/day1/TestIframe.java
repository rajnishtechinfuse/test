package com.techinfuse.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Rajnish\\chromedriver_win32_Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.switchTo().frame("a077aa5e");
		
		driver.findElement(By.xpath("/html/body/a/img")).click();
		//driver.close();
		driver.quit();
	}

}
