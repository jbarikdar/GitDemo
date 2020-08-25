package com.bit.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWTest {

	
	//ChromeDriver driver = new ChromeDriver();
	

	public void macyHW() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manna\\Documents\\JavaLibrary\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.macys.com");
		System.out.println(driver.getTitle() + " " + driver.getCurrentUrl());
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		System.out.println(driver.getTitle() + " " + driver.getCurrentUrl());
		driver.findElement(By.id("standard-sign-up")).click();
		driver.findElement(By.id("ca-profile-firstname")).sendKeys("John");
		driver.findElement(By.id("ca-profile-lastname")).sendKeys("Bangla");
		driver.findElement(By.id("ca-profile-email")).sendKeys("Bangla@desh.com");
		driver.findElement(By.id("ca-profile-password")).sendKeys("abcd123");
		System.out.println(driver.getTitle() + " " + driver.getCurrentUrl());
		//driver.quit();

	}

	public void targetHW() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manna\\Documents\\JavaLibrary\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.target.com");
		System.out.println(driver.getTitle() + " " + driver.getCurrentUrl());
		driver.findElement(By.cssSelector("body.react-rendered")).click();
		driver.findElement(By.id("accountNav-createAccount")).click();
		System.out.println(driver.getTitle() + " " + driver.getCurrentUrl());
		driver.findElement(By.id("username")).sendKeys("email@address.com");
		driver.findElement(By.id("firstname")).sendKeys("John");
		driver.findElement(By.id("lastname")).sendKeys("Bangla");
		driver.findElement(By.id("phone")).sendKeys("1234567890");
		driver.findElement(By.id("password")).sendKeys("abcd123");
		System.out.println(driver.getTitle() + " " + driver.getCurrentUrl());
		//driver.quit();

	}
}
