package com.org.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver=null;
	@Parameters("browsername")
	@Test
	public void t1(String name) {
		if(name.equals("ff")) {
			System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(name.equals("chrome")) {
			System.setProperty("webdriver.gecko.driver",".\\driver\\chromedriver1.exe");
			driver=new ChromeDriver();
			
		}
		else {
			System.out.println("Not Matched");
		}
		driver.get("https://www.facebook.com/");
		driver.quit();
		System.out.println("Quit the browser");
	}

}
