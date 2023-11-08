package com.Action1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledTextField {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://demoapp.skillrary.com/");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement w1=d1.findElement(By.xpath("//input[@class='form-control']"));
		
		JavascriptExecutor e1=(JavascriptExecutor)d1;
		e1.executeScript("arguments[0].value='Rio'",w1);
		
		
		
		
	}

}
