package com.onesoft.day16;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Fexception {
	public static void main(String[] args) throws IOException {
		try {
			File f = new File("C:\\Users\\DELL\\Documents\\ones.txt");
			FileReader fr = new FileReader(f);
			int temp = 0;
			while ((temp=fr.read())!=-1) {
				System.out.println((char)(temp));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
