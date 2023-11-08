package basic_of_testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ng1 {
	@Test
	public void register()
	{
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://demowebshop.tricentis.com/");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d1.findElement(By.cssSelector("[href='/register']")).click();
		d1.findElement(By.cssSelector("[id='gender-male']")).click();
		d1.findElement(By.cssSelector("[id='FirstName']")).sendKeys("Rajan",Keys.TAB,"Sharma",Keys.TAB,"rjrajan136@gmail.com",Keys.TAB,"123Raj##sharma",Keys.TAB,"123Raj##sharma");
		d1.findElement(By.cssSelector("[id='register-button']")).click();
		
		
	}
	@Test
	public void zlogin()
	{
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://demowebshop.tricentis.com/");
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d1.findElement(By.cssSelector("[href='/login']")).click();
		d1.findElement(By.cssSelector("[class='email']")).sendKeys("rjrajan136@gmail.com",Keys.TAB,"123Raj##sharma");
		d1.findElement(By.cssSelector("[class='button-1 login-button']")).click();
		
	}

}
