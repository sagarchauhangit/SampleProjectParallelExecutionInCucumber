package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StepDefs {
	WebDriver driver;
	Scenario scenario;
	String path = System.getProperty("user.dir");
	String chromeDriverPath = path + "\\Drivers\\chromedriver.exe";
	@Before
	public void SetUp(Scenario s) {
		scenario = s;
	}
	
	@Given("I open the Browser and Navigate to the URL {string}")
	public void i_open_the_Browser_and_Navigate_to_the_URL(String string) throws InterruptedException {

	
		System.out.println(chromeDriverPath);
		System.setProperty("webdriver.chrome.driver",chromeDriverPath );
		driver = new ChromeDriver();
		driver.get(string);
		Thread.sleep(10000);
		scenario.write("Opened the Browser with URL: " + string);
		Thread.sleep(10000);
		driver.close();
		driver.quit();
		
	}
	
}
