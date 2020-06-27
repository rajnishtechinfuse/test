package com.techinfuse.selday1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Rajnish\\chromedriver_win32_Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("");
		//driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='txtName']")).sendKeys("rajnish");
      //\  driver.findElement(By.cssSelector("input[name='btnSubmit']")).click();
        
        String color = driver.findElement(By.xpath("//*[@id=\'Form1\']/div[5]/a/b/u")).getCssValue("color");
        String fweight = driver.findElement(By.xpath("//*[@id=\'Form1\']/div[5]/a/b/u")).getCssValue("font-weight");

        System.out.println(color);
        System.out.println(fweight);
		
		//driver.close();
	}
}
