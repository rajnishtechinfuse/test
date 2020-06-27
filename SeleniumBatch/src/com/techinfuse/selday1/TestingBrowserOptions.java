package com.techinfuse.selday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestingBrowserOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Rajnish\\chromedriver_win32_Latest\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(option);

		driver.get("http://techinfuse.co/");
	}

}
