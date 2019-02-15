package qum.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.naming.NamingException;

import qum.model.Product;

public class ProductDao {

    private static final String  getProductByIdSql  = "select * from products where prod_id = ?";
    private static final String  getProductByTypeSql  = "select * from products where type = ?";
    private static final String  addProductSql   = "insert into products(prod_name, cost, descr, type) values(?, ?, ?, ?)";
    private static final String  deleteProductSql   = "delete from products where prod_id = ?";
    private static final String  updateProductSql   = "update products set prod_name = ?, cost = ?, descr = ?, type = ?";
    private static final String  getAllProductsSql   = "SELECT * FROM products";

    public int addProduct(Product prod) { 
	int id = 0;
	try (Connection conn = DbConnFactory.getConnection();PreparedStatement preparedStatement = conn.prepareStatement(
                addProductSql)) {
	    preparedStatement.setString(1, prod.getProd_name());
	    preparedStatement.setInt(2, prod.getCost());
	    preparedStatement.setString(3, prod.getDesc());
	    preparedStatement.setString(4, prod.getType());
	    id =  preparedStatement.executeUpdate();
	} catch (Exception e) {
	    e.printStackTrace();
	    System.out.println(e.getMessage());
	}
	return id; 
    }
    
    public Product getProductById(int id) {
        ResultSet resultSet = null;
        Product prod = null;
        try (Connection connection = DbConnFactory.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(
                getProductByIdSql)) {
            preparedStatement.setLong(1, id);
 
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
        	prod = new Product();
        	prod.setId(resultSet.getInt("prod_id"));
        	prod.setProd_name(resultSet.getString("prod_name"));
        	prod.setCost(resultSet.getInt("cost"));
        	prod.setDesc(resultSet.getString("descr"));
        	prod.setType(resultSet.getString("type"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
         }
        return prod;
    }
    
    public List<Product> getProductByType(String productType) {
   	List<Product> allProd = new LinkedList<>();
   	ResultSet resultSet = null;

   	try (Connection conn = DbConnFactory.getConnection();PreparedStatement preparedStatement = conn.prepareStatement(
   		getProductByTypeSql)) {
   	    	preparedStatement.setString(1, productType);
   		resultSet = preparedStatement.executeQuery();

   		while (resultSet.next()) {
   			Product prod = new Product();
   			prod.setId(resultSet.getInt("prod_id"));
   	        	prod.setProd_name(resultSet.getString("prod_name"));
   	        	prod.setCost(resultSet.getInt("cost"));
   	        	prod.setDesc(resultSet.getString("descr"));
   	        	prod.setType(resultSet.getString("type"));

   	        	allProd.add(prod);
   		}

   	} catch (Exception e) {
               e.printStackTrace();
           } finally {
               if(resultSet != null){
                   try {
                       resultSet.close();
                   } catch (SQLException e) {
                       e.printStackTrace();
                   }
               }
            }

   	return allProd;
       }
    
    public void deleteUser(int id) {
        try (Connection connection = DbConnFactory.getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(
        	deleteProductSql)) {
            preparedStatement.setLong(1, id);
            
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    public void updateProduct(Product prod)  {
            try (Connection conn = DbConnFactory.getConnection();PreparedStatement preparedStatement = conn.prepareStatement(
                    updateProductSql)) {
    	    preparedStatement.setString(1, prod.getProd_name());
    	    preparedStatement.setInt(2, prod.getCost());
    	    preparedStatement.setString(3, prod.getDesc());
    	    preparedStatement.setString(4, prod.getType());

            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    public List<Product> getAllProducts() {
	List<Product> allProd = new LinkedList<>();
	ResultSet resultSet = null;

	try (Connection conn = DbConnFactory.getConnection();PreparedStatement preparedStatement = conn.prepareStatement(
                getAllProductsSql)) {
		resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			Product prod = new Product();
			prod.setId(resultSet.getInt("prod_id"));
	        	prod.setProd_name(resultSet.getString("prod_name"));
	        	prod.setCost(resultSet.getInt("cost"));
	        	prod.setDesc(resultSet.getString("descr"));
	        	prod.setType(resultSet.getString("type"));
	        	System.out.println(prod);
	        	allProd.add(prod);
		}

	} catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
         }

	return allProd;
    }

}
