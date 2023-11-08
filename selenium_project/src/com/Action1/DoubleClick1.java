package com.Action1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick1 {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement dc=d1.findElement(By.cssSelector("[ondblclick='myFunction()']"));
		Actions act=new Actions(d1);
		act.doubleClick(dc).perform();
	}

}
