package io;

import java.io.IOException;
import java.io.InputStream;

public class InputTest1 {
	public static void main(String[] args) {
		int c;
		System.out.println("문자를 입력하세요!");
		InputStream in = System.in;
		try {
			// 문자 q를 입력받으면 종료한다.
			while((c=in.read())!='q') {
				System.out.println("문자 : "+(char)c);
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
