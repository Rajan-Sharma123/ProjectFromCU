package com.Action1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement ans=d1.findElement(By.cssSelector("[name='A']"));
		WebElement ans2=d1.findElement(By.cssSelector("[name='B']"));
		
		Actions act=new Actions(d1);
		act.clickAndHold(ans).perform();
		Thread.sleep(2000);
		act.moveToElement(ans2).perform();
		Thread.sleep(2000);

		//act.clickAndHold(ans2).perform();
		act.release(ans2).perform();
	}

}
