package jdbc.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductFetch {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String  className ="com.mysql.cj.jdbc.Driver";
  		String url="jdbc:mysql://localhost:3306/productdb";
  		String user="root";
  		String password="root";
  		String sql="SELECT * FROM PRODUCT";
  		//1.load or register the Driver
  		Class.forName(className);
  		
  		//2. Establish Connection
  		Connection connection=DriverManager.getConnection(url, user, password);
  		
  		//3.Creat Statement
  		Statement statement=connection.createStatement();
  		
  		//4.
  		ResultSet resultSet=statement.executeQuery(sql);
  		while(resultSet.next())
  		{
  			System.out.println(resultSet.getInt(1));
  			System.out.println(resultSet.getString(2));
  			System.out.println(resultSet.getDouble(3));
  			System.out.println(resultSet.getString(4));
  			System.out.println("*************=======***********");
  		}
  		resultSet.close();
        statement.close();	
        connection.close();
}

}
