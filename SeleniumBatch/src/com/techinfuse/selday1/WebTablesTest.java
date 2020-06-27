package com.techinfuse.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Rajnish\\chromedriver_win32_Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";

		driver.get(baseUrl);
		String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText(); 	
		//    /html/body/center/table/tbody/tr[1]/td[2]
	        System.out.println(innerText); 
		driver.quit();
		}
	}

