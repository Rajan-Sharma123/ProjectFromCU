package com.Action1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTe1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream("C:\\Users\\rjraj\\OneDrive\\Documents\\Rajan Sharma\\dem2.properties");
		Properties pop =new Properties();
		pop.load(fs);
		
		String url=pop.getProperty("url");
		String un=pop.getProperty("un");
		String pwd=pop.getProperty("pwd");
		
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get(url);
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d1.findElement(By.cssSelector("[name='username']")).sendKeys(un,Keys.TAB,pwd,Keys.TAB,Keys.ENTER);
		
		
		//WorkbookFactory.create(false);
		
		
		
		
		
		

		
	
		
	}

}
