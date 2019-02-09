package qum.controller;

import qum.DAO.UserDAO;
import qum.model.User;

public class TestDAO {

    public static void main(String[] args) {
	UserDAO UD = new UserDAO();
	User testUs =new User();

	testUs.setName("lera");
	UD.addUser(testUs);
    }

}
