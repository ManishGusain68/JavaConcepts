package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDeserDemo {

	public static void main(String[] args)  {
		Student student=new Student("manish", 31, "dehradun");
		student.setX(10);
		
		String filename = "C:\\Users\\Manish Gusain\\eclipse-workspace\\AdvanceJava\\bin\\Serializable\\Test.txt";
		FileOutputStream fileout=null;
		ObjectOutputStream objOut=null;
		//Serialization
		try {
			
			fileout = new FileOutputStream(filename);
			
			objOut= new ObjectOutputStream(fileout);
			
			objOut.writeObject(student);
			
			objOut.close();
			fileout.close();
			System.out.println("object has been serialized");
			
		}catch (IOException e) {
			System.out.println("IOException is caught");
		}
		
		//Deserialization
		
		FileInputStream fileIn=null;
		ObjectInputStream objIn=null;
		
		try {
			fileIn= new FileInputStream(filename);
			objIn = new ObjectInputStream(fileIn);
			
			Student object = (Student) objIn.readObject();
			System.out.println("objest has been deserialized"+"\n "+ object);
			//System.out.println("object has been deserialized"+"\n "+ object.getAge());
			System.out.println("the deserialized value of x  is"+ object.getX());  // to test transient variable
			fileIn.close();
			objIn.close();
			
		}catch (IOException e) {
			System.out.println("Exception is caught");
		}
//			finally{
//				System.out.println("reached final");
//			}
 catch (ClassNotFoundException e) {
	 System.out.println("Exception is c"
	 		+ "aught");
		}

		
		
		
		
		
	}
}
