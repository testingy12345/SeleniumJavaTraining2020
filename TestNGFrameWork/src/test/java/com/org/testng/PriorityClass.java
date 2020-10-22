package com.org.testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityClass {
	public static WebDriver driver;
	@BeforeClass
	public static void launch() {
		System.setProperty("wedriver.chrome.driver",".\\driver\\chromedriver1.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@BeforeMethod
	public void start() {
		Date d=new Date();
		System.out.println("The given date is => "+d);
		
	}
	@Test
	public void test1() {
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("abc");
	}
	@Test
	public void test2() {
		WebElement user=driver.findElement(By.id("pass"));
		user.sendKeys("njb");
	}
	@AfterMethod
	public void end() {
		Date d=new Date();
		System.out.println("The given date is => "+d);
		
	}
	@AfterClass
	public void quit() {
		driver.quit();
	}
}

	
	
	


