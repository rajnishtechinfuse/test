package com.techinfuse.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		//setting the system property for the required browser
		System.setProperty("webdriver.chrome.driver", "C:\\Rajnish\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		try {
		
		driver.manage().window().maximize();
		driver.get("");
		
		//For explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 3);
		//locators
		driver.findElement(By.name("txtName")).sendKeys("KK");
		driver.findElement(By.id("txtEmail")).sendKeys("abc@abc.com");
		driver.findElement(By.id("txtContact")).sendKeys("000000000");
		driver.findElement(By.id("txtMessage")).sendKeys("Hello");
				
		
		driver.findElement(By.id("btnSubmit")).click();
		
		//Here we have explicitly wait on button
		//WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnrSubmit")));

		WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnSubmit")));
		submitButton.click();
						
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			driver.close(); //To close the browser all instances.
		}
		
	}
}
