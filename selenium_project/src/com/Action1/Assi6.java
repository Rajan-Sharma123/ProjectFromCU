package com.Action1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi6 {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://demo.actitime.com/login.do");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d1.findElement(By.cssSelector("[name='username']")).sendKeys("admin");
		d1.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager");
		d1.findElement(By.xpath("//div[text()='Login ']")).click();
		
		d1.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
		
		d1.findElement(By.cssSelector("[href='/administration/btlist.do']")).click();
		d1.findElement(By.cssSelector("[unselectable='on']")).click();
		d1.findElement(By.cssSelector("[onchange='nameChanged(this);']")).sendKeys("Rio",Keys.TAB,Keys.DOWN,Keys.TAB,Keys.DOWN,Keys.TAB,Keys.TAB,Keys.ENTER);
		
		Alert alt=d1.switchTo().alert();
		alt.accept();
		
		
	}

}
