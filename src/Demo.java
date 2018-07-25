import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver f=new FirefoxDriver();
		//ChromeDriver c=new ChromeDriver();
		f.get("http://opensource.demo.orangehrmlive.com/");
		
		WebDriverWait wait;
		wait= new WebDriverWait(f,15);
		
		f.findElement(By.id("txtUsername")).sendKeys("Admin");
		f.findElement(By.id("txtPassword")).sendKeys("admin");
		f.findElement(By.id("btnLogin")).click();
		
		String eURl="http://opensource.demo.orangehrmlive.com/index.php/dashboard";
		wait.until(ExpectedConditions.urlContains(eURl));
		
		String xp="//.[text()='Welcome Admin']";
		
		
		//System.out.println(Demo.verifyElementIsPresentOrNot(xp));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xp)));
		
		
		
		
		f.findElement(By.xpath(xp)).click();
		
		//f.findElement(By.xpath("//.[text()='Change Password']")).click();
		
		//f.findElement(By.xpath("//input[@name='btnCancel']")).click();
		
		Thread.sleep(10000);
		f.close();

	}
	
	/*public static boolean verifyElementIsPresentOrNot(String xp){
		  try{
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xp)));
			  return true;
		  }
		  catch(Exception e){
			  return false;
		  }
	}*/
}
