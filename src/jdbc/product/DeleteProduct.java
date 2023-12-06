package jdbc.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteProduct {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String  className ="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/productdb";
		String user="root";
		String password="root";
		String sql="DELETE FROM PRODUCT WHERE ID=2";
		
		//1.Load or Register the Driver
		Class.forName(className);
						
		//2.Establish connection
		Connection connection=DriverManager.getConnection(url,user,password);
						
		//3.Creat Statement
		Statement statement =connection.createStatement();
		
		//4.
		int count=statement.executeUpdate(sql);
		if (count!=0) {
			System.out.println("Data Deleted");
		}
		else {
             System.out.println("Data Not Deleted");
		}
		statement.close();
		connection.close();
	}

}
