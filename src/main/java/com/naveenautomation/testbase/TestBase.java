package com.naveenautomation.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

import com.naveenautomation.Listeners.WebDriverEvents;
import com.naveenautomation.browsers.Browsers;

import freemarker.core.Environment;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	private Properties prop;
	private FileInputStream fileInputStream;

	public WebDriverEvents events;
	public EventFiringWebDriver eDriver;

//	public TestBase() {
//		prop = new Properties();
//		try {
//			fileInputStream = new FileInputStream(
//					"C:\\Users\\judet\\eclipse-workspace\\DemoProject\\src\\main\\java\\com\\naveenautomation\\DemoProject\\config\\config.properties");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		try {
//			prop.load(fileInputStream);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	public void initialization() {
//
//		String browserName = System.getProperty("BrowserName") != null ? System.getProperty("BrowserName")
//				: prop.getProperty("browser");
//		// String browserName = System.getProperty("BrowserName");
//		switch (browserName) {
//		case "Chrome":
//			driver = WebDriverManager.chromedriver().create();
//			break;
//		case "Edge":
//			driver = WebDriverManager.edgedriver().create();
//			break;
//		case "Firefox":
//			driver = WebDriverManager.firefoxdriver().create();
//			break;
//		default:
//			System.out.println("Invalid Browser");
//			break;
//		}
//
//		driver.get(prop.getProperty("URL"));
//		driver.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("Implicit_wait")), TimeUnit.SECONDS);
//		driver.manage().window().maximize();

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	public void tearDown() {
		driver.close();

	}
}
