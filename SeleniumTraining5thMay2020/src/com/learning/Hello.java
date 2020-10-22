package com.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hello {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println("Hi");
	 System.setProperty("webdriver.gecko.driver","D:\\Browser\\geckodriver.exe\\");
	 WebDriver driver=new FirefoxDriver();
	 driver.get("https://www.google.co.in/?");
	 
	 

	}

}
