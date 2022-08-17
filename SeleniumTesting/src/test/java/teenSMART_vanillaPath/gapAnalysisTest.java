package teenSMART_vanillaPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gapAnalysisTest {
	@Test
	public void vanillaPath() throws InterruptedException {
		int wt = 3000;
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
		
		//"Gap Analysis" module 
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// turn on subtitles
		Thread.sleep(wt);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='icon icon-closed-caption']"))).click();
		Thread.sleep(wt);
		// click "Next" button to 2nd video
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='button button-warning ' and text()='Next']"))).click();
		Thread.sleep(7000);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click "Next" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='button button-warning ' and text()='Next']"))).click();
		Thread.sleep(7000);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click "Skip Tutorial" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='button button-warning ' and text()='Skip Topic']"))).click();
		Thread.sleep(7000);
		
		// click "Level 1" button -- Oncoming Gap Activity		110a_is_t_oga_17a_1280
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='level-button button button-warning'])[1]"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 1
		Thread.sleep(wt);
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
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='click-status icon-status icon icon-checkmark']"))).click();
		// click "Exit review" button
		Thread.sleep(8000);
		Thread.sleep(8000);
		Thread.sleep(wt);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "2" button			120dd_is_t_oga_26dd_1280
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='2']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 2
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		Thread.sleep(8000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "Level 2" button		120ff_is_t_oga_26ff_1280
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='level-button button button-warning'])[2]"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 1
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		Thread.sleep(9000);
		Thread.sleep(9000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "2" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[text()='2'])[2]"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 2			120z_is_t_oga_26z_1280
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		Thread.sleep(8000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "3" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='3']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 3			120v_is_t_oga_26v_1280
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		Thread.sleep(9000);
		Thread.sleep(9000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "4" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='4']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 4			120u_is_t_oga_26u_1280
		Thread.sleep(wt);
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
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		
		// click "5" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='5']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 5		118_is_t_oga_24_1280_v3
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		Thread.sleep(9000);
		Thread.sleep(9000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "6" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='6']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 6			108_is_t_oga_15_1280_v3
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "7" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='7']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 7			113_is_t_oga_19_1280
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		Thread.sleep(7300);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		Thread.sleep(6700);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		
		// click "Level 3" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='level-button button button-warning'])[3]"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 1			120kk_is_t_oga_26kk_1280
		Thread.sleep(wt);
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
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "2" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[text()='2'])[3]"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 2			120nn_is_t_oga_26nn_1280
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		Thread.sleep(9000);
		Thread.sleep(9000);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "3" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[text()='3'])[2]"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 3			119_is_t_oga_25_1280
		Thread.sleep(wt);
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
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "Next" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Play']"))).click();
		Thread.sleep(7000);
		// click "Skip Topic" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Skip Topic']"))).click();
		Thread.sleep(7000);
		
		
		// click "Level 1" button -- Left-Right Activity
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='level-button button button-warning'])[1]"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 1		125_ins_t_ult_03_LL_1280
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click "Exit review" button
		Thread.sleep(8000);
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "2" button		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='2']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 2		130c_ins_t_ult_08c_LH_1280
		Thread.sleep(wt);
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
		// click "Exit review" button
		Thread.sleep(8000);
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "3" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='3']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 3		134_ins_t_ss_01_ML_1280
		Thread.sleep(wt);
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
		// click "Exit review" button
		Thread.sleep(8000);
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "Level 2" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='level-button button button-warning'])[2]"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 1		140a_ins_t_ss_05a_MH_1280
		Thread.sleep(wt);
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
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "2" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[text()='2'])[2]"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 2		135_ins_t_ss_02_MM_1280
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		Thread.sleep(6000);
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "3" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[text()='3'])[2]"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 3		140e_ins_t_ss_05e_MH_1280
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		Thread.sleep(40000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "4" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='4']"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 4	145_ins_t_ss_09_HL_1280
		Thread.sleep(wt);
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
		// click "Exit review" button
		Thread.sleep(7000);
		Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "Level 3" button
		Thread.sleep(wt);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='level-button button button-warning'])[3]"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 1		143_ins_t_ss_07_HL_1280
		Thread.sleep(wt);
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
		// click "Exit review" button
		Thread.sleep(8000);
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		// click "2" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[text()='2'])[3]"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 2		150h_pl_t_ee_06h_HH_1280
		Thread.sleep(wt);
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
		// click "Exit review" button
		Thread.sleep(8000);
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();	
		// click "3" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//li[text()='3'])[3]"))).click();
		Thread.sleep(wt);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// sim 3		149_pl_t_ee_05_HL_1280
		Thread.sleep(wt);
		Thread.sleep(7000);
		Thread.sleep(7000);
		// click anywhere on screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click on answers
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		Thread.sleep(20000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='simulation-catcher']"))).click();
		// click "Exit review" button
		Thread.sleep(8000);
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='a'][@class='button button-warning' and text()='Exit Review']"))).click();
		
		// click "Next" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='button button-warning ' and text()='Next']"))).click();
		Thread.sleep(7000);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click "Next" button
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='button button-warning ' and text()='Next']"))).click();
		//Thread.sleep(7000);
		Thread.sleep(7000);
		Thread.sleep(7000);
		Thread.sleep(7000);
		//click "Module 8" button
		System.out.println(driver.getCurrentUrl());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='div'][@class='button what-to-do-button' and text()='Module 8']"))).click();
	
		Thread.sleep(5000);
		driver.close();
	}
}