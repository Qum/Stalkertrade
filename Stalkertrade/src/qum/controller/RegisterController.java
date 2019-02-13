package qum.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qum.DAO.UserDAO;
import qum.commonClasses.Hasher;
import qum.commonClasses.Validator;
import qum.model.User;

@WebServlet("/registrator")
public class RegisterController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public RegisterController() {
	super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	User NewUser = new User();
	NewUser.setName(request.getParameter("uname"));
	NewUser.setPassword(request.getParameter("upass"));
	NewUser.setEmail(request.getParameter("umail"));

	List<String> userValidate = new Validator().validate(NewUser);

	if (userValidate.size() == 0) {
	    NewUser.setPassword(Hasher.cryptPassword(NewUser.getPassword()));
	    UserDAO DAO = new UserDAO();
	    DAO.addUser(NewUser);
	    request.setAttribute("userName", NewUser.getName());
	    request.getRequestDispatcher("/home.jsp").forward(request, response);
	} else {
	    request.setAttribute("errors", userValidate);
	    request.getRequestDispatcher("/register.jsp").forward(request, response);

	}
    }

}