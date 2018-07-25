package Design;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelgeneric {
	
	public static String data(String path,String sheet,int row,int cell){
	String s="";
	try{
	FileInputStream fis=new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fis);
	s = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	}
	catch(Exception e){
	}
	return s;
	
	}}
