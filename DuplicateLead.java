package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println("Title :" + title);
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("demosalesmanager");
		WebElement Pwd = driver.findElement(By.id("password"));
		Pwd.sendKeys("crmsfa");
		WebElement login = driver.findElement (By.className("decorativeSubmit"));
		login.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("vigneshs29498@gmail.com");
		
		WebElement find = driver.findElement(By.xpath(" //button[text ()= 'Find Leads']"));
		find.click();
		
		driver.findElement(By.linkText("17918")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
	}

}
