package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		// Step 1: Locate element:

		WebElement eleUsername = driver.findElement(By.id("username"));

		// Step 2: To type a value in a text field:
		eleUsername.sendKeys("Demosalesmanager");

		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SBIC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vijayalakshmi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		driver.findElement(By.name("submitButton")).click();

	}

}
