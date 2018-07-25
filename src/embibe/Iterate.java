package embibe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iterate {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.embibe.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("START NOW")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Start Practice")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn solve__practice-btn ng-scope']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='difficulty-cubes']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='A']")).click();
		
		WebElement submit = driver.findElement(By.xpath("//button[.='SUBMIT']"));
		if(submit.isDisplayed())
		{
			System.out.println("submit is  displayed");
		}
		submit.click();
		
		
	}

}
