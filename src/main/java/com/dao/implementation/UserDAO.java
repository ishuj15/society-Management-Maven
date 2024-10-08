package com.dao.implementation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.Model.User;
import com.daoInterface.UserInterface;

public class UserDAO extends GenericDAO<User> implements UserInterface {


	@Override
	protected User mapResultSetToEntity(ResultSet resultSet) throws SQLException {
		User user = new User();
		user.setIdUser(resultSet.getString("idUser"));
		user.setUserName(resultSet.getString("userName"));
		user.setUserRole(resultSet.getString("userRole"));
		user.setPassword(resultSet.getString("password"));
		user.setPhoneNo(resultSet.getString("phoneNo"));
		user.setEmail(resultSet.getString("email"));
		user.setAddress(resultSet.getString("address"));
		return user;
	}
	public boolean addUser(User user) throws SQLException, ClassNotFoundException {
		String sqlQuery = String.format(
				"INSERT INTO User ( idUser, userName,  userRole, password,phoneNo,email,address) VALUES ('%s','%s','%s','%s', '%s','%s','%s')",
				user.getIdUser(), user.getUserName(), user.getUserRole(), user.getPassword(), user.getPhoneNo(),
				user.getEmail(), user.getAddress());
		return executeQuery(sqlQuery);
	}

	public User getUserById(String userId) throws SQLException, ClassNotFoundException {
		String sqlQuery = "SELECT * FROM user WHERE idUser = \"" + userId + "\"";
		return executeGetQuery(sqlQuery);
	}

	public User getUserByUserName(String userName) throws SQLException, ClassNotFoundException {
		String sqlQuery = "SELECT * FROM user WHERE userName = \"" + userName + "\"";
		return executeGetQuery(sqlQuery);
	}

	public boolean deleteUser(String userId) throws SQLException, ClassNotFoundException {
		String sqlQuery = "DELETE FROM user WHERE idUser = \"" + userId + "\"";
		return executeQuery(sqlQuery);
	}

	public List<User> getAllUsers() throws SQLException, ClassNotFoundException {
		String sqlQuery = "SELECT * FROM user";
		return executeGetAllQuery(sqlQuery);
	}
	public boolean updateUser(String userId, String columnToUpdate, String newValue)
			throws SQLException, ClassNotFoundException {
		String sqlQuery = String.format("UPDATE user SET %s = '%s' WHERE idUser = '%s'", columnToUpdate, newValue,
				userId);
		return executeQuery(sqlQuery);
	}

}
