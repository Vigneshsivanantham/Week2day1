package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Title = driver.getTitle();
		System.out.println("Title:" +Title);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vignesh");
		driver.findElement(By.name("lastname")).sendKeys("S");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("7598845132");
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("VicS2904");
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select day1 = new Select(day);
		day1.selectByVisibleText("29");
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select month1 = new Select(month);
		month1.selectByVisibleText("Apr");
		
		WebElement Year = driver.findElement(By.name("birthday_year"));
		Select Year1 = new Select(Year);
		Year1.selectByVisibleText("1998");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}
