import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SampleMFIE {

	static{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		System.setProperty("webdriver.ie.driver","./software/IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver1= new FirefoxDriver();
	SampleMFIE.abc(driver1);
		
		
		WebDriver driver2= new ChromeDriver();
		SampleMFIE.abc(driver2);
		
		WebDriver driver3= new InternetExplorerDriver();
		SampleMFIE.abc(driver3);
		
		}
	
	public static void abc(WebDriver d) throws InterruptedException{
		d.get("https://www.amazon.com");
		String title=d.getTitle();
		System.out.println(title);
		String Url=d.getCurrentUrl();
		System.out.println(Url);
		Thread.sleep(30000);
		d.close();
	}

}
