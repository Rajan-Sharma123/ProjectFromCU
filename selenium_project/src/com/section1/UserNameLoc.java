package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserNameLoc {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		
		d1.get("https://punjab.chitkara.edu.in//Interface/index.php");
		
		WebElement us=d1.findElement(By.name("bx033bf8bzfy8dfdxxyf5dy8zxf8z5z8"));
		us.sendKeys("2010991426");
		
		WebElement us2=d1.findElement(By.name("password"));
		us2.sendKeys("c141d37c");
		
		WebElement us3=d1.findElement(By.className("button_send"));
		us3.click();
		 
		
	}

}
