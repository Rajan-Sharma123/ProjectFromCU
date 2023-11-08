package com.new1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivisionPop1 {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://demo.actitime.com/login.do");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d1.findElement(By.cssSelector("[name='username']")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
		d1.findElement(By.cssSelector("[href='/tasks/tasklist.do']")).click();
		d1.findElement(By.xpath("(//div[@class=\"checkbox inactive\"])[1]")).click();
		d1.findElement(By.cssSelector("[class='delete button']")).click();
		
		
		WebElement w1=d1.findElement(By.xpath("//div[contains(text(),'You are about to delete')]"));

		WebDriverWait wait=new WebDriverWait(d1,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(d1.findElement(By.xpath("//div[contains(text(),'You are about to delete 68 tasks')]"))));
		

		
		String str=w1.getText();
		System.out.println(str);
		
	
	}

}
