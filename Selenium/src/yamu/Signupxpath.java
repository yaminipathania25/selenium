package yamu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signupxpath {
	ChromeDriver driver;
	public void selectdropdown(WebElement element, String text)
	{
		Select a =new Select(element);
		a.selectByValue(text);
	}
	public void Signup()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\software\\Java_v\\chrome\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("Yamini");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Pathania");
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("yamini.25@gmail.com");
		WebElement confirm = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		confirm.sendKeys("yamini.25@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		password.sendKeys("yamini25");
	    WebElement drop = driver.findElement(By.xpath("//select[@title = 'Day']"));
		selectdropdown(drop,"20");
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		selectdropdown(month,"12");
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		selectdropdown(year,"2000");
		WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
		gender.click();
		WebElement submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
		submit.click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Signupxpath d = new Signupxpath();
		d.Signup();		
	}

}
