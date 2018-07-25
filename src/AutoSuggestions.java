import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='sbqs_c']"));
		int count=ele.size();
		System.out.println(count);
		
		for(WebElement ele1:ele)
		{
			System.out.println(ele1.getText());
		//	System.out.println(ele1.getAttribute("class"));
		
		}
		
		
		//driver.findElement((By.xpath("//div[.='javascript tutorial']"))).click();
		System.out.println(ele.get(count-1).getText());
		ele.get(count-1).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='hdtb-mitem hdtb-imb']/a[.='Videos']")).click();
		//div[@class='hdtb-mitem hdtb-imb']/a[.='News']
		Thread.sleep(6000);
		driver.close();
	}
	
	

}
