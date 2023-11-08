package com.Action1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ass3 {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d1.manage().window().maximize();
		d1.get("https://demo.actitime.com/login.do");
		String s1=d1.getTitle();
		
		d1.findElement(By.cssSelector("[name='username']")).sendKeys("admin");
		d1.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager",Keys.ENTER);
		WebDriverWait wait=new WebDriverWait(d1,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(d1.findElement(By.id("container_tasks"))));
		
		String s2=d1.getTitle();
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.equals(s2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

		
	}

}
