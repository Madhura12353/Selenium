package selenium;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerOnAmazon {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		System.setProperty("webdriver.chrome.driver", "//Users//madhurakulkarni//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// open amazon register account page
		driver.get("https://amazon.force.com/Register?setlang=en_US");
		
		// find elemnet by id
		// find and enter first name
		driver.findElement(By.id("communitiesSelfRegPage:portId:RegisterForm:First-Name")).sendKeys("Madhura");
		// find and enter last name
		driver.findElement(By.id("communitiesSelfRegPage:portId:RegisterForm:LastName")).sendKeys("Kulkarni");
		driver.findElement(By.id("communitiesSelfRegPage:portId:RegisterForm:emailaddress"))
				.sendKeys("madhura@gmail.com");
		driver.findElement(By.id("communitiesSelfRegPage:portId:RegisterForm:confirmemailaddress"))
				.sendKeys("madhura@gmail.com");
		driver.findElement(By.id("communitiesSelfRegPage:portId:RegisterForm:j_id92:password")).sendKeys("Password123");
		driver.findElement(By.id("communitiesSelfRegPage:portId:RegisterForm:j_id92:confirmPassword"))
				.sendKeys("Password123");
		// click / select
		driver.findElement(By.id("communitiesSelfRegPage:portId:RegisterForm:boxValue")).click();

		// find and select country code
		Select countryCode = new Select(
				driver.findElement(By.id("communitiesSelfRegPage:portId:RegisterForm:countryList2")));
		countryCode.selectByVisibleText("United States + 1");

		// find and insert phone number
		driver.findElement(By.id("communitiesSelfRegPage:portId:RegisterForm:phoneNumber")).sendKeys("772-222-1232");

		// find and select confirm country code
		Select confirmCountryCode = new Select(
				driver.findElement(By.id("communitiesSelfRegPage:portId:RegisterForm:countryList")));
		confirmCountryCode.selectByVisibleText("United States + 1");

		// find and insert phone number
		driver.findElement(By.id("communitiesSelfRegPage:portId:RegisterForm:confirmPhone")).sendKeys("772-222-1232");

		// find and select country
		Select state = new Select(driver.findElement(By.id("communitiesSelfRegPage:portId:RegisterForm:Country")));
		state.selectByVisibleText("United States");

		// find and select time zone
		Select timeZone = new Select(
				driver.findElement(By.name("communitiesSelfRegPage:portId:RegisterForm:timeZone")));
		timeZone.selectByVisibleText("(GMT-05:00) Eastern Standard Time (America/New_York)");
		
		// wait for 4 second
		Thread.sleep(4000);
		
		// quit driver
		driver.quit();
	}
}
