package com.new1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Assi8 {
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver d1=new ChromeDriver(opt);
		d1.manage().window().maximize();
		d1.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d1.switchTo().frame(0);
		d1.findElement(By.linkText("Free Mock Tests")).click();
		
		String s1=d1.getWindowHandle();
		Set<String> all_id=d1.getWindowHandles();
		
		for(String str:all_id)
		{
			if(d1.getCurrentUrl().contains("https://www.mocktest.freshersnow.com/home"))
			{
				break;
			}
		}
		WebElement e1=d1.findElement(By.xpath("(//a[@href='https://www.mocktest.freshersnow.com/all-practice-exams'])[1]"));
		Actions act=new Actions(d1);
		act.moveToElement(e1).perform();
		
		
	}

}
