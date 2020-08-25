package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	
	ChromeDriver dr = new ChromeDriver();
	
	public void targetTest() {
	//open BLANK Chrome browser
	// System.setProperty("webdriver.chrome.driver","C:\\Users\\manna\\Documents\\JavaLibrary\\chromedriver.exe");
	
	//click on any element
	dr.get("https://www.target.com");
	//click on ANY Element
	dr.findElement(By.xpath("//a[@id = 'account' and @class = "
			+ "'Link-sc-1khjl8b-0 bTKAgl AccountLink-gx13jw-1 cAbFPs']")).click();
	dr.findElement(By.xpath("//div[contains(text(),'Create account')]")).click();
	dr.quit();
	}
	
	
	public void macysTest() {
		dr.get("https://www.macys.com");
		dr.findElement(By.id("myRewardsLabel-container")).click();
		dr.findElement(By.id("email")).sendKeys("bittech@tech.com");
		dr.findElement(By.id("pw-input")).sendKeys("password");
		dr.quit();
	}
}
