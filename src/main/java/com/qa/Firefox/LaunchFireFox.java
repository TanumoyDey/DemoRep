package com.qa.Firefox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "/Users/kishu/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");
		driver.findElement(By.name("username")).sendKeys("Tanumoy");
		driver.findElement(By.name("password")).sendKeys("test@123");
		//WebElement loginbtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		WebElement loginbtn = driver.findElement(By.className("btn btn-small"));
		clickElEmentByJS(loginbtn, driver);
		
	}

	
	public static void clickElEmentByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click", driver);

		
		
	}

}
