package io;

import java.io.File;

class FileTest1 {
	public static void main(String[] args) {
		File dir = new File("D:\\temp\\java");
		File file = new File(dir, "test.java");
		
		System.out.println("===============d:\\temp\\java================");
		System.out.println("getName() : " + dir.getName());
		System.out.println("getPath() : " + dir.getPath());
		System.out.println("isDirectory() : " + dir.isDirectory());
		System.out.println("isFile() : " + dir.isFile());
		System.out.println("isHidden() : " + dir.isHidden());
		
		
		System.out.println("===============test.java================");
		System.out.println("getPath() : " +file.getPath());
		System.out.println("canRead() : " + file.canRead());
		System.out.println("canWrite() : " + file.canWrite());
		System.out.println("length() : " + file.length());
		
	}
}
