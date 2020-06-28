package com.techinfuse.selday1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f1() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Rajnish\\personal\\Shubham\\chromedriver_win32\\chromedriver.exe");
		
	  ChromeOptions c = new ChromeOptions();
	  c.addArguments("headless");
	  WebDriver driver = new ChromeDriver(c);
		driver.get("http://demo.guru99.com/test/upload/");
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Rajnish\\a.txt");
		
		driver.findElement(By.className("field_check")).click();
  }
  
  @Test
  public void f2() {
	  System.out.println("1");
  }
  
  @Test
  public void f3() {
	  System.out.println("1");
  }
  @Test
  public void f4() {
	  System.out.println("1");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("2");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("3");
  }

}
