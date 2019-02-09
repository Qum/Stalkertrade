package qum.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qum.DAO.UserDAO;
import qum.model.User;

/**
 * Servlet implementation class addingUser
 */

public class addingUser extends HttpServlet {

    private UserDAO DAO;
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public addingUser() {
	super();
    }

    /**
     * @see Servlet#init(ServletConfig)
     */
    public void init(ServletConfig config) throws ServletException {
	DAO = new UserDAO();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	
	
	if (request.getParameter("uname") != null & request.getParameter("uage") != null){
	    User user = new User();
	    user.setName(request.getParameter("uname"));
	   
	  
	    DAO.addUser(user);
	    request.setAttribute("mess", "User " + request.getParameter("uname") + " - add Success!!");
	    
	} else {
	    request.setAttribute("mess", "User don't create!");
	}
	request.getRequestDispatcher("debugView.jsp").forward(request, response);
    }

}
