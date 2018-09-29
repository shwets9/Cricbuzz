package com.micro.Product.DAO;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

import com.micro.Product.model.ProductDTO;

public class ProductDAO {
	 String databaseURL = "jdbc:mysql://localhost:3306/resale";
	    String user = "root";
	    String password = "1234";
	     
	    public ProductDTO get(int id) throws SQLException, IOException {
	    	ProductDTO p = null;
	         
	        String sql = "SELECT * FROM new_table WHERE productId = ?";
	         
	        try (Connection connection = DriverManager.getConnection(databaseURL, user, password)) {
	            PreparedStatement statement = connection.prepareStatement(sql);
	            statement.setInt(1, id);
	            ResultSet result = statement.executeQuery();
	            System.out.println(result);
	            if (result.next()) {
	                p= new ProductDTO();

	        	    int productId= result.getInt("productId");
	        	    String productName= result.getString("productName");
	        	   
	        	   String productDescription= result.getString("productDescription");
	        	     int productCost= result.getInt("productCost");
	               
	                Blob blob = result.getBlob("productImage");
	                 
	                InputStream inputStream = blob.getBinaryStream();
	                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	                byte[] buffer = new byte[4096];
	                int bytesRead = -1;
	                 
	                while ((bytesRead = inputStream.read(buffer)) != -1) {
	                    outputStream.write(buffer, 0, bytesRead);                  
	                }
	                 
	                byte[] imageBytes = outputStream.toByteArray();
	                String productImage = Base64.getEncoder().encodeToString(imageBytes);
	                 
	                 
	                inputStream.close();
	                outputStream.close();
	                
	                
	                p.setProductId(productId);
	                p.setProductName(productName);
	                p.setProductImage(productImage);
	                p.setProductDescription(productDescription);
	                p.setProductCost(productCost);
	                
	               
	            }          
	             
	        } catch (SQLException | IOException ex) {
	            ex.printStackTrace();
	            throw ex;
	        }      
	         
	        return p;
	    }
}
