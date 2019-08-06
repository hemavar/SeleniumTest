package test;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;


import pages.GoogleSearchPageFirst;
public class FirstPageTest {
	public static WebDriver driver = null;
	
	
  @Test
  public void googleSearchTest() {
	  
	  driver.get("http://www.google.com");
	  System.out.println("$$$$ Before textbox_searchname for Selenium");
	  GoogleSearchPageFirst.textbox_searchname(driver).sendKeys("Selenium");
	  //GoogleSearchPageFirst.textbox_submitbutton(driver);
	  System.out.println("$$$$ After textbox_searchname for Selenium");
	  GoogleSearchPageFirst.button_searchname(driver).sendKeys(Keys.RETURN);
	  System.out.println("$$$$ After button_searchname for Selenium");
	 
	  /*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--headless");
	  driver = new ChromeDriver(options);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
  }

}
