package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	
	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:postgresql://localhost:5432/demo";
		
		Connection conn=null;
		
		int rollnumber = 12;
		String studentName = "ashish";
		int marks = 100;
		String sql = "insert into Student(Student_Name,Student_id,Marks)"+ "values ('" + studentName+ "',"+rollnumber+","+ marks+")";
		System.out.println(sql);
try {
	
	conn = DriverManager.getConnection(url, "postgres", "user");
	
	Statement st=conn.createStatement();
	
	int m=st.executeUpdate(sql);
	
	if(m==1) {
		System.out.println("connection established");
	}else {
		System.out.println(" connection failed");
	}
	
	
}catch(Exception e) {
	System.out.println(e);
}
	finally {
		conn.close();
	}
	}
}
