package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LuanchBrowse {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
ChromeDriver dri = new ChromeDriver();
dri.manage().window().maximize();
dri.get("http://leaftaps.com/opentaps/control/main");
String title = dri.getTitle();
System.out.println("Title :" + title);
WebElement user = dri.findElement(By.id("username"));
user.sendKeys("demosalesmanager");
WebElement Pwd = dri.findElement(By.id("password"));
Pwd.sendKeys("crmsfa");
WebElement log = dri.findElement(By.className("decorativeSubmit"));
log.click();
//WebElement link = dri.findElement(By.linkText("CRM/SFA")); //also dri.findElement(By.linkText("CRM/SFA")).click();
dri.findElement(By.linkText("CRM/SFA")).click();
//link.click();
dri.findElement(By.linkText("Leads")).click();
dri.findElement(By.linkText("Create Lead")).click();
dri.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
dri.findElement(By.id("createLeadForm_firstName")).sendKeys("Vignesh");
dri.findElement(By.id("createLeadForm_lastName")).sendKeys("Sivanantham");
dri.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vicky");
dri.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Vicky");
dri.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Process Excecutive");
dri.findElement(By.id("createLeadForm_birthDate")).sendKeys("29/04/1998");
dri.findElement(By.id("createLeadForm_departmentName")).sendKeys("BCA");
dri.findElement(By.id("createLeadForm_description")).sendKeys("working in Insurance based project");
dri.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
dri.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("6");
dri.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("635204");
dri.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vigneshS29498@gmail.com");
dri.findElement(By.id("createLeadForm_generalCity")).sendKeys("KRSHNAGIRI");
dri.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("635204");
dri.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7598845132");
dri.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
dri.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("20000");
dri.findElement(By.id("createLeadForm_importantNote")).sendKeys("TestLeaf Automation Platform");
dri.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");
dri.findElement(By.id("createLeadForm_sicCode")).sendKeys("777");
dri.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("symbol");
dri.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("+91");
dri.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("welcome my address");
dri.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("welcome my address");
dri.findElement(By.className("smallSubmit")).click();
	}

}
