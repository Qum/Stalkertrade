package qum.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qum.DAO.UserDAO;

/**
 * Servlet implementation class ueditor
 */
@WebServlet("/admin")
public class AdminActionsController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminActionsController() {
	super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	UserDAO udao = new UserDAO();
	request.setAttribute("users", udao.getAllUsers());
	request.getRequestDispatcher("/admins.jsp").forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	UserDAO udao = new UserDAO();
	request.setAttribute("users", udao.getAllUsers());
	request.getRequestDispatcher("/admins.jsp").forward(request, response);
    }
}
