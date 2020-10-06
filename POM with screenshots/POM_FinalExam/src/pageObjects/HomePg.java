package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePg {

	private static WebElement element = null;

	public static WebElement menHeaderSection(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(text(), 'Men')]"));
		return element;
	}


	public static WebElement popUpClosebtn(WebDriver driver) {
		element = driver.findElement(By.xpath("(//button[contains(text(), 'Close')])[1]"));
		return element;
	}

}
