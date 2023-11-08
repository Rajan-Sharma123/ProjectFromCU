package com.Action1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAction1 {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.zomato.com/login");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d1.get("https://www.zomato.com/india");
		
		
	    WebElement wb=d1.findElement(By.xpath("//h5[text()='Malaysia']"));
		JavascriptExecutor e1=(JavascriptExecutor)d1;
		//e1.executeScript("window.scrollBy(0,2000)");
		e1.executeScript("arguments[0].scrollIntoView(false)",wb);
		//wb.click();
		
	}

}
