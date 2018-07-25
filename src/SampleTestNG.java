import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTestNG {
	
	@Test(invocationCount=5)
	public void f(){
		Reporter.log("f1 is passed", true);
	}
	
	@Test(priority=2)
	public void e(){
		Reporter.log("f2 is passed", true);
	}
	
	@Test(priority=2)
	public void d(){
		Reporter.log("f3 is passed", true);
	}
	
}
