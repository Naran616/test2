package udemy.udemy_rahul;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;



public class calender {
	WebDriver driver;
	@Test
	public void f() throws InterruptedException {
		driver.findElement(By.id("travel_date")).click();
		String month = "April 2020";
		String expDate = "25";
		
		
		
	 while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().equalsIgnoreCase(month))
	 {
			driver.findElement(By.xpath("(//*[@class='datepicker-days']/table/thead/tr/th)[3]")).click();			
		}
		
		//int count = driver.findElements(By.className("day")).size();
		for (int i = 0; i < 31; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase(expDate)) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
}
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/Users/narayansapkota/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@AfterClass
	public void afterClass() {
	   // driver.quit();
	}

}
