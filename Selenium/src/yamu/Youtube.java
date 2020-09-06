package yamu;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Youtube 
{
	public void video()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\software\\Java_v\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement video = driver.findElement(By.id("video-title"));
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
		String currentwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println("Total number of window: " + allwindows.size());
		for(String s: allwindows)
		{
			driver.switchTo().window(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Youtube y = new Youtube();
		y.video();

	}

}
