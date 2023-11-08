package com.Action1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi5 {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d1.findElement(By.cssSelector("[href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
		d1.findElement(By.cssSelector("[href='https://www.facebook.com/OrangeHRM/']")).click();
		d1.findElement(By.cssSelector("[href='https://twitter.com/orangehrm?lang=en']")).click();
		d1.findElement(By.cssSelector("[href='https://www.youtube.com/c/OrangeHRMInc']")).click();
		
		String w1=d1.getWindowHandle();
		Set<String> all_id=d1.getWindowHandles();
		
		for(String id:all_id)
		{
			d1.switchTo().window(id);
			if(!d1.getCurrentUrl().contains("https://www.linkedin.com/company/orangehrm") && !d1.getCurrentUrl().contains("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
				d1.close();
			}
//			
		}
	}

}
