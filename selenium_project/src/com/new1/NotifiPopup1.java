package com.new1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotifiPopup1 {
	public static void main(String[] args) {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver d1=new ChromeDriver(opt);
		d1.manage().window().maximize();
		d1.get("https://www.yatra.com/");
	}

}
