package jdbc.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductInsert {
      public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	String  className ="com.mysql.cj.jdbc.Driver";
  		String url="jdbc:mysql://localhost:3306/productdb";
  		String user="root";
  		String password="root";
    	  
    	//1.load or register the product
    	Class.forName(className);
        //2.establish connection
    	Connection connection=DriverManager.getConnection(url, user, password);
    	//3.Creat Statement
  		Statement statement =connection.createStatement();
  	    //4.Execute the Statement or Processing the result
  		int count=statement.executeUpdate("INSERT PRODUCT VALUES(4,'SPORTSHOES',650,'PARAGON'),(3,'footwear',700,'BATA')");
  		if (count!=0) {
			System.out.println("Product Inserted");
		} else {
            System.out.println("Product Not Inserted");
		}
	 connection.close();
   }
}
