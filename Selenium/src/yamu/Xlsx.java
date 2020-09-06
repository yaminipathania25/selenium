package yamu;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Xlsx {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		File f = new File("../yamu/Bookings.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r = ws.getRows(); 
		int c = ws.getColumns();
		for(int i=0; i<r; i++) //for row
		{
			for(int j=0; j<c; j++) //for column
			{
				Cell c1 = ws.getCell(j,i);
				System.out.println(c1.getContents());
			}
		}
	}

}
