package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class fillOracle {

	@Test
	public void myFunc() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
        driver.manage().window().maximize();
		
		driver.findElement(By.id("email::content")).sendKeys("tdragan@mail.ru");
		driver.findElement(By.id("password::content")).sendKeys("Tanya12345678");
		driver.findElement(By.id("retypePassword::content")).sendKeys("Tanya12345678");
		Select drp_country = new Select(driver.findElement(By.id("country::content")));
		drp_country.selectByValue("CA");
		driver.findElement(By.id("firstName::content")).sendKeys("Tatiana");
		driver.findElement(By.id("lastName::content")).sendKeys("Dragan");
		driver.findElement(By.id("jobTitle::content")).sendKeys("tester");
		driver.findElement(By.id("workPhone::content")).sendKeys("543449876");
		driver.findElement(By.id("companyName::content")).sendKeys("MyOOO");
		driver.findElement(By.id("address1::content")).sendKeys("Saint Laurent");
		driver.findElement(By.id("city::content")).sendKeys("Montreal");
		Select drp_down = new Select(driver.findElement(By.id("state::content")));
		drp_down.selectByVisibleText("Quebec");
		driver.findElement(By.id("postalCode::content")).sendKeys("H4M1P5");

	}
}