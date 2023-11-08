package com.new1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Authentication1 {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
