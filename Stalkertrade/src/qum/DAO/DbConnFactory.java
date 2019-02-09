package qum.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

//import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class DbConnFactory {



    public static Connection getConnection() throws SQLException, NamingException {
	InitialContext initContext = new InitialContext();
	BasicDataSource dataSource = (BasicDataSource) initContext.lookup("java:comp/env/jdbc/Stalkertrade");

	System.err.println(">>" + dataSource);
	return dataSource.getConnection(); 

    }
}