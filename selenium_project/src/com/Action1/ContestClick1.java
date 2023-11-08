package com.Action1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContestClick1 {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://pokemonshowdown.com/");
		
	}

}
