package yamu;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class JxlAssignment4 {
	public void ReadData(int rowcount, int columncount) throws IOException, WriteException
	{
		File f = new File("../yamu/Bookings.xls");
		WritableWorkbook wr = Workbook.createWorkbook(f);
		WritableSheet ws = wr.createSheet("Test", 0);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data in cell : ");
		String st = sc.nextLine();
		Label l = new Label(columncount, rowcount, st);
		ws.addCell(l);
		wr.write();
		wr.close();
		System.out.println("Data saved successfully");
	}
		

	public static void main(String[] args) throws BiffException, IOException, WriteException {
		// TODO Auto-generated method stub
		JxlAssignment4 jxl = new JxlAssignment4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the intial rowno: ");
		int r = sc.nextInt();
		Scanner sb = new Scanner(System.in);
		System.out.println("Enter the finalno: ");
		int c = sb.nextInt();
		jxl.ReadData(c,r);

	}

}
