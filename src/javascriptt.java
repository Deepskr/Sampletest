import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class javascriptt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:85/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		String xp="//input[@type='password']";
		WebElement PW = driver.findElement(By.xpath(xp));
		RemoteWebDriver r = (RemoteWebDriver)driver;
		r.executeScript("arguments[0].value='manager'", PW);
		
		
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		Thread.sleep(3000);
		
		WebElement logout=driver.findElement((By.id("logoutLink")));
		//JavaScriptExecutor j = (JavaScriptExecutor)driver;
	r.executeScript("arguments[0].click()", logout);
		driver.close();
	}

}
