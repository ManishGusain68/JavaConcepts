package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream inStream =null;
		FileOutputStream outStream=null;
		
		
		try {
			inStream=new FileInputStream("C:\\Users\\Manish Gusain\\Desktop\\java\\source.txt");
		    outStream= new FileOutputStream("C:\\Users\\Manish Gusain\\Desktop\\java\\dest.txt");
		//reads a byte at a time, if it reached end of the file, return -1
		int content;
		
		while((content=inStream.read()) != -1)
		{
			outStream.write((byte)content);
			
		}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(inStream != null)
			{
				inStream.close();
			}
			
			if(outStream != null)
			{
				outStream.close();
			}
		}
		
		
	}

}
