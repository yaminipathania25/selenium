package yamu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\software\\Java_v\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Actions a=new Actions(driver);
		WebElement move = driver.findElement(By.className("desktop-navLink"));
		a.moveToElement(driver.findElement(By.className("desktop-searchBar"))).click().keyDown(Keys.SHIFT).sendKeys("pink").doubleClick().build().perform();
		
		//Moves to specific element (How to right click)
		a.moveToElement(move).contextClick().build().perform();
		
		
		
		
	}

}
