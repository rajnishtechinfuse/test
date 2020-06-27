package com.techinfuse.qw;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AT2 {
 
  WebDriver driver;
 
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Rajnish\\chromedriver_win32_Latest\\chromedriver.exe");
 driver = new ChromeDriver();
 driver.get("https://at2-staging.quickwork.co/");
 driver.manage().window().maximize();
 
  }

  @Test
  public void loginTest() throws InterruptedException {
// driver.navigate().to("http://techcanvass.com/corporatetraining.aspx");

//Get page title
//System.out.println(driver.getTitle());
   driver.findElement(By.id("username")).sendKeys("vimalalan007@gmail.com");
driver.findElement(By.id("password")).sendKeys("vimal1234");
driver.findElement(By.className("qw-login-button")).click();
//Assert statement put
 //Thread.sleep(10000);

   Thread.sleep(5000);
   
   driver.findElement(By.className("qw-menu-button")).click();
   Thread.sleep(5000);
   driver.findElements(By.className("qw-menu-item")).get(1).click();
   Thread.sleep(5000);
   driver.findElement(By.className("btn-danger")).click();
   Thread.sleep(5000);

   //working code for create collection click
   /*
   WebElement ele= driver.findElement(By.id("create-collection"));
   System.out.println(ele);
   System.out.println(ele.getTagName());
  System.out.println(ele.getText());
  System.out.println(ele.getSize());
  System.out.println(ele.getAttribute("class"));
  ele.click();

 
  driver.findElement(By.id("automation_name")).sendKeys("QACol1");
  driver.findElement(By.id("collection-next")).click();
  driver.findElement(By.id("collection-complete")).click();
  driver.findElement(By.cssSelector("button[data-title='Start building a journey for your collection.']")).click();

   Thread.sleep(5000);
   
  
  driver.findElement(By.id("new-journey")).click();
  Thread.sleep(5000);
  driver.findElement(By.className("qw-select-input")).click();
  Thread.sleep(5000);
  driver.findElement(By.className("form-control")).sendKeys("HTTP");
  Thread.sleep(5000);

  driver.findElement(By.className("qw-option-content")).click();
  Thread.sleep(5000);
  driver.findElement(By.className("qw-select-option")).click();
  Thread.sleep(5000);
 
  WebElement queryInput = driver.findElement(By.className("CodeMirror"));
  JavascriptExecutor js = (JavascriptExecutor) driver;
  js.executeScript("arguments[0].CodeMirror.setValue(\"" + "hello" + "\");", queryInput);
  Thread.sleep(5000);

  System.out.println(driver.findElements(By.xpath("//*[@class='qw-select-input']")).size());
  WebElement eleoption = driver.findElements(By.xpath("//*[@class='qw-select-input']")).get(2);
  eleoption.click();
  System.out.println(eleoption.getTagName());
  Thread.sleep(5000);
  driver.findElements(By.className("form-control")).get(2).sendKeys("GET");
 
 */
  }


  @AfterTest
  public void afterTest() {
 //driver.close();
  }

}