package com.techinfuse.selday1;

import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablesTest {
	    public static void main(String[] args) throws ParseException {
				    	System.setProperty("webdriver.chrome.driver", "C:\\Rajnish\\chromedriver_win32\\chromedriver.exe");
						WebDriver driver = new ChromeDriver();
						driver.get("http://demo.guru99.com/test/web-table-element.php");   
			//*[@id="leftcontainer"]/table/thead/tr/th[1]
	        //No.of Columns
	        List  col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	        System.out.println("No of cols are : " +col.size()); 
	        //No.of rows 
	        List  rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td")); 
	        System.out.println("No of rows are : " + rows.size());
	       
	        WebElement baseTable = driver.findElement(By.tagName("table"));
	        
	        baseTable.getCssValue(arg0)
			  
			 //To find 2nd row of table
			 WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]"));
	         String rowtext = tableRow.getText();
			 System.out.println("Third row of table : "+rowtext);
			    
			    //to get 4th row's 1st column data
			    WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[1]"));
			    String valueIneed = cellIneed.getText();
			    System.out.println("Cell value is : " + valueIneed); 
			    
			  //*[@id="leftcontainer"]/table/tbody/tr[3]/td[1]
	        
	     
	        driver.close();
	    
	}

}
