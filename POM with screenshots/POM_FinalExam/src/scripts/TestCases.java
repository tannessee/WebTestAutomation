package scripts;

import org.testng.annotations.Test;

import pageObjects.HomePg;
import pageObjects.MenPg;
import pageObjects.PDP;
import pageObjects.PLP;

import java.io.File;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class TestCases {
	
	public static void takeSnapShot(WebDriver driver, String path) throws Exception {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(path);
		FileUtils.copyFile(SrcFile, DestFile);

	}

	private static WebDriver driver = null;

	@BeforeTest
	public void beforeTest() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www2.hm.com/en_ca/index.html");
		driver.manage().window().maximize();
		takeSnapShot(driver, "screenshot1.png");

	}

	@Test
	public void MyFunc() throws Exception {

		HomePg.menHeaderSection(driver).click();
		Thread.sleep(5000); //waiting before taking screenshot
		takeSnapShot(driver, "screenshot2.png");

		MenPg.shirtsLeftMenu(driver).click();
		Thread.sleep(5000);//waiting before taking screenshot
		takeSnapShot(driver, "screenshot3.png");

		PLP.prod1(driver).click();
		Thread.sleep(3000);//waiting before taking screenshot
		takeSnapShot(driver, "screenshot4.png");

		HomePg.popUpClosebtn(driver).click();
		takeSnapShot(driver, "screenshot5.png");

		String text = PDP.spanSelectsize(driver).getText();
		if (text.contains("Select size")) {
			PDP.spanSelectsize(driver).click();
			takeSnapShot(driver, "screenshot6.png");

			PDP.sizeMchoise(driver).click();
			takeSnapShot(driver, "screenshot7.png");

		}

		PDP.addToCart(driver).click();
		takeSnapShot(driver, "screenshot8.png");

	}

	@AfterClass
	public void afterTest() {
		System.out.println("Test completed.");
		driver.close();
		driver.quit();
	}

}
