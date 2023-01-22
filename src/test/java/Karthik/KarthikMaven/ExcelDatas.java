package Karthik.KarthikMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDatas {
	
	public void writeCellData(String SheetName,int rownum,int cellnum,String dataV) throws Throwable {
		File file = new File("C:\\Users\\karthik.ss\\eclipse-workspace\\KarthikMaven\\excel\\TestMav.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(dataV);
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		workbook.write(fileOutputStream);
		
		

	}
	
	
	
	
	
	public void updateCellData(String SheetName,int rownum,int cellnum,String oldData,String newData) throws IOException {
		//Update the cell data
		File file = new File("C:\\Users\\karthik.ss\\eclipse-workspace\\KarthikMaven\\excel\\TestMav.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = cell.getStringCellValue();
		if (value.equals(oldData)) {
			cell.setCellValue(newData);
			
		}
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
		

	}
	
	
	
	
	
	
	
	public String getDataFromCell(String SheetName,int rownum,int cellnum) throws IOException {
		String res = null;
		
		File file = new File("C:\\Users\\karthik.ss\\eclipse-workspace\\KarthikMaven\\excel\\TestMav.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType type = cell.getCellType();
		
		CellType cellType = cell.getCellType();
		
	switch (type) {
	case STRING:
		res = cell.getStringCellValue();
		break;
	
	case NUMERIC:
		if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat simpledateformat = new SimpleDateFormat("dd-mm-yyyy");
			res = simpledateformat.format(dateCellValue);
		}else {
			double d = cell.getNumericCellValue();
			
			long check = Math.round(d);
			if (check==d) {
				res = String.valueOf(check);
			}else {
				res = String.valueOf(d);
				
			}
			
		}
		break;
		default:
			break;
	}
	return res;
	
 
	}

}