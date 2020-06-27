package com.techinfuse.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTesting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*File myFile = new File("C:\\Rajnish\\18Mar.txt");
		boolean status = myFile.createNewFile();
		System.out.println(status);*/

		
		/*FileOutputStream myStream = new FileOutputStream("C:\\Rajnish\\18Mar.txt");
		
		String text = "I live in Mumbai";
		byte b[] = text.getBytes();
		myStream.write(b);
		myStream.close();*/
		
		FileInputStream myStream = new FileInputStream("C:\\Rajnish\\18Mar.txt");
		
		int i=0;
		 while((i=myStream.read())!=-1)
		 {
			 System.out.print((char)i);
		 }
		
	}

}
