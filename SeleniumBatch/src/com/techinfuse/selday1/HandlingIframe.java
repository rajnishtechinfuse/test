package com.techinfuse.selday1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Technical\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/guru99home/");

        driver.manage().window().maximize();
        driver.switchTo().frame("a077aa5e");
      //  driver.switchTo().frame(0);
      //  driver.switchTo().frame(driver.findElement(By.xpath("................")));

        Thread.sleep(2000);
        driver.findElement(By.xpath("html/body/a/img")).click();
		//driver.close();
	}
}
