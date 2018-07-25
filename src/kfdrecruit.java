import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class kfdrecruit {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kfdrecruitment.in/");
		driver.findElement(By.linkText("Click here to download admission ticket for Range Forest Officer(RFO)’s preliminary exam 2018-19.")).click();
		
		FileInputStream fis = new FileInputStream("./data/input1.xslx");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1017143");
		
		driver.findElement(By.xpath("//select[@id='dob_d']/option[.='20']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='dob_m']/option[.='10']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='dob_y']/option[.='1992']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		//driver.findElement(By.id("editbutton")).click();
		driver.quit();
		
		//driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("document.getElementsByClassName('cancel')[0].click();");
		//	driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		
		//driver.findElement(By.xpath("//button[.='Cancel']")).click();
		//driver.close();
		
		/*try{
			Alert alert=driver.switchTo().alert();
			System.out.println("pop up is present");
			alert.accept();
		}
		
		catch(NoAlertPresentException e){
			System.out.println("pop up is not present");
		}*/
	}

}
