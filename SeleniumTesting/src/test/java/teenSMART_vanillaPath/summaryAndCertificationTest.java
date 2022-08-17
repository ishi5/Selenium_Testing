package teenSMART_vanillaPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class summaryAndCertificationTest {
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
		
		//Summary Module
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		// click "Next" button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(10000);
		// click "Next" button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Next']"))).click();
		Thread.sleep(7000);
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
	
		
		//MCQ
		Thread.sleep(7000);
		// click on exam button
		Thread.sleep(wt);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-secondary']"))).click();
		Thread.sleep(7000);
		//q1
		WebElement question = driver.findElement(By.className("form-field-label"));
		String str = question.getText();
		System.out.println(str);
		Thread.sleep(wt2);
		mcqFunct(str, driver);
		Thread.sleep(wt2);
		// click "Submit" button
		driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
		Thread.sleep(wt2);
		String clear = "";
		str.replace(str, clear);
		for(int i = 0; i<29; i++) {
			Thread.sleep(wt2);
			question = driver.findElement(By.className("form-field-label"));
			str = question.getText();
			System.out.println(str);
			Thread.sleep(wt2);
			mcqFunct(str, driver);
			Thread.sleep(wt2);
			// click "Submit" button
			driver.findElement(By.xpath("//button[@class='button button-secondary ' and text()='Submit']")).click();
			Thread.sleep(wt2);
			str = "";
		}
		// click "Play" button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-primary' and text()='Play']"))).click();
		Thread.sleep(7000);
		
		
		// Click "Continue" button to proceed to next module 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button button-secondary' and text()='Continue']"))).click();																		
		Thread.sleep(7000);
		Thread.sleep(3000);
		driver.close();
	
	}
	
	void mcqFunct(String str, ChromeDriver driver2){
		if(str.equals("Teens are involved in more collisions than any other age group because:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("Teens have the highest crash rate of any group.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Which of the following is not one of the Big Six critical factors that reduce the chances of crashes?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("Experienced drivers have fewer collisions because:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("Teens are more likely to drink and drive than adults.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("Teens generally have better reflexes and quicker reactions than most adult drivers do, especially older drivers. This means that teens must be safer drivers.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("Teens are more prone to take risks than adults.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("When teens are involved in serious collisions, it is usually their fault.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Which group is more likely to be distracted while driving?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Your GPS should:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Adaptive cruise control, lane change and emergency hazard braking, auto correction, self-parking, and lane centering are:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Your line of sight above the steering wheel should be:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("The steering wheel should be:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("Your airbag should be:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("Your seat should be positioned so you are comfortable and can reach all the controls.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Seat belts should be:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Your rear view mirror should be positioned so that:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("If the left side mirror is adjusted correctly, and when you position your head close to the left window:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("When you are adjusting your right side mirror:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Assume that your rear view and right side mirrors are adjusted properly. While you are driving, when a vehicle passes on the right:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("It is important to know whether you have anti-lock brakes because:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("In most cases, your vehicle can turn faster than it can stop.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("If your mirrors are correctly positioned, you should have:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("Assume that your side mirrors are positioned correctly. While driving:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("How often should seat belts be fastened while driving?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Rearview cameras have blind spots and are not meant to be totally relied upon.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("You are driving an older vehicle that has standard brakes. In an emergency braking situation:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("You are driving a vehicle that has anti-lock brakes. In an emergency braking situation:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("When you are driving, you should:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("In the city, looking ahead about 15 seconds from where you are translates to:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("The number one cause of collisions is:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("Active visual search involves:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("Active visual search and scanning techniques:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("When scanning the driving environment, you should look:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("An example of tunnel vision is focusing only on the car in front of you.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("When driving 60 miles per hour on the highway, looking ahead about 15 seconds from where you are translates to:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("The idea behind active scanning is to:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("When you are driving, you should look around:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("If you focus only on the car immediately in front of you:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("An immediate hazard requires immediate action.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("If you recognize hazardous driving situations in advance you can:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("Hazard mapping helps a driver:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Remember that there are three types of hazards: immediate hazards, potential hazards, and objects of interest. Which of the following is an immediate hazard?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("Remember that there are three types of hazards: immediate hazards, potential hazards, and objects of interest. Which of the following is a potential hazard?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("Remember that there are three types of hazards: immediate hazards, potential hazards, and objects of interest. Which of the following is an object of interest?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("Most traffic crashes occur:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("Good active visual search skills will help you:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("What is the recommended space cushion you should have in front of your car during normal daylight driving?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("Reaction distance refers to how far the car travels during:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("Braking distance refers to how far the car travels:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("Total stopping distance refers to:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("What are two things that define your sight distance?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("If you are driving 60mph under ideal conditions and you see a problem, your total stopping distance is:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("You should slow down if:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Your sight distance - how many seconds down the road you can see - can be limited by:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("Your speed should be adjusted depending upon:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("How big of an impact will tailgating and cutting in and out of traffic have on how long it takes you to get somewhere?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("You can reduce your risk of getting into a crash by:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("Speed is the second leading cause of collisions.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Remember that speed is relative. In which situation are you more likely to get in trouble?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("You are driving in a 55mph zone. If you speed up from 55 to 65, the odds of being injured in a collision:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("You are in a 55mph zone. If you speed up from 55 to 75, the odds of being injured in a collision:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("Your stopping distance should be shorter than your sight distance.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("The more you drive:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("An example of an inherently risky activity is:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("Cumulative risk:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("Why are teen drivers more at risk than older, more experienced drivers?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("One of the things that sets experienced drivers apart from less experienced drivers is:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("Younger drivers:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Risk is based on exposure")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("Inherent risk is:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("The phrase \"risk is fluid\" refers to:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("Risk increases with the:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("Driving faster:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("As you drive, what does the concept of cumulative risk mean?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("Each time you get behind the wheel, you accept some risk.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("You can minimize risk while driving by:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("When turning left at an intersection without a stoplight, what is the recommended gap in oncoming traffic you need to make a safe left hand turn?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("When turning left onto a two-way street, what is the recommended gap to oncoming vehicles approaching from your left?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("When turning left onto a two-way street, what is the recommended gap to oncoming vehicles approaching from your right?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("When you make a left turn coming out of a parking lot, what are the recommended gaps in traffic?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("When making a lane change in front of a car, where should that car be in your mirrors?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("It is safe to merge to the right lane if you can see a car in your right side mirror.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("The two rules involved in escape routes are:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("When you are thinking of changing lanes, what should you do?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("When you're attempting to merge into another lane on a highway you should:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("Common mistakes made when entering the freeway from an on-ramp are:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("When you are driving on a multi-lane highway the right lane is always the safest lane to drive in.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("Which one of the following is NOT a part of a safe lane change?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("If you want to merge left and see a car in your left side mirror, you should:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("If you are not planning to exit a multi-lane highway, the safest lane for you to be in is usually the middle lane.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Keeping an eye out for gaps in traffic, in front and back and in the other lanes, helps you identify possible escape routes.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("When using your rear view mirror to look at vehicles behind you in the lane to your left, cars closer to the middle of your rear view mirror are farther away and cars at the left edge of your rear view mirror are closer to you.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("An escape route can best be described as:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
		else if(str.equals("Teens have the highest number of distracted driving deaths because:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("Texting while driving:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("An example of visual distraction is:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("An example of manual distraction is:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Your crash risk increases based upon:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("Teens using a phone while driving are at greater risk than adults because?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Multi-tasking is a:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("Cognitive distractions:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("\"How you live is how you drive\" means:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Teens engage in risky practices more often than adults because:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("Risk-taking practices while driving can be reduced by:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("Lifestyle issues that can impact driving include:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("If you drive with 3 or more passengers under the age of 21, your crash risk increases by:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("If you drive with at least one passenger over the age of 35, your risk of death is cut by 62%.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("Glance-down distance is defined as:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("The time it takes to refocus on the road after you've been distracted:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("People who engage in risky choices like smoking, drinking, and drug use, are more likely to take risks behind the wheel.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("What is inattention blindness?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[4]")).click();
		}
		else if(str.equals("As cognitive load increases, reaction time:")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[2]")).click();
		}
		else if(str.equals("Drivers reduce their field of view by as much as 50% when talking on a cell phone.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("When driving with one passenger under the age of 21 your risk of a collision increases by 44%.")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[1]")).click();
		}
		else if(str.equals("What % of rear-end collisions are caused by talking on the phone or texting?")) {
			driver2.findElement(By.xpath("(//label[@class='radio-button-label'])[3]")).click();
		}
	}
}