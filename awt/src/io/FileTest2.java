package io;

import java.io.File;

class FileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length < 1) {
			System.out.println("디렉토리를 입력하세요");
			System.exit(0);
		}
		
		File dir = new File(args[0]);
		String filelist[] = dir.list();
		
		for (int i=0; i<filelist.length; i++) 
			System.out.println("File " + i + ":" + filelist[i]);
	} 

}
