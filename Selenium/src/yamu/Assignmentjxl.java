package yamu;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignmentjxl {
	public void ReadData(int rowno, int columnno) throws BiffException, IOException
	{
		File f = new File("../yamu/Bookings.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		Cell c1 = ws.getCell(columnno,rowno);
		System.out.println(c1.getContents());
	}

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		Assignmentjxl jxl = new Assignmentjxl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rowno: ");
		int r = sc.nextInt();
		Scanner sb = new Scanner(System.in);
		System.out.println("Enter the Columnno: ");
		int c = sb.nextInt();
		jxl.ReadData(c,r);
		

	}

}
