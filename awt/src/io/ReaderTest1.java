package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<1) {
			System.out.println("파일을 입력하세요!");
		}
		
		int c;
		FileReader fr = null;
		
		try {
			fr = new FileReader(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			while((c=fr.read())!= -1) {
				System.out.println((char)c);
			}
			fr.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());	
		}
	}

}
