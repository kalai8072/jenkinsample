package org.revisitconcepts;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata1\\myfile1.xlxs");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		
		
		Scanner sc = new Scanner(System.in);
		
		for (int r=0;r<=2;r++)
		{
			XSSFRow currentrow = sheet.createRow(r);
			
			for (int c=0;c<2;c++)
				
			{
				System.out.println("Enter the value");
				String value = sc.next();
				currentrow.createCell(c).setCellValue(value);
				
				
				
			}
			
			
		}
		
		

		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("writing is done");
		
	}

}
