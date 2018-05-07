package runnerPackage;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"src/test/resources/featureFiles"}, plugin = {"pretty","html:target/cucumber"},
glue = {"stepImplementations"}, tags = {"@smokeTest"},
monochrome = true)
public class TestRunner {
	public static WebDriver driver;
	/*@Before
	public static void initializeBrowser() {
		String currentWorkingDirectory = System.getProperty("user.dir");
		System.out.println("CWD : " + currentWorkingDirectory);
		System.setProperty("webdriver.chrome.driver", currentWorkingDirectory+"\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/");
	}*/
	/*@After
	public static void closeBrowser() {
		driver.quit();
	}
*/


}