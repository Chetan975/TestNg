package SeleniumExer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg1 {  // here using assert.assertTrue
	
	@Test
	public void LoginTest()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		
		Assert.assertTrue(email.isDisplayed());// here we using assertTrue which is same as assert.AssertEquals
		email.sendKeys("chetan");
		
		Assert.assertTrue(pass.isDisplayed());
		pass.sendKeys("hiiii");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.quit();
		
		
		
	}
}
