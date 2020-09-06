package yamu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class String6 {
	//STRING ASSIGNMENT 6: Count the no. of lines, words and characters in a txt file.
	public String6() throws IOException
	{
	File f = new File("C:\\Users\\Yamini\\Desktop\\File.txt");
	FileReader r = new FileReader(f);
	BufferedReader br = new BufferedReader(r);
    String s;
    int lines = 0, words = 0, chars = 0;
    while((s=br.readLine())!=null)
    {
    	lines++;
    	System.out.println(s);
    	String[] wr = s.split(" ");
    	words = words + wr.length;
    	for(String word : wr)
    	{
    		chars = chars+word.length();
    	}
    }
    System.out.println("No. of Lines " + lines);
    System.out.println("No. of Words " + words);
    System.out.println("No. of Characters " + chars);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String6 o = new String6();

	}

}
