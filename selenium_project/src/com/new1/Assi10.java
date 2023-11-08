package com.new1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assi10 {
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver d1=new ChromeDriver(opt);
		d1.manage().window().maximize();
		d1.get("https://www.irctc.co.in/nget/train-search");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d1.findElement(By.cssSelector("[dateformat='dd/mm/yy']")).click();
		
		
		while(true)
		{
			String month=d1.findElement(By.cssSelector("[class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
			String year=d1.findElement(By.cssSelector("[class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
			if(month.equals("November") && year.equals("2023"))
			{
				d1.findElement(By.xpath("(//span[@class='ui-state-default ui-state-disabled ng-tns-c58-10 ng-star-inserted'])[4]")).click();
				break;
			}
			else
			{
				d1.findElement(By.cssSelector("[class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
			}
		}
	}

}
