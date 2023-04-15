package JenkinsLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchTestSalesForce {

	@Test
public void LaunchSF() throws InterruptedException {
		System.out.println("SalesForce");
		//WebDriver driver;
		/*
		 * System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.get("https://test.salesforce.com/");
		 * //driver.findElement(By.xpath("//input[@name='una']")).click();
		 * driver.close();
		 */
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.salesforce.com/");
		
		driver.close();
		Thread.sleep(5000);
	}

}
