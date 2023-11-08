package com.Action1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {
	public static void main(String[] args) {
		WebDriver d1= new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//d1.findElement(By.cssSelector("[onclick='jsAlert()']")).click();
		//d1.findElement(By.cssSelector("[onclick='jsConfirm()']")).click();
		d1.findElement(By.cssSelector("[onclick='jsPrompt()']")).click();
		
		
		
		Alert alt=d1.switchTo().alert();
		String str=alt.getText();
		alt.sendKeys("Dragon");
		alt.accept();
		
		System.out.println(str);
		
		
	}

}
