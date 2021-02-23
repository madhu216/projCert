package com.qa.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class EdurekaPHP {
	public static WebDriver driver;

	@BeforeClass
		public static void setup()
		{

	         System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://github.com/madhu216/projCert/tree/master/website");
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			String title = driver.getTitle();
			System.out.println(title);
		}
	@Test
	public void phpmainpage() throws InterruptedException {
		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.findElement(By.linkText("create an issue")).click();
		
	}
	@AfterClass
	public static void closebrowser() {
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.close();
		
	}
	
}
