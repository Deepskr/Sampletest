import java.text.SimpleDateFormat;
import java.util.Date;

public class DateandTime{
	
	public static String getFormatedDateTime(){
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		//SimpleDateFormat simpleDate = new SimpleDateFormat("");
		return simpleDate.format(new Date());
	}
	
	public static void main(String[] args)
	{
		DateandTime u1= new DateandTime();
		String op = u1.getFormatedDateTime();
		System.out.println(op);
	}
	}


