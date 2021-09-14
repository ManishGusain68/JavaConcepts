package ioStream;

import java.io.FileNotFoundException;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {

	public static void main(String[] args) throws IOException {
		
		FileReader reader= null;
		FileWriter writer=null;
		
		try {
			reader =new FileReader("C:\\Users\\Manish Gusain\\Desktop\\java\\source1.txt");
		    writer=new FileWriter("C:\\Users\\Manish Gusain\\Desktop\\java\\dest1.txt");
		    
// reading source file and writing content to target file charcter by character		    
		int content;
		
		while((content = reader.read()) != -1)
		{
//		writer.append((char)content);
			writer.append((char)content);
		System.out.println("writing");
		
		}
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			if(reader != null) {
				reader.close();
			}
			
			if(writer != null) {
				writer.close();
		     }
		
		
	       }
}
}