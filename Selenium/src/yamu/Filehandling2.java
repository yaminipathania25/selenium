package yamu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filehandling2 {
	public void ReadDataFromRange(int initialRow, int endRow) throws IOException
	{
		File f = new File("C:\\Users\\Yamini\\Desktop\\File.txt");
		FileReader r = new FileReader(f);
		BufferedReader br = new BufferedReader(r);
	    String s;
	    int line = 0;
	    while((s=br.readLine())!=null)
	    {
	    	line++;
			   if(line>=initialRow && line<=endRow)
			   {
				   System.out.println(s);
			   }
			}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Filehandling2 f = new Filehandling2();
		f.ReadDataFromRange(2,4);

	}

}
