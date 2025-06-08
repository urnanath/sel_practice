package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class prac_1 {

	WebDriver driver= new ChromeDriver();
	
	@BeforeTest
	public void start()
	{	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.theonlinecalculator.com/");
	}
	
	
	@Test
	public void action() throws InterruptedException
	{	
		driver.findElement(By.name("six")).click();
		Thread.sleep(300);
		driver.findElement(By.name("five")).click();
		Thread.sleep(500);
		driver.findElement(By.name("multiply")).click();	
		Thread.sleep(500);
		
		driver.findElement(By.name("four")).click();
		Thread.sleep(300);
		driver.findElement(By.name("two")).click();
		Thread.sleep(500);
		driver.findElement(By.name("calculate")).click();	
		
		Thread.sleep(2000);
		

	}
	
	
	@AfterTest
	public void end()
	{	
		driver.quit();
	}
}
