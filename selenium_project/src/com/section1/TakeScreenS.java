package com.section1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenS {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	WebElement logo=driver.findElement(By.id("nav-logo"));
	File src=logo.getScreenshotAs(OutputType.FILE);
	File dest=new File("./Screenshot/image2.png");
	FileHandler.copy(src, dest);
	}

}
