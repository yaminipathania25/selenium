package yamu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\software\\Java_v\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_m")).sendKeys("Yamini");
		driver.findElement(By.id("u_0_o")).sendKeys("Pathania");
		driver.findElement(By.id("u_0_r")).sendKeys("yamini.25@gmail.com");
		driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("yamini.25@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("yamini25");
		WebElement drop = driver.findElement(By.id("day"));
		Select s = new Select(drop);
		s.selectByIndex(4);
		WebElement month = driver.findElement(By.cssSelector("input#month"));
		Select sm = new Select(month);
		sm.selectByValue("2");
		WebElement year = driver.findElement(By.cssSelector("input[title='year']"));
		Select sy = new Select(year);
		sy.selectByVisibleText("1995");
		driver.findElement(By.cssSelector("input[value='value']"));
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
}
}