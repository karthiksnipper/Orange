package Karthik.KarthikMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestingMaven {
	
	
	public static void main(String[] args) throws  IOException {
		
	File file = new File ("C:\\Users\\karthik.ss\\eclipse-workspace\\KarthikMaven\\excel\\TestMav2.xlsx");
	
	FileInputStream stream = new FileInputStream(file);
	
	Workbook workbk = new XSSFWorkbook(stream);
	
	Sheet sheet = workbk.getSheet("datas");
	
	Row row2 = sheet.getRow(0);
	
	 for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		 Row row = sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			
			
			CellType cellType = cell.getCellType();
			
			
switch (cellType) {
	case STRING:
		RichTextString richValue = cell.getRichStringCellValue();
		System.out.println(richValue);		
				break;
	case NUMERIC:
		if (DateUtil.isCellDateFormatted(cell)) {
			
Date dateCellValue = cell.getDateCellValue();	
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
String formate = dateFormat.format(dateCellValue);
System.out.println(formate);
		} else {
				
			double d = cell.getNumericCellValue();
		BigDecimal b = BigDecimal.valueOf(d);
		String numbers = b.toString();
		System.out.println(numbers); 
		} 
		break;


			}
			
		
			
		}
		
	}
	
	}
}

		



