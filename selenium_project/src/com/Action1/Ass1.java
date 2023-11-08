package com.Action1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.google.com");
		d1.manage().window().maximize();
		Thread.sleep(2000);
		WebElement w1=d1.findElement(By.cssSelector("[aria-label='Gmail (opens a new tab)']"));
		Actions act=new Actions(d1);
		act.contextClick(w1).perform();
	}

}
