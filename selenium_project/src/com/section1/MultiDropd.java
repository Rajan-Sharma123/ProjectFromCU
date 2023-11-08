package com.section1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropd {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement w1=d1.findElement(By.xpath("//select[@id='ide']"));
		Select s=new Select(w1);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.deselectByIndex(0);
		
		//Options();
		
		//List<WebElement> opt=s.getOptions();
			List<WebElement>mp=s.getAllSelectedOptions();
		
		for(WebElement ans:mp)
		{
			System.out.println(ans.getText());
		}
	}

}
