package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	
	/*public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "//Users//madhurakulkarni//Downloads//chromedriver");
		driver = new ChromeDriver();
	}
*/
	public static void main(String[] args) {
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "//Users//madhurakulkarni//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();	
		//open amazon register  account page
driver.get("https://amazon.force.com/Register?setlang=en_US");
		//find elemnet by xpath
//driver.findElement(By.xpath("//*[@id=\"usernamereg-firstName\"]")).sendKeys("Madhura");
//find elemnet by id
//driver.findElement(By.id("usernamereg-lastName")).sendKeys("Kulkarni");
		

		//enter the url
		
		//driver.get("https://google.com");
		/*String title = driver.getTitle();
		if (title.equals("Google")) {
			System.out.println("Title is correct");
		}
		else
			System.out.println("Title is incorrect");
		
		System.out.println(driver.getCurrentUrl());*/
		
		
	}
  
	

}
