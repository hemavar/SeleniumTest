package test;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import pages.GoogleSearchPageFirst;
public class FirstPageTest {
	public static WebDriver driver = null;
	
	
  @Test
  public void googleSearchTest() {
	  
	  driver.get("http://www.google.com");
	  GoogleSearchPageFirst.textbox_searchname(driver).sendKeys("Selenium");
	  GoogleSearchPageFirst.textbox_submitbutton(driver);
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}
