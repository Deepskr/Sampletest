import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoitexample {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver f=new FirefoxDriver();
		f.get("https://www.google.com");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\Automation2\\Autoit files\\s3.exe");
		Thread.sleep(3000);
		f.close();
		
	}

}
