package com.Action1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyEnum1 {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://demo.actitime.com/login.do");
		
		d1.findElement(By.cssSelector("[name='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		
	}

}
