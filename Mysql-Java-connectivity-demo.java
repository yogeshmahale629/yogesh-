package demoT3;

import java.sql.*;

class demo{
	public static void main(String args[])
	{
	
  try{
	System.out.println("welcome....");
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classd?useSSL=false","root","root"); 
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("Select * from student");

	while(rs.next())	
	{
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
	}
String sql = "insert into student (rollno,name,marks,class) values (56,'anurag',25,'SE')";
int rows = stmt.executeUpdate(sql);
int dlt = stmt.executeUpdate("delete from student where rollno=80");
System.out.println(dlt);
con.close();

}catch(Exception e)
{
e.printStackTrace();
//System.out.println(e.getMessage());
}
}
}

//http://www.coderanch.com/t/525565/JDBC/databases/MySQL-Connector