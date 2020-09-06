package yamu;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\software\\Java_v\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/");
		//driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).sendKeys("BEN");
		//driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).sendKeys(Keys.ARROW_DOWN);
		//Javascript DOM can extract hidden elements.
		//Because selenium cannot identify hidden elements - (Ajax Implementation)
		//Investigate the properties of object if it have any hidden text
		//JavascriptExecutor - Used to write Javascript code in Selenium
		//JavascriptExecutor js = (JavascriptExecutor)driver;
	/*	String script = "return document.getElementById(\\\"gosuggest_inputSrc\\\")".value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);*/
		
	}

}
