package teenSMART_vanillaPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class switchBrowserProfileTest {
	@Test
	public void ChromeTest() throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--user-data-dir=C:\\Users\\IshaniTyagi\\Desktop\\Chrome-User Data");
		//options.addArguments("--user-data-dir=C:\\Users\\IshaniTyagi\\AppData\\Local\\Google\\Chrome\\User Data");
		options.addArguments("--profile-directory=Profile 1");
		//options.addArguments("--profile-directory=Default");
		
		// launches url
		// setting path to the driver executable
		WebDriverManager.chromedriver().setup();
		// creates new object of ChromeDriver to launch browser
		ChromeDriver driver = new ChromeDriver(options);
		//WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://app-pre.teensmartdriving.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
	}
	
	@Test
	public void EdgeTest() throws InterruptedException {
		
		EdgeOptions options = new EdgeOptions();
		//options.addArguments("--user-data-dir=C:\\Users\\IshaniTyagi\\Desktop\\Edge-User Data");
		options.addArguments("--user-data-dir=C:\\Users\\IshaniTyagi\\AppData\\Local\\Microsoft\\Edge\\User Data\\");
		options.addArguments("--profile-directory=Profile 1");
		//options.addArguments("--profile-directory=Default");
		
		// launches url
		// setting path to the driver executable
		WebDriverManager.edgedriver().setup();
		// creates new object of ChromeDriver to launch browser
		EdgeDriver driver = new EdgeDriver(options);
		//WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://app-pre.teensmartdriving.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
	}
}
