package com.techinfuse.selday1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Rajnish\\chromedriver_win32_Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Alert Message handling
		
        driver.get("http://demo.guru99.com/test/delete_customer.php");			                		
     	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).click();		
        		
         Thread.sleep(3000);
       //  driver.switchTo().alert().accept();
         driver.switchTo().alert().dismiss();	
        		
        // Capturing alert message.    
     //  String alertMessage= driver.switchTo().alert().getText();		
      //  System.out.println(alertMessage);		


       // Thread.sleep(1000);
        		
        // Accepting alert		
     //  alert.accept();		
       
    /*   if(alertMessage.equals("Do you really want to delete this Customer?")) {
    	   System.out.println("Test Passed");    
       }
       else {
    	   System.out.println("Test Failed");   
	}*/
}

}
