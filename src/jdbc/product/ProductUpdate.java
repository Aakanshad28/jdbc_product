package jdbc.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String  className ="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/productdb";
		String user="root";
		String password="root";
		String sql="UPDATE PRODUCT SET NAME='SPORTSHOES' WHERE ID=1";
		
		//1.Load or Register the Driver
		Class.forName(className);
						
		//2.Establish connection
		Connection connection=DriverManager.getConnection(url,user,password);
						
		//3.Creat Statement
		Statement statement =connection.createStatement();
		
		//4.
		int count=statement.executeUpdate(sql);
		if (count!=0) {
			System.out.println("Data Updated");
		}
		else {
             System.out.println("Data Not Updated");
		}
		//5.Close Connection
		connection.close();	
	}

}
