package yamu;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Junit {
	ChromeDriver driver;
	
	@Before
	public void before() 
	{
		
        System.setProperty("webdriver.chrome.driver", "F:\\software\\Java_v\\chrome\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception
	{
		Thread.sleep(1000);
        WebElement firstname = driver.findElement(By.cssSelector("input[name='firstname"));
        firstname.sendKeys("Yamini");
		WebElement lastname = driver.findElement(By.cssSelector("input[name='lastname"));
		lastname.sendKeys("Pathania");
		WebElement email = driver.findElement(By.cssSelector("input[name='reg_email__']"));
		email.sendKeys("yamini.25@gmail.com");
		Thread.sleep(1000);
		WebElement confirm = driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
		confirm.sendKeys("yamini.25@gmail.com");
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("yamini25");
	    WebElement drop = driver.findElement(By.id("day"));
		Select s = new Select(drop);
		s.selectByIndex(4);
		WebElement month = driver.findElement(By.cssSelector("select[name='birthday_month']"));
		Select sm = new Select(month);
		sm.selectByValue("2");
		WebElement year = driver.findElement(By.cssSelector("select[title='Year']"));
		Select sy = new Select(year);
		sy.selectByVisibleText("1995");
		WebElement gender = driver.findElement(By.cssSelector("input[value='1']"));
		gender.click();
		WebElement submit = driver.findElement(By.cssSelector("button[name='websubmit']"));
		submit.click();
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
	}
	@After
	public void after() 
	{
		driver.close();
	}
	
	

}
