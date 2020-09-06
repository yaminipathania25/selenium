package yamu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Makemytrip {
	ChromeDriver driver;
	public Makemytrip()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\software\\Java_v\\chrome\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.xpath("//label[@for='fromCity']"));
		Actions a = new Actions(driver);
		a.click(from).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		WebElement to = driver.findElement(By.xpath("//label[@for='toCity']"));
		a.click(to).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Makemytrip m= new Makemytrip();
		
	}

}
