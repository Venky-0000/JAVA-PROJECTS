package xyz;
import java.io.*;

public class ReadFromFile {
	public static void main(String[] as) {
		try {
			FileReader reader=new FileReader("D:\\java programs\\array.java\\");
			int ch;
			while((ch=reader.read())!=1) {
				System.out.print((char) ch);
			}
			reader.close();
		}catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
	

}
