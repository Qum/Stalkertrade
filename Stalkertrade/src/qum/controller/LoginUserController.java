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
import qum.commonClasses.LoginValidator;
import qum.model.User;

@WebServlet("/logincheck")
public class LoginUserController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginUserController() {
	super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	User tempUser = new User();
	tempUser.setName(request.getParameter("uname"));
	tempUser.setPassword(request.getParameter("upass"));

	List<String> validateErrors = new LoginValidator().validate(tempUser);
	// if no errors
	if (validateErrors.size() == 0) {
	    UserDAO dao = new UserDAO();
	    User preAuthUser = dao.getUserByName(tempUser.getName());
	    boolean userExist = preAuthUser != null;
	    boolean passwordMatch = preAuthUser.getPassword().equals(
		    Hasher.cryptPassword(tempUser.getPassword()));

	    if (userExist && passwordMatch) {
		// if user exists and pass valid
		request.getSession().setAttribute("LoggetUser", preAuthUser);
		request.getRequestDispatcher("/home.jsp").forward(request, response);
	    } else {
		validateErrors.add("Неверные данные пользователя");
		request.setAttribute("errors", validateErrors);
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	    }
	} else {
	    request.setAttribute("errors", validateErrors);
	    request.getRequestDispatcher("/login.jsp").forward(request, response);

	}
    }
}