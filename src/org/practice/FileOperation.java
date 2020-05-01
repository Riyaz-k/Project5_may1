package org.practice;

import java.io.File;
import java.io.IOException;

public class FileOperation {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Framework\\work\\divi.txt");
		
		boolean createNewFile = f.createNewFile();
		System.out.println(createNewFile);
		
		boolean checkfile = f.isFile();
		System.out.println(checkfile);
		
		boolean canRead = f.canRead();
		
		
	}
	
	
}
