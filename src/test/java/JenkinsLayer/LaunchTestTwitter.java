package JenkinsLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchTestTwitter {

	@Test
public void LaunchTwitter() throws InterruptedException {
	/*
	 * WebDriver driver; System.setProperty("webdriver.chrome.driver",
	 * "./driver/chromedriver.exe"); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * driver.get("https://twitter.com/login"); driver.close();
	 */
		System.out.println("Twitter");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.twitter.com/");
		
		//driver.close();
		Thread.sleep(5000);

	}

}
