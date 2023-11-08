package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement dopd=d1.findElement(By.xpath("//select[@id='course']"));
		Select s=new Select(dopd);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByValue("java");
		Thread.sleep(2000);
		s.selectByVisibleText("Javascript");
	}

}
