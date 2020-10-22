package org.fb.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class Instagram {
	public static WebDriver driver;
	@Given("Launching the Instagram website")
	public void launching_the_Instagram_website() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Chrome Driver is initialized");
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
		System.out.println("Instagram website is Launched");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The Current Url is => : "+currentUrl);
        System.out.println("===================================================");
		String title = driver.getTitle();
		System.out.println("The Current Title is => : "+title);
        System.out.println("===================================================");
        System.out.println("Clicked on login Button");
        WebElement login=driver.findElement(By.xpath("//span[contains(text(),'Phone number, username, or email')]"));
		login.sendKeys("vipinteka032");
		WebElement pwd=driver.findElement(By.xpath("//span[contains(text(),'Password')]"));
		pwd.sendKeys("REODEO2018 ");
		WebElement submit=driver.findElement(By.xpath("//div[contains(text(),'Log In')]"));
		submit.click();
		
		Thread.sleep(5000);

		System.out.println("QUIT");
		
		driver.quit();
		System.out.println("Quit the Browser");
	    
	    
	}

}
