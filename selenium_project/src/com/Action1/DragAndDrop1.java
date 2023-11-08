package com.Action1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://jqueryui.com/droppable/");
		d1.switchTo().frame(0);
		
		WebElement ans=d1.findElement(By.cssSelector("[id='draggable']"));
		WebElement ans2=d1.findElement(By.cssSelector("[id='droppable']"));
		
		Actions s=new Actions(d1);
		s.dragAndDrop(ans,ans2).perform();
		
		
	}

}
