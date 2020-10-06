package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class fillFB {
	public WebDriver driver;

	
	@Test
	public void myFunc()  {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
        driver.manage().window().maximize();

		driver.findElement(By.id("u_0_n")).sendKeys("Tatiana");
		driver.findElement(By.id("u_0_p")).sendKeys("Dragan");
		driver.findElement(By.id("u_0_s")).sendKeys("tdragan@mail.ru");
		driver.findElement(By.id("u_0_v")).sendKeys("tdragan@mail.ru");

		driver.findElement(By.id("password_step_input")).sendKeys("Tanya345672");
		Select drp_month = new Select (driver.findElement(By.name("birthday_month")));
		drp_month.selectByVisibleText("Mar");
		
		Select drp_day = new Select (driver.findElement(By.name("birthday_day")));
		drp_day.selectByValue("12");

		Select drp_year = new Select (driver.findElement(By.name("birthday_year")));
		drp_year.selectByIndex(27); 
		driver.findElement(By.id("u_0_6")).click();

	}
}
