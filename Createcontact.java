package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {

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
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Vignesh");
		driver.findElement(By.id("lastNameField")).sendKeys("Sivanantham");
		driver.findElement(By.name("firstNameLocal")).sendKeys("Vicky");
		driver.findElement(By.name("lastNameLocal")).sendKeys("Vicky");		 
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("BCA");
		driver.findElement(By.id("createContactForm_description")).sendKeys("working in Insurance based project");
		WebElement state1 = driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
		Select state = new Select(state1);
		state.selectByVisibleText("INR - Indian Rupee");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("vigneshS29498@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Selenium help to automate testing");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
	
		
	}

}
