package exceptionhandling;


import java.util.ArrayList;
import java.util.List;


public class WriterHelper {

	//final static Logger logger= LogManager.getLogger(MyFileWriter.class.getName());
	
	public void writeList() {
		
		try {
		List<Integer> list= new ArrayList<>(10);
		list.add(10);
		System.out.println("entering try block");
		System.exit(0);
		Integer a=list.get(1);
		
		System.out.println("accesing the second element" + a);
		
		}
		catch (IndexOutOfBoundsException e)
		{
			System.err.println("Caught IndexOutOfBoundsException : " +e.getMessage());
			//throw e;
			//logger.fatal("unable to open file" + e);
		}
		finally {
			System.out.println("this will always gets executed");
		
		}
	}

}
