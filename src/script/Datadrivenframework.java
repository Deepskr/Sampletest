package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Design.Constant;
import Design.Excelgeneric;

public class Datadrivenframework implements Constant{
	public static void main(String[] args){
		System.setProperty(chromekey, chromevalue);
		
		String url=Excelgeneric.data(Excelpath, "sheet1", 1, 0);
		String un=Excelgeneric.data(Excelpath, "sheet1", 1, 1);
		String pw=Excelgeneric.data(Excelpath, "sheet1", 1, 2);
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pw);
		driver.findElement((By.xpath("//input[@value='Log In']"))).click();
		driver.close();
		
	}
	

}
