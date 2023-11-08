package com.Action1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.facebook.com/");
		d1.findElement(By.cssSelector("[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		d1.findElement(By.cssSelector("[name='firstname']")).sendKeys("Rajan",Keys.TAB,"Sharma",Keys.TAB,"65676475",Keys.TAB,"adfdfs",Keys.TAB,Keys.TAB,Keys.DOWN,Keys.DOWN,Keys.TAB,Keys.ARROW_UP,Keys.ARROW_UP,Keys.TAB,Keys.DOWN,Keys.DOWN,Keys.TAB,Keys.TAB,Keys.RIGHT,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
	}

}
