package Design;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class DateandTime{
	
	@BeforeTest
	@Parameters("browser")
	public void  getFormatedDateTime(String browser){
		
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
		SimpleDateFormat simpleDate1 = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		System.out.println(simpleDate1.format(new Date()));
		driver.close();
			}
		else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com");
			SimpleDateFormat simpleDate2 = new SimpleDateFormat("dd_MM_yyyy");
			System.out.println(simpleDate2.format(new Date()));
			driver.close();
		}
	
	
	}}


