package AutomationTesting.Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {
	ChromeDriver driver;
	
	@BeforeMethod
	public void launchDriver() {
		 driver = new ChromeDriver();
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\bmsha\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@org.testng.annotations.Test
	public void test1() {
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
	public void test2() {
		
	}
	public void test3() {
		
	}

}
