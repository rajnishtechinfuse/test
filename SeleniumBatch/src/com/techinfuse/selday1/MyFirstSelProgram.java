package com.techinfuse.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSelProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Rajnish\\chromedriver_win32_Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
	//	driver.findElement(By.name("userName")).sendKeys("Venu");
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("Venu");
		
		driver.findElement(By.name("password")).sendKeys("sadds");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("SIGN-ON")).click();
		
		driver.navigate().back();
		driver.navigate().forward();
		String actualTitle =driver.getTitle();
		
		System.out.println(actualTitle);
		System.out.println(driver.getCurrentUrl());
		if(actualTitle.equals("Sign-on: Mercury Tour")){
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		driver.close();


	}

}
