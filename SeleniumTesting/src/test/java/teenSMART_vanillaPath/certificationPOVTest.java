package teenSMART_vanillaPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class certificationPOVTest {
	@Test
	public void vanillaPath() throws InterruptedException {
		//int wt = 3000;
		int wt2 = 1500;

		// setting path to the driver executable
		WebDriverManager.chromedriver().setup();
		// creates new object of ChromeDriver to launch browser
		ChromeDriver driver = new ChromeDriver();
		// launches url
		
		driver.get("https://app-pre.teensmartdriving.com/");
		driver.manage().window().maximize();
		Thread.sleep(wt2);
		// entering username
		driver.findElement(By.id("email")).sendKeys("T4XXIT01BBBB");
		Thread.sleep(wt2);
		// entering password
		driver.findElement(By.id("password")).sendKeys("Test1234");
		Thread.sleep(wt2);
		// click login button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[2]/div/form/button")).click();
		Thread.sleep(6000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		
		// click "Play" button
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Play']"))).click();
		// click "Retake Exam" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-secondary']"))).click();
		Thread.sleep(7000);
		
		//POVs
		//Visual Awareness
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Play']"))).click();
		Thread.sleep(7000);	
		WebElement question = driver.findElement(By.id("header-exercise"));
		String str = question.getText();
		System.out.println(str);
		Thread.sleep(wt2);
		VApov(str, wait, driver);
		Thread.sleep(wt2);
		str = "";
		for(int i=0; i<1; i++) {
			// click "Play" button
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Play']"))).click();
			Thread.sleep(7000);
			question = driver.findElement(By.id("header-exercise"));
			str = question.getText();				//https://app-pre.teensmartdriving.com/dashboard/certification/exercise/%7BPOV-CERTIFICATION%7D   pedestrian pickup truck
			System.out.println(str);
			Thread.sleep(wt2);
			VApov(str, wait, driver);
			Thread.sleep(wt2);
			str = "";
		}
		// Click "Continue" button to proceed to next module 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-secondary' and text()='Continue']"))).click();																		
		Thread.sleep(7000);
		
		// Oncoming Gaps
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Play']"))).click();
		Thread.sleep(7000);	
		WebElement question2 = driver.findElement(By.id("header-exercise"));
		String str2 = question2.getText();
		System.out.println(str2);
		Thread.sleep(wt2);
		OncomingGapspov(str2, wait, driver);
		Thread.sleep(wt2);
		str2 = "";
		for(int i=0; i<1; i++) {
			// click "Play" button
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Play']"))).click();
			Thread.sleep(7000);
			question2 = driver.findElement(By.id("header-exercise"));
			str2 = question2.getText();
			System.out.println(str2);
			Thread.sleep(wt2);
			OncomingGapspov(str2, wait, driver);
			Thread.sleep(wt2);
			str2 = "";
		}
		
		// Left Right Gap
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Play']"))).click();
		Thread.sleep(7000);	
		WebElement question3 = driver.findElement(By.id("header-exercise"));
		String str3 = question3.getText();
		System.out.println(str3);
		Thread.sleep(wt2);
		LeftRightPov(str3, wait, driver);
		Thread.sleep(wt2);
		str3 = "";
		for(int i=0; i<1; i++) {
			// click "Play" button
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Play']"))).click();
			Thread.sleep(7000);
			question3 = driver.findElement(By.id("header-exercise"));
			str3 = question3.getText();
			System.out.println(str3);
			Thread.sleep(wt2);
			LeftRightPov(str3, wait, driver);
			Thread.sleep(wt2);
			str3 = "";
		}
		
		// What's the Clue
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Play']"))).click();
		Thread.sleep(7000);	
		WebElement question4 = driver.findElement(By.id("header-exercise"));
		String str4 = question4.getText();
		System.out.println(str4);
		Thread.sleep(wt2);
		WhatsTheCluePov(str4, wait, driver);
		Thread.sleep(wt2);
		str4 = "";
		for(int i=0; i<1; i++) {
			// click "Play" button
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Play']"))).click();
			Thread.sleep(7000);
			question4 = driver.findElement(By.id("header-exercise"));
			str4 = question4.getText();
			System.out.println(str4);
			Thread.sleep(wt2);
			WhatsTheCluePov(str4, wait, driver);
			Thread.sleep(wt2);
			str4 = "";
		}	
		
		// Risk-O-Meter
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Play']"))).click();
		Thread.sleep(7000);	
		WebElement question5 = driver.findElement(By.id("header-exercise"));
		String str5 = question5.getText();
		System.out.println(str5);
		Thread.sleep(wt2);
		RiskOMeterPov(str5, wait, driver);
		Thread.sleep(wt2);
		str5 = "";
		for(int i=0; i<1; i++) {
			// click "Play" button
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Play']"))).click();
			Thread.sleep(7000);
			question5 = driver.findElement(By.id("header-exercise"));
			str5 = question5.getText();
			System.out.println(str5);
			Thread.sleep(wt2);
			RiskOMeterPov(str5, wait, driver);
			Thread.sleep(wt2);
			str5 = "";
		}
		
		// Hazard Detection
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Play']"))).click();
		Thread.sleep(7000);	
		WebElement question6 = driver.findElement(By.id("header-exercise"));
		String str6 = question6.getText();
		System.out.println(str6);
		Thread.sleep(wt2);
		HazardDetectionPov(str6, wait, driver);
		Thread.sleep(wt2);
		str6 = "";
		for(int i=0; i<1; i++) {
			// click "Play" button
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Play']"))).click();
			Thread.sleep(7000);
			question6 = driver.findElement(By.id("header-exercise"));
			str6 = question6.getText();
			System.out.println(str6);
			Thread.sleep(wt2);
			HazardDetectionPov(str6, wait, driver);
			Thread.sleep(wt2);
			str6 = "";
		}
		
		
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Play']"))).click();
		Thread.sleep(7000);
		//click "Send Certificate" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-success']"))).click();
		Thread.sleep(7000);
		//click "OK" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary']"))).click();
		Thread.sleep(7000);
		
	}
	
	
	
	void VApov(String str, WebDriverWait wait, ChromeDriver driver) throws InterruptedException{
		//visual awareness
		if(str.equals("32_ed_t_vs_02_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click front view section
			Thread.sleep(7000);
			WebElement element = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
			Thread.sleep(7000);
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if(str.equals("33b_ed_t_vs_03_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click front view section
			Thread.sleep(7000);
			WebElement element = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
			Thread.sleep(7000);
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if(str.equals("35_ed_t_vs_05_1280_v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click left side blind spot section
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='blind-spot-left']"))).click();
			Thread.sleep(7000);
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if(str.equals("39_ed_t_vs_09_1280_v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(7000);
			// click left section
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='left-side ']"))).click();
			Thread.sleep(7000);
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if(str.equals("49_hd_t_vs_01_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click right blind spot section
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='blind-spot-right']"))).click();
			Thread.sleep(7000);
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if(str.equals("50b_hd_t_vs_02b_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click left section
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='left-side ']"))).click();
			Thread.sleep(7000);	
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if(str.equals("54_ed_t_vs_22_1280_v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click front view section and blind spot right
			Thread.sleep(9000);
			WebElement element4 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element4);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='blind-spot-right']"))).click();
			Thread.sleep(7000);
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if(str.equals("63_ed_t_vs_31_1280_v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click front and right blind spot section
			Thread.sleep(7000);
			WebElement element3 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element3);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
			Thread.sleep(7000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='blind-spot-right']"))).click();
			Thread.sleep(7000);
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if(str.equals("64_ed_t_vs_32_1280_v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click left blind spot side and rear section
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='blind-spot-left']"))).click();
			Thread.sleep(1000);
			WebElement element10 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='rear-view']"))).click();
			Thread.sleep(7000);	
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if(str.equals("65_ed_t_vs_33_1280_v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click left side and front section
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='left-side ']"))).click();
			Thread.sleep(1000);
			WebElement element5 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
			Thread.sleep(7000);
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}		
		else if(str.equals("67_hd_t_vs_03_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click front view and rear view section
			Thread.sleep(15000);
			WebElement element6 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element6);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='rear-view']"))).click();
			Thread.sleep(7000);
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if(str.equals("70d_hd_t_vs_06d_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click left side and front section
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='left-side ']"))).click();
			Thread.sleep(1000);
			WebElement element8 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element8);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
			Thread.sleep(7000);
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if(str.equals("70f_hd_t_vs_06f_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click left side and rear section
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='left-side ']"))).click();
			Thread.sleep(1000);
			WebElement element9 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element9);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='rear-view']"))).click();
			Thread.sleep(7000);
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if(str.equals("71_ed_t_vs_35_1280_v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click left blind spot side and front section
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='blind-spot-left']"))).click();
			Thread.sleep(1000);
			WebElement element12 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element12);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
			Thread.sleep(7000);
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if(str.equals("83_ed_t_vs_47_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click front section twice
			Thread.sleep(15000);
			WebElement element7 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element7);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='front-view']"))).click();
			Thread.sleep(7000);	
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if(str.equals("84_ed_t_vs_48_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click left blind spot side and rear section
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='blind-spot-left']"))).click();
			Thread.sleep(1000);
			WebElement element11 = driver.findElement(By.xpath("//*[name()='img'][@class='car-image']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element11);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='polygon'][@class='rear-view']"))).click();
			Thread.sleep(7000);
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
	}
	
	void OncomingGapspov(String str, WebDriverWait wait, ChromeDriver driver) throws InterruptedException{
		if (str.equals("108_is_t_oga_15_1280_v3")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("110a_is_t_oga_17a_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(1000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(9500);
			Thread.sleep(9500);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(5000);
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(8000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(7000);
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("113_is_t_oga_19_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(7300);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(6700);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("118_is_t_oga_24_1280_v3")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(9000);
			Thread.sleep(8000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("119_is_t_oga_25_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(4000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(8000);
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("120dd_is_t_oga_26dd_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(8000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(7000);
			Thread.sleep(6000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("120ff_is_t_oga_26ff_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(7000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("120kk_is_t_oga_26kk_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(4000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("120nn_is_t_oga_26nn_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("120u_is_t_oga_26u_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(4000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(8000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(8000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("120v_is_t_oga_26v_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(9000);
			Thread.sleep(10000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("120z_is_t_oga_26z_1280-2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(8000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(6000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
	}
	
	
	void LeftRightPov(String str, WebDriverWait wait, ChromeDriver driver) throws InterruptedException{
		if (str.equals("125_ins_t_ult_03_LL_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(7000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("130c_ins_t_ult_08c_LH_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("134_ins_t_ss_01_ML_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(9000);
			Thread.sleep(9000);
			Thread.sleep(7000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("135_ins_t_ss_02_MM_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(6000);
			Thread.sleep(6000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("140a_ins_t_ss_05a_MH_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(12000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(7300);
			Thread.sleep(7500);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("140e_ins_t_ss_05e_MH_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(40000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("143_ins_t_ss_07_HL_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(30000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(8000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("145_ins_t_ss_09_HL_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(8000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(17000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(14000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("149_pl_t_ee_05_HL_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(20000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("150h_pl_t_ee_06h_HH_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(53000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			Thread.sleep(13000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// continue
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
	}
	
	
	void WhatsTheCluePov(String str, WebDriverWait wait, ChromeDriver driver) throws InterruptedException{
		if (str.equals("188_wc_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='First Clue']"))).click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='First Clue']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Second Clue']"))).click();
			// continue
			Thread.sleep(7000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("190b_wc_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='First Clue']"))).click();
			// continue
			Thread.sleep(7000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("197_wc_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='First Clue']"))).click();
			// continue
			Thread.sleep(7000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("201_wc_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='First Clue (b)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Second Clue (b)']"))).click();
			// continue
			Thread.sleep(7000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("205_wc_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='First Clue']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Second Clue']"))).click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Second Clue']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Third Clue']"))).click();
			// continue
			Thread.sleep(7000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("207_wc_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='First Clue']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Second Clue']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Third Clue']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='Fourth Clue']"))).click();
			// continue
			Thread.sleep(7000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
	}
	
	void RiskOMeterPov(String str, WebDriverWait wait, ChromeDriver driver) throws InterruptedException{
		if (str.equals("18_ra_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on less, same, more risk
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("22_ra_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on less, same, more risk
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("186_ra_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on less, same, more risk
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("192_ra_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on less, same, more risk
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("202_ra_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on less, same, more risk
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("210c_ra_1280")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on less, same, more risk
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[1]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[3]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='div'][@class='segment-inner'])[2]"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
	}
	
	void HazardDetectionPov(String str, WebDriverWait wait, ChromeDriver driver) throws InterruptedException{
		if (str.equals("41_ed_t_vs_11_1280v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on pedestrian brown shirt, traffic light a, pedestrian on right, traffic light b, parallel parked car
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Pedestrian with Brown Shirt']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-First Traffic Light (a)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Pedestrian on right side']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Parallel Parked Car']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Second Traffic Light (b)']"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("57_ed_t_vs_25_1280v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on pedestrian, traffic light a, traffic light b, vehicle, cross walk sign, pedestrian 2
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Pedestrian']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Traffic Light (a)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Traffic Light (b)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Vehicle']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Pedestrian Crosswalk Sign']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Pedestrian 2']"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("90_hd_t_vs_12_1280v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on minivan, pedestrian, crosswalk sign, cyclist on left
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Minivan with open side door']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Pedestrian Crosswalk Sign']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Pedestrian in Crosswalk']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Cyclist on the left']"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("199_pl_t_haz_02_1280v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-First Crosswalk Sign']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the mother and child']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the double-parked and oncoming car']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the car with its hazard lights on']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-truck and car with brake lights']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Second Crosswalk Sign']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the jaywalking pedestrians']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Traffic Light (a)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Traffic Light (b)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Traffic Light (c)']"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("203_hd_t_haz_01_1280v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the car parallel parking']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the parking SUV']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-First Traffic Light (a)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-First Traffic Light (b)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='2-the woman on the left']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the people in the crosswalk']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Second Traffic Light (a)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Second Traffic Light (b)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='2-Road Blocked on Right']"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("204_hd_t_haz_02_1280v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The First Traffic Light (a)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The First Traffic Light (b)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the pedestrians on the median']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Second Traffic Light (a)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Second Traffic Light (b)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the cars in the turn lane']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-pedestrians moving toward the street']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the traffic slowing down']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Third Traffic Light (a)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Third Traffic Light (b)']"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("206_ed_t_haz_16_1280v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the people at the first crosswalk']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the man and the girl at the crosswalk']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the First Traffic Light']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the cyclist at the crosswalk']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the pedestrian walking along the road']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the people at the second crosswalk']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the Second Traffic Light (a)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the Second Traffic Light (b)']"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("208_pl_t_haz_04_1280v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-pedestrians at first intersection(a)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-First Traffic Light']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the cyclist on right']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-pedestrians at first intersection(b)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Second Traffic Light']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-pedestrians at second intersection']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the car merging in and braking']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-a cyclist heading towards the street']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1- pedestrians at the third corner']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-White car with brake lights on']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the cyclist on the left']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Third Traffic Light']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the double parked UPS truck']"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("209_pl_t_haz_05_1280v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The First Traffic Light (a)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The First Traffic Light (b)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the pedestrian in the red vest']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Second Traffic Light (a)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Second Traffic Light (b)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the pedestrian in the second crosswalk']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Third Traffic Light (a)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Third Traffic Light (b)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the bicyclist to the left']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the double-parked black SUV']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Pedestrian to the left']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the pedestrian in the third crosswalk']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Fourth Traffic Light (a)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-The Fourth Traffic Light (b)']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the pedestrians and cross traffic']"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("210e_pl_t_haz_06e_1280v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the black SUV']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the dark-colored sedan parking']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the sedan with its reverse lights on']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the man exiting the store']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the light colored SUV parking']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the two guys on left curb']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the black SUV parking']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the guy crossing from the left']"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("210k_pl_t_haz_06k_1280v2a")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the car coming from the left']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the pedestrian far ahead']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='2-the silver car coming from the left']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the man with a baby']"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("210o_pl_t_haz_06o_1280v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on answers
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the running man']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the couple']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-Stop Sign']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the black car turning left']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the woman in red']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the woman wearing brown']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the second woman wearing brown']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='2-Pedestrian Wearing Shorts']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='2-the car backing up']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the pedestrian with a cart']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the turning black car ']"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
		else if (str.equals("294_1280v2")) {
			Thread.sleep(7000);
			Thread.sleep(7000);
			Thread.sleep(7000);
			// click anywhere on screen
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
			// click on man pushing garbage, dog running, white car, dark color car
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the man pushing a garbage can']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the dog running out into the street']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the backing out white car']"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='hazard' and @id='1-the dark-colored car turning up ahead']"))).click();
			// continue
			Thread.sleep(9000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
			Thread.sleep(7000);
		}
	}
}