package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenPg {
	private static WebElement element = null;

	
	public static WebElement shirtsLeftMenu (WebDriver driver) {
		element = driver.findElement(By.linkText("Shirts"));
		return element;
	}

}
