package com.techinfuse.day1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datatest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Quickwork\\Documents\\rajnish.xlsx");
		XSSFWorkbook xw = new XSSFWorkbook(fs);
		XSSFSheet xs = xw.getSheetAt(0);
		
		for (int row= 1; row <= xs.getLastRowNum(); row++) {
			int col =1;
			XSSFCell   user, pass;
			user = xs.getRow(row).getCell(col);
			pass = xs.getRow(row).getCell(col+1);
			System.out.println("Username="+user.toString());
			System.out.println("Password="+pass.toString());

		}

	}
	
}	
