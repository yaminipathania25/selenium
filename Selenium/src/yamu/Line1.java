package yamu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Line1 {

	public void ReadData(int lineNumber) throws IOException
	{
		File f = new File("C:\\Users\\Yamini\\Desktop\\File.txt");
		FileReader r = new FileReader(f);
		BufferedReader br = new BufferedReader(r);
	    String s;
	    int line = 0;
	   while((s=br.readLine())!=null)
		{
		   line++;
		   if(line==lineNumber)
		   {
			   System.out.println(s);
			   break;
		   }
		}
	  if(line!=lineNumber)
	  {
		  System.out.println("Line is not found");
	  }
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Line1 l = new Line1();
		l.ReadData(2);
		//System.out.println(s);
	}

}
