package BaseSuit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class baseSuit {


	@DataProvider(name="getvalue")

	public static Object[][]DataSupplier(Method method) throws IOException

	{
		File file=new File("D:\\shweta\\AutomationProgram\\OrangeHRMProject_P\\Data\\LogInOHRM_P.xlsx");//FillAddCustomerDetails-name of workbook 

		FileInputStream fis =new FileInputStream(file);

		XSSFWorkbook workbook=new XSSFWorkbook(fis);

		XSSFSheet sheet=workbook.getSheet(method.getName());//sheet1-name of sheet

		int rowcount=sheet.getLastRowNum(); //gives data except table heading
		//sheet.getPhysicalNumberOfRows(); //gives data with table heading
		System.out.println("total no.of rows are:"+rowcount);

		int colCount=sheet.getRow(0).getLastCellNum();
		System.out.println(colCount);
		Object[][] data= new Object[rowcount][colCount];
		//System.out.println("total no.of columns are:"+colCount);

		
		DataFormatter df=new DataFormatter();
		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				//data[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
				Cell value =sheet.getRow(i+1).getCell(j);
				data[i][j]=df.formatCellValue(value);
				
			}
		}

		
		
		return data;

	}
	
	

}