package com.new1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assi11 {
	public static void main(String[] args) throws IOException {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		FileInputStream fs=new FileInputStream("C:\\Users\\rjraj\\OneDrive\\Documents\\Rajan Sharma\\RAJAN SHARMA\\dem3.properties");
		Properties pop=new Properties();
		pop.load(fs);
		
		String url=pop.getProperty("url");
		String fname=pop.getProperty("fname");
		String sname=pop.getProperty("sname");
		String mobile=pop.getProperty("mobile");
		String pwd=pop.getProperty("pwd");
		String day1=pop.getProperty("day");
		String month1=pop.getProperty("month");
		String year1=pop.getProperty("year");
		d1.get(url);
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d1.findElement(By.cssSelector("[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		d1.findElement(By.cssSelector("[name='firstname']")).sendKeys(fname,Keys.TAB,sname,Keys.TAB,mobile,Keys.TAB,pwd);
		
		WebElement e1=d1.findElement(By.id("day"));
		Select s1=new Select(e1);
		s1.selectByVisibleText(day1);
		
		WebElement e2=d1.findElement(By.id("month"));
		Select s2=new Select(e2);
		s2.selectByVisibleText(month1);
		
		WebElement e3=d1.findElement(By.id("year"));
		Select s3=new Select(e3);
		s3.selectByVisibleText(year1);

		
		
		d1.findElement(By.xpath("//label[text()='Male']")).click();
		
		
		
		
	}

}
