package com.techinfuse.selday1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Rajnish\\chromedriver_win32_Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.guru99.com/");
		//driver.manage().window().maximize();
		
        Actions action = new Actions(driver);
        
        Thread.sleep(5000);
        //Find web element where you want to do mouse hover
        WebElement element = driver.findElement(By.xpath("//*[@id=\"menu-3688-particle\"]/nav/ul/li[2]/div/span[1]/span"));
        Thread.sleep(3000);
        //Mouse hover event for 1st level
        action.moveToElement(element).build().perform();
        
        Thread.sleep(2000);
        WebElement au = driver.findElement(By.xpath("//*[@id=\"menu-3688-particle\"]/nav/ul/li[2]/ul/li/div/div[3]/ul/li[3]/a/span/span"));
        //Mouse hover for 2nd level
        //action.moveToElement(au).build().perform();
        au.click();
       // Thread.sleep(2000);

      //  WebElement se = driver.findElement(By.xpath("//*[@id=\"menu-3688-particle\"]/nav/ul/li[2]/ul/li/div/div[3]/ul/li[3]/a/span/span"));
       // se.click();
      
		driver.close();
	}	
}
