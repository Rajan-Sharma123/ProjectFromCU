package com.Action1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		d1.findElement(By.cssSelector("[class='_30XB9F']")).click();
		Thread.sleep(2000);
		d1.findElement(By.cssSelector("[class='Pke_EE']")).sendKeys("iphone",Keys.ENTER);
		
		List<WebElement> a1=d1.findElements(By.cssSelector("[class=\"_4rR01T\"]"));
		List<WebElement> a2=d1.findElements(By.cssSelector("[class='_30jeq3 _1_WHN1']"));
		

		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i).getText()+" "+a2.get(i).getText());
		}
		
	}

}
