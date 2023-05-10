package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class OutputTest2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(new File("D:\\temp\\java\\source.txt"));
			fos = new FileOutputStream(new File("D:\\temp\\java\\dest.txt"));
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} 
		
		byte b[] = new byte[16];
		int c;
		try {
			while ((c=fis.read(b))!=-1) {
				fos.write(b, 0, c);
			}
			
			fis.close();
			fos.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
