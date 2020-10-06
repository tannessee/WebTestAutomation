package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PLP {
	private static WebElement element = null;

	public static WebElement prod1(WebDriver driver) {
		element = driver.findElement(By.xpath("(//a[contains(text(), 'Cotton Flannel Shirt')])[1]"));
		return element;
	}

}
