package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class WriterTest1 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader(new File("D:\\temp\\java\\source.txt"));
			fw = new FileWriter(new File("D:\\temp\\java\\dest.txt"));
			
			char b[] = new char[32];
			int c;
			while ((c=fr.read(b))!=-1) {
				fw.write(b, 0, c);
			}
			
			fr.close();
			fw.close();
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
