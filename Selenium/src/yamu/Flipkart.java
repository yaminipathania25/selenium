package yamu;



import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	ChromeDriver driver;
	public void Additems() throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\software\\Java_v\\chrome\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement phone = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
	phone.sendKeys("9888152578");
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("admireit");
	Actions ln = new Actions(driver);
	WebElement login = driver.findElement(By.xpath("//div[@class='_1avdGP']"));
	ln.click(login).sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(1000);
	WebElement search = driver.findElement(By.xpath("//div[@class='O8ZS_U']"));
	search.sendKeys("t shirts");
	Thread.sleep(1000);
	WebElement click = driver.findElement(By.xpath("//button[@type='submit']"));
	ln.click(click).sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(1000);
	List<WebElement> all = driver.findElements(By.xpath("//div[contains(@class, '_3JlYXy')]"));
	all.size();
	all.get(12).click();
	String current = driver.getWindowHandle();
	String currenturl = driver.getCurrentUrl();
	Set<String> allwindows = driver.getWindowHandles();
	int count = 0;
	for(String s : allwindows)
	{
		count++;
		if(count==2)
		{
			driver.switchTo().window(s);
			break;
		}
	}
	WebElement selectitem = driver.findElement(By.xpath("//div[@class='_3ZJShS._31bMyl']"));
	selectitem.click();
	Thread.sleep(1000);
	
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Flipkart m= new Flipkart();
		m.Additems();
		
	}
	
}


