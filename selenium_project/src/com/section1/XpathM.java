package com.section1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathM {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver d1=new ChromeDriver();
		
		d1.manage().window().maximize();
		d1.get("https://demo.actitime.com/login.do");
//		Options opt=d1.manage();
//		Timeouts tim=opt.timeouts();
//		tim.implicitlyWait(Duration.ofSeconds(20));
		
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		d1.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		d1.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		d1.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//Thread.sleep(2000);
		
		
		d1.findElement(By.id("container_tasks")).click();
		
		d1.findElement(By.className("addNewButton")).click();
		//Thread.sleep(2000);
		
		d1.findElement(By.cssSelector("[class='item createNewCustomer']")).click();
		
		//Thread.sleep(2000);
		
		d1.findElement(By.cssSelector("[class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Dragon");
		//Thread.sleep(2000);
		
		d1.findElement(By.xpath("//div[contains(text(),'Create Customer')]")).click();
		
		
		TakesScreenshot ts=(TakesScreenshot)d1;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/image.png");
		org.openqa.selenium.io.FileHandler.copy(src,dest);
		
	
	}

}
