package com.techinfuse.selday1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTest2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Rajnish\\chromedriver_win32_Latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/mercurysignon.php");
		driver.manage().window().maximize();
		FileInputStream fs = new FileInputStream("C:\\Rajnish\\Book1.xlsx");
		XSSFWorkbook xw = new XSSFWorkbook(fs);
		XSSFSheet xs = xw.getSheetAt(0);
		for (int row= 1; row <= xs.getLastRowNum(); row++) {
			int col =1;
			XSSFCell   user, pass;
			user = xs.getRow(row).getCell(col);
			pass = xs.getRow(row).getCell(col+1);
			System.out.println(user.toString());
			System.out.println(pass.toString());
			
			driver.findElement(By.name("userName")).sendKeys(user.toString());
		    driver.findElement(By.name("password")).sendKeys(pass.toString());
		    driver.findElement(By.name("login")).click();
		    Thread.sleep(2000);
		   // driver.switchTo().alert().accept();
		       // driver.switchTo().alert().dismiss();
		   // Thread.sleep(2000);
			//driver.findElement(By.xpath("//*[@id='txtLoginid']")).clear();
		    //driver.findElement(By.xpath("//*[@id='txtpassword']")).clear();

		}
		
		driver.close();

	}

}
