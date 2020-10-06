package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PDP {

	private static WebElement element = null;

	public static WebElement sizeMchoise(WebDriver driver) {
		element = driver.findElement(By.xpath("(//button[@class='option'])[4]"));
		return element;
	}

	public static WebElement spanSelectsize(WebDriver driver) {
		element = driver.findElement(By.xpath("(//span[contains(text(), 'Select size')])[1]"));

		return element;
	}

	public static WebElement addToCart(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@class='icon icon-shopping-bag-white']"));
		return element;
	}

}
