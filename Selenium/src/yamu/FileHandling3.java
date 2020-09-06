package yamu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling3 {
	public void WriteData(int rowCount) throws IOException
	{
		File f = new File("C:\\Users\\Yamini\\Desktop\\File.txt");
		FileReader r = new FileReader(f);
		BufferedReader br = new BufferedReader(r);
		FileWriter wr = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(wr);
		for(int i=0; i < rowCount; i++)
			{
				System.out.println("Update the text");
				Scanner sc = new Scanner(System.in);
				String sw = sc.nextLine();
				bw.write(sw);
				bw.newLine();
			}
		bw.close();
		}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileHandling3 f =new FileHandling3();
		f.WriteData(2);
		System.out.println("File Updated Successfully");

	}

}
