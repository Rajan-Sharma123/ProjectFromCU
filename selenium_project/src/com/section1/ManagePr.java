package com.section1;





import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;



public class ManagePr {
	public static void main(String[] args) {
		WebDriver d1=new ChromeDriver();
		//Options op = d1.manage();
		
		//Window win=op.window();
		d1.get("https://www.amazon.in/events/greatindianfestival?tag=googmantxtmob96-21&ascsubtag=_k_Cj0KCQjw7JOpBhCfARIsAL3bobctZqyinkPkhEshYAwWfRqwbjUzDIjWBckW7aOG1El-BtG36LLAXZMaAifAEALw_wcB_k_&gclid=Cj0KCQjw7JOpBhCfARIsAL3bobctZqyinkPkhEshYAwWfRqwbjUzDIjWBckW7aOG1El-BtG36LLAXZMaAifAEALw_wcB");
		//win.maximize();
		//win.minimize();
		//win.fullscreen();
		//win.getPosition();
		d1.manage().window().maximize();
		//d1.manage().window().getSize();\
		Dimension dm=new Dimension(800,800); 
		Point pt=new Point(400,300);
		
		d1.manage().window().setSize(dm);
		//d1.manage().window().setPosition(pt);
		
		System.out.println(d1.manage().window().getSize());
		System.out.println(d1.manage().window().getPosition());
		
		
	}

}
