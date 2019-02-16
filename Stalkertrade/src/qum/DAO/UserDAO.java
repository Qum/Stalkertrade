package qum.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import qum.model.Product;
import qum.model.User;

public class UserDAO {

    private static final String getUserByIdSql = "select * from users where id = ?";
    private static final String addUserSql = "insert into users(name, pass, email) values(?, ?, ?)";
    private static final String deleteUserSql = "delete from users where id = ?";
    private static final String updateUserSql = "update users set name = ?, pass = ?, email = ?, access_level = ?, coins = ? where id = ?";
    private static final String getUserByEmailSql = "select * from users where email = ?";
    private static final String getUserByNameSql = "select * from users where name = LCASE(?)";
    private static final String getAllUsersSql = "SELECT * FROM users";

    public User getUserById(int id) {
	ResultSet resultSet = null;
	User user = null;
	try (Connection connection = DbConnFactory.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(getUserByIdSql)) {
	    preparedStatement.setLong(1, id);

	    resultSet = preparedStatement.executeQuery();
	    if (resultSet.next()) {
		user = new User();
		user.setId(resultSet.getInt("id"));
		user.setName(resultSet.getString("name"));
		user.setPassword(resultSet.getString("pass"));
		user.setEmail(resultSet.getString("email"));
		user.setAcc_lvl(resultSet.getInt("access_level"));
		user.setCoins(resultSet.getInt("coins"));
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    if (resultSet != null) {
		try {
		    resultSet.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	    }
	}
	return user;
    }

    public int addUser(User user) {
	int id = 0;

	try (Connection connection = DbConnFactory.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(addUserSql)) {
	    preparedStatement.setString(1, user.getName());
	    preparedStatement.setString(2, user.getPassword());
	    preparedStatement.setString(3, user.getEmail());

	    id = preparedStatement.executeUpdate();
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return id;
    }

    public void deleteUser(Long id) {
	try (Connection connection = DbConnFactory.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(deleteUserSql)) {
	    preparedStatement.setLong(1, id);

	    preparedStatement.executeUpdate();

	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public void updateUser(User user) {
	try (Connection connection = DbConnFactory.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(updateUserSql)) {
	    preparedStatement.setString(1, user.getName());
	    preparedStatement.setString(2, user.getPassword());
	    preparedStatement.setString(3, user.getEmail());
	    preparedStatement.setInt(4, user.getAcc_lvl());
	    preparedStatement.setInt(5, user.getId());
	    preparedStatement.setInt(6, user.getCoins());

	    preparedStatement.executeUpdate();

	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public User getUserByEmail(String email) {
	ResultSet resultSet = null;
	User user = null;
	try (Connection connection = DbConnFactory.getConnection();
		PreparedStatement preparedStatement = connection
			.prepareStatement(getUserByEmailSql)) {
	    preparedStatement.setString(1, email);

	    resultSet = preparedStatement.executeQuery();
	    if (resultSet.next()) {
		user = new User();
		user.setId(resultSet.getInt("id"));
		user.setName(resultSet.getString("name"));
		user.setPassword(resultSet.getString("pass"));
		user.setEmail(resultSet.getString("email"));
		user.setAcc_lvl(resultSet.getInt("access_level"));
		user.setCoins(resultSet.getInt("coins"));
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    if (resultSet != null) {
		try {
		    resultSet.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	    }
	}
	return user;
    }

    public User getUserByName(String name) {
	ResultSet resultSet = null;
	User user = null;
	try (Connection connection = DbConnFactory.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(getUserByNameSql)) {
	    preparedStatement.setString(1, name);

	    resultSet = preparedStatement.executeQuery();
	    if (resultSet.next()) {
		user = new User();
		user.setId(resultSet.getInt("id"));
		user.setName(resultSet.getString("name"));
		user.setPassword(resultSet.getString("pass"));
		user.setEmail(resultSet.getString("email"));
		user.setAcc_lvl(resultSet.getInt("access_level"));
		user.setCoins(resultSet.getInt("coins"));
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	} finally {
	    if (resultSet != null) {
		try {
		    resultSet.close();
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	    }
	}
	return user;
    }
    
    public List<User> getAllUsers() {
   	List<User> allUsers = new LinkedList<>();
   	ResultSet resultSet = null;
   	User user = null;
   	try (Connection conn = DbConnFactory.getConnection();
   		PreparedStatement preparedStatement = conn.prepareStatement(getAllUsersSql)) {
   	    resultSet = preparedStatement.executeQuery();

   	    while (resultSet.next()) {
   		user = new User();
		user.setId(resultSet.getInt("id"));
		user.setName(resultSet.getString("name"));
		user.setPassword(resultSet.getString("pass"));
		user.setEmail(resultSet.getString("email"));
		user.setAcc_lvl(resultSet.getInt("access_level"));
		user.setCoins(resultSet.getInt("coins"));
		allUsers.add(user);
   	    }

   	} catch (Exception e) {
   	    e.printStackTrace();
   	} finally {
   	    if (resultSet != null) {
   		try {
   		    resultSet.close();
   		} catch (SQLException e) {
   		    e.printStackTrace();
   		}
   	    }
   	}

   	return allUsers;
       }
}
