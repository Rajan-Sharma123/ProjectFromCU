package com.new1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("file:///C:/Users/rjraj/Downloads/iframe.html");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		d1.switchTo().frame(0);
		
//		d1.findElement(By.linkText("Log in")).click();
//		d1.switchTo().frame(1);
//		
//		d1.findElement(By.cssSelector("[class='menu-toggle']")).click();
//		d1.switchTo().frame("FR1");
		
		WebElement wb=d1.findElement(By.cssSelector("[src='https://demowebshop.tricentis.com']"));

		d1.switchTo().frame(wb);
		
		d1.findElement(By.cssSelector("[class='search-box-text ui-autocomplete-input']")).sendKeys("car");
		//d1.switchTo().parentFrame();
		d1.switchTo().defaultContent();
		d1.findElement(By.cssSelector("[href='http://google.com']")).click();
	}

}
