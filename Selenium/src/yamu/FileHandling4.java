package yamu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling4 {
	public void writeDataInRange(int initialRow, int endRow) throws IOException
	{
		File f1 = new File("C:\\Users\\Yamini\\Desktop\\File.txt");
		FileWriter wr1 = new FileWriter(f1);
		BufferedWriter bw1 = new BufferedWriter(wr1);
		for(int i=0; i < initialRow; i++)
		   {
		   bw1.newLine();
		   }
		for(int i=initialRow; i <= endRow; i++)
		{
			System.out.println("Update the text");
			Scanner sc = new Scanner(System.in);
			String sw = sc.nextLine();
			wr1.write(sw + "\n");
		    bw1.newLine();
		 }
		wr1.close();
      }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileHandling4 fh = new FileHandling4();
		fh.writeDataInRange(2, 4);
		System.out.println("File Updated Successfully");

	}

}
