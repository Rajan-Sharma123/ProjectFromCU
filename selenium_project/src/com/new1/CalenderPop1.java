package com.new1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPop1 {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://jqueryui.com/datepicker");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d1.switchTo().frame(0);
//		d1.findElement(By.cssSelector("[type='text']")).click();
//		d1.findElement(By.cssSelector("[data-date='29']")).click();
		d1.findElement(By.cssSelector("[type='text']")).sendKeys("11/06/2001");

		
	}

}
