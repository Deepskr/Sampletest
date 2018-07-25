import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readexcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("./Excel/Excelsheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		//To read the data
		//String value = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		//System.out.println(value);
		
		//To re-write the data
		//Cell c = wb.getSheet("Sheet1").getRow(0).getCell(0);
		//c.setCellValue("Everything happens for a reason");
		//FileOutputStream fo1 = new FileOutputStream("./Excel/Excelsheet.xlsx");
		//wb.write(fo1);
		
		//To write fresh data
		/*Cell c1 = wb.getSheet("Sheet1").createRow(1).createCell(0);
		c1.setCellValue("so dont worry");
		FileOutputStream fo = new FileOutputStream("./Excel/Excelsheet.xlsx");
		wb.write(fo);*/
		
		Runtime.getRuntime().exec("D:\\Automation2\\Autoit files\\s2.exe");
		
	}

}
