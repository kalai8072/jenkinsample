import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Create a excel sheet
		
		
				FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx"); //This particular statement will create a empty excel file.
				
				//We have to create a WorkBook
				XSSFWorkbook workbook = new XSSFWorkbook();
				
				// We have to create a Sheets
				XSSFSheet sheet = workbook.createSheet();
				
				
				
				
				Scanner sc = new Scanner(System.in);
				
				for (int r = 0; r<=3; r++) {
					XSSFRow currentrow = sheet.createRow(r);

					for (int c = 0; c<3; c++) {

						System.out.println("Enter the value");
						String value = sc.next();
						currentrow.createCell(c).setCellValue(value);

					}
				}
				
				
				    workbook.write(file);
				    workbook.close();
				    file.close();
			    
			   
			    
			}


	}


