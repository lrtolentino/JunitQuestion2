package util;


import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class RunningJunit {

	static WebDriver driver;

	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/101/");
		// return driver;

	}

	@Test
	public void JunitAutomation() {

		driver.findElement(By.name("todo[4]")).click();

		driver.findElement(By.cssSelector("body > div.controls > input[type=submit]:nth-child(1)")).click();
		  
	}

	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
