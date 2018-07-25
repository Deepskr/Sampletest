import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		
		
		String imageFolderPath="D:\\Resumes";
		Screenshot.getScreenShot(driver, imageFolderPath);
		/*TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("D://amazon.png");
		FileUtils.copyFile(src, dest);
		
		driver.close();*/
		}
	
	public static String getScreenShot(WebDriver driver,String imageFolderPath){
		String imagePath=imageFolderPath+"/"+getFormatedDateTime()+".png";
		
		try{
			Dimension desktopSize=Toolkit.getDefaultToolkit().getScreenSize();
			BufferedImage image = new Robot().createScreenCapture(new Rectangle(desktopSize));
			ImageIO.write(image, "png", new File(imagePath));
		}
		catch(Exception e){
		}

		return imagePath;
	}
	
	private static String getFormatedDateTime() {
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		return simpleDate.format(new Date());
		
	}
}
