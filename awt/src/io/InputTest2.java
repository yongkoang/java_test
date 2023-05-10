package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<1) {
			System.out.println("파일을 입력하세요!");
		}
		
		int c;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			while((c=fis.read())!= -1) {
				System.out.println((char)c);
			}
			fis.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());	
		}
	}

}
