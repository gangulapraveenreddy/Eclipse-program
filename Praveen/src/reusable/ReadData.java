

package reusable;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData
{
public static void main(String args[]) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("D:\\Automation\\github\\Praveen\\src\\reusable\\data.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet s=wb.getSheet("praveen");
	Row r=s.getRow(1);
	Cell c=r.getCell(2);
	System.out.println(c.getStringCellValue());
}
}