package yamu;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JxlAssignment3 {
	public void ReadData(int intialrowno, int finalrow) throws BiffException, IOException
	{
		File f = new File("../yamu/Bookings.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r = ws.getRows(); 
		int c = ws.getColumns();
		for(int i=0; i<r; i++) //for row
		{
			if(i>=intialrowno && i<=finalrow)
			for(int j=0; j<c; j++) //for column
			{
				Cell c1 = ws.getCell(j,i);
				System.out.println(c1.getContents());
			}
		}
	}

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		JxlAssignment3 jxl = new JxlAssignment3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the intial rowno: ");
		int r = sc.nextInt();
		Scanner sb = new Scanner(System.in);
		System.out.println("Enter the finalno: ");
		int c = sb.nextInt();
		jxl.ReadData(r,c);
	}

}
