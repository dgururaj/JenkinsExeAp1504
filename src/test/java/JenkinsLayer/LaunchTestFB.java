package JenkinsLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class LaunchTestFB {

	@Test
	public void LaunchFB() throws InterruptedException {
		System.out.println("Facebook");
		
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//driver.close();
		Thread.sleep(5000);
	}

}
