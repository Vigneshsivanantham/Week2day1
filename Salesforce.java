package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		String title = driver.getTitle();
		System.out.println("Title :" + title);
		WebElement firstname = driver.findElement(By.name("UserFirstName"));
		firstname.sendKeys("Vicky");

		driver.findElement(By.name("UserLastName")).sendKeys("S");
		driver.findElement(By.name("UserEmail")).sendKeys("Vigneshs29498@gmail.com");
		WebElement JobTitle = driver.findElement(By.name("UserTitle"));
		Select JobTitle1 = new Select(JobTitle);
		JobTitle1.selectByVisibleText("Developer / Software Engineer / Analyst");
		driver.findElement(By.name("CompanyName")).sendKeys("CTS");
		WebElement Employee = driver.findElement(By.name("CompanyEmployees"));
		Select Employee1 = new Select(Employee);
		Employee1.selectByVisibleText("1501+ employees");
		driver.findElement(By.name("UserPhone")).sendKeys("7598845132");
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select Country1 = new Select(country);
		Country1.selectByVisibleText("India");
		driver.findElement(By.xpath("//div[@class = 'checkbox-ui']")).click();
		
	}

}
