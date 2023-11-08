package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804923%7Cb%7Cfacebook%7C&placement=&creative=550525804923&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-592856129%26loc_physical_ms%3D9302548%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjw4bipBhCyARIsAFsieCyEKz9je8z_7wueHNLA3uGr7VhnW8lNgEBHHOTmHaA2sH-_amNIz8UaAgJ-EALw_wcB");
	    
		WebElement e1=d1.findElement(By.xpath("//select[@aria-label='Day']"));
		WebElement e2=d1.findElement(By.xpath("//select[@aria-label='Month']"));
		
		Select s=new Select(e1);
		Select s2=new Select(e2);
		
		s.selectByIndex(2);
		Thread.sleep(200);
		s.selectByValue("6");
		Thread.sleep(200);
		s2.selectByIndex(3);
		
		if(s.isMultiple())
		{
			System.out.println("It is multi-select");
		}
		else
		{
			System.out.println("It is a single-select");
		}
	
	}

}
