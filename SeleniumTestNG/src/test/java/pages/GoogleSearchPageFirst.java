package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchPageFirst {

private static WebElement element = null;
	
	
	public static WebElement textbox_searchname(WebDriver driver) {
		element = driver.findElement(By.name("q"));
		return element;
	}
	public static void textbox_submitbutton(WebDriver driver) {
		element.submit();
	}
	public static WebElement button_searchname(WebDriver driver) {
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
			 
		element = driver.findElement(By.name("btnK"));
		return element;
	}
}
