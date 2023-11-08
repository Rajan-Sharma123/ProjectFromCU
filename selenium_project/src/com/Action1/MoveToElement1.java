package com.Action1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d1= new ChromeDriver();
		d1.manage().window().maximize();
		
		d1.get("https://www.flipkart.com/");
		d1.findElement(By.cssSelector("[class='_30XB9F']")).click();
		
		Thread.sleep(2000);
		
		WebElement web1=d1.findElement(By.cssSelector("[alt='Fashion']"));
		
		
		Actions act=new Actions(d1);
		act.moveToElement(web1).perform();
		Thread.sleep(2000);
		d1.findElement(By.linkText("Men's T-Shirts")).click();
		
		
	}

}
