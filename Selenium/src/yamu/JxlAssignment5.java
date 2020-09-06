package yamu;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class JxlAssignment5 {
	public void ReadData(int Startrow, int endrow) throws IOException, WriteException, BiffException
	{
	File f = new File("../yamu/Bookings.xls");
	Workbook wk = Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	File f2 = new File("../yamu/Booking.xls");
	WritableWorkbook wr = Workbook.createWorkbook(f2);
	WritableSheet ws1 = wr.createSheet("test", 0);
	for(int i=Startrow; i<=endrow; i++) //for rowss
	{
		for(int j=0; j<=10; j++) //for column
		{
			Cell c1 = ws.getCell(j,i);
			Label l = new Label(j, i, c1.getContents());
			ws1.addCell(l);
		}
	}
	wr.write();
	wr.close();
	System.out.println("Data saved successfully");
}
	public static void main(String[] args) throws WriteException, IOException, BiffException {
		// TODO Auto-generated method stub
		JxlAssignment5 jxl = new JxlAssignment5();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the intial rowno: ");
		int r = sc.nextInt();
		Scanner sb = new Scanner(System.in);
		System.out.println("Enter the finalno: ");
		int c = sb.nextInt();
		jxl.ReadData(c,r);


	}

}
