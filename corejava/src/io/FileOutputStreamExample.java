package io;
import java.io.*;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("E:susmtha.txt");
		String s= "Selenium is an automation tool!";
		byte b[]=s.getBytes();  //converts the string s into bytes...
		fout.write(b);
		fout.close();

	}

}
