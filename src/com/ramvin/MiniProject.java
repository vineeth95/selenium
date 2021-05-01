package com.ramvin;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinee\\eclipse-workspace\\Ramesh_Vineeth\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement signin_btn = driver.findElement(By.xpath("//a[@class=\"login\"]"));
			signin_btn.click();
			
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
			
			driver.findElement(By.id("email_create")).sendKeys("vineethtest4@gmail.com");
			driver.findElement(By.name("SubmitCreate")).click();
			
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
			
			driver.findElement(By.id("id_gender1")).click();
			
			driver.findElement(By.id("customer_firstname")).sendKeys("vineeth");
			driver.findElement(By.id("customer_lastname")).sendKeys("b");			
			driver.findElement(By.id("passwd")).sendKeys("Vinith123");
		
			WebElement days = driver.findElement(By.id("days"));
			Select d = new Select(days);
			d.selectByValue("1");
			
			WebElement months = driver.findElement(By.id("months"));
			Select m = new Select(months);
			m.selectByValue("1");
			
			WebElement years = driver.findElement(By.id("years"));
			Select y = new Select(years);
			y.selectByValue("1995");
			
			
			driver.findElement(By.id("newsletter")).click();
			driver.findElement(By.id("optin")).click();
			
			driver.findElement(By.id("firstname")).sendKeys("vineeth");
			driver.findElement(By.id("lastname")).sendKeys("b");			
			
			driver.findElement(By.id("company")).sendKeys("Google");
			
			driver.findElement(By.id("address1")).sendKeys("No: 2");

			driver.findElement(By.id("address2")).sendKeys("New apartents, 1st main road");
			
			driver.findElement(By.id("city")).sendKeys("Chennai");
			
			WebElement statelist = driver.findElement(By.id("id_state"));
			Select stateselect = new Select(statelist);
			
			stateselect.selectByValue("24");
			

			driver.findElement(By.id("postcode")).sendKeys("60001");
			
			WebElement countrylist = driver.findElement(By.id("id_state"));
			Select countryselect = new Select(countrylist);
			
			countryselect.selectByValue("21");
			
			
			driver.findElement(By.xpath("//textarea[@class=\"form-control\"]")).sendKeys("This is a sample text");
			
			driver.findElement(By.id("phone")).sendKeys("9909700254");
			driver.findElement(By.id("phone_mobile")).sendKeys("2548513116");
			
			WebElement aliasfield = driver.findElement(By.id("alias"));
			aliasfield.clear();
			aliasfield.sendKeys("Home Address");
			
			
			driver.findElement(By.id("submitAccount")).click();
			
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			File destination = new File("C:\\Users\\vinee\\eclipse-workspace\\Ramesh_Vineeth\\Screenshot\\picture1.png");
			FileUtils.copyFile(source, destination);
			
			
	}

}
