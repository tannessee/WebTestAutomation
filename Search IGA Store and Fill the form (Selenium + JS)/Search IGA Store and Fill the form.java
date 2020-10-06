import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchIGAStore {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.iga.net/en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// Step2: Click Online Grocery
		driver.findElement(By.xpath("//a[contains(text(), 'Online Grocery')]")).click();	
		// Step3 Entering a PostalCode
		driver.findElement(By.id("MyStoreSideBarPostalCode")).sendKeys("H4M2R1");
		driver.findElement(By.xpath("//a[@id='MyStoreSideBarSearch']")).click();
		// Closing pop up window
		driver.findElement(By.xpath("//button[@class='btn btn--danger js-accept-cookie-policy']")).click();
		// Step4: Select a store from the list
		driver.findElement(By.xpath("//a[contains(text(), 'Select this store')]")).click();
		// Step5: Click Start Shopping button
		driver.findElement(By.xpath("//a[contains(text(), 'Start shopping')]")).click();
		// Step6: Click Create an account link
		driver.findElement(By.xpath("//a[contains(text(), 'Create an account')]")).click();
		// Step7: Filling in the form with (first name, last name, email, password and
		// password confirmation)
		driver.findElement(By.name("body_0$main_1$CreateAccountFrom$TxtFirstName")).sendKeys("Tati");
		driver.findElement(By.name("body_0$main_1$CreateAccountFrom$TxtLastName")).sendKeys("Drono");
		driver.findElement(By.id("body_0_main_1_CreateAccountFrom_TxtEmail")).sendKeys("tanoooo@mail.rum");
		driver.findElement(By.id("body_0_main_1_CreateAccountFrom_TxtPostalCode")).sendKeys("H2M1R1");
		driver.findElement(By.id("body_0_main_1_CreateAccountFrom_TxtAccountPassword")).sendKeys("Igastore_2020_");
		driver.findElement(By.name("body_0$main_1$CreateAccountFrom$TxtConfirmPassword")).sendKeys("Igastore_2020_");
		// Step8: Accept the terms and conditions by clicking the check box
		js.executeScript("document.getElementById('ChkTermsAccepted').click();");

			}

}
