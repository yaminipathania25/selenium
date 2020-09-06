package yamu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling5 {
	public void copyData() throws IOException
	{
	File f1 = new File("C:\\Users\\Yamini\\Desktop\\File.txt");
	FileReader fr1 = new FileReader(f1);
	BufferedReader br1 = new BufferedReader(fr1);
	File f2 = new File("C:\\Users\\Yamini\\Desktop\\Newfile.txt");
	FileWriter fw1=new FileWriter(f2);
	BufferedWriter bw = new BufferedWriter(fw1);
	String s;
	while((s=br1.readLine())!=null)
	{
		fw1.write(s + "\n");
		bw.newLine();
	}
	fw1.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileHandling5 fh=new FileHandling5();
		fh.copyData();
		System.out.println("New File updated successfully");
	}

}
