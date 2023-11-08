package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserIdLoc {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		
		d1.get("https://www.amazon.in/?ie=UTF8&tag=googmantxtdsk80-21&ascsubtag=_k_Cj0KCQjwj5mpBhDJARIsAOVjBdop-L6qyJim1Qg_JocB6j4JSJtojCnlxCpm9FCqnS1ZBZMl3kJqRX0aAgFjEALw_wcB_k_&gclid=Cj0KCQjwj5mpBhDJARIsAOVjBdop-L6qyJim1Qg_JocB6j4JSJtojCnlxCpm9FCqnS1ZBZMl3kJqRX0aAgFjEALw_wcB");
		
		WebElement searchbox =  d1.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Dragon");
	}

}
