package qum.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ueditor
 */
@WebServlet("/ueditor")
public class UserEditorController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserEditorController() {
	super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	if (request.getParameter("edit") != null) {
	    String userLogin = request.getParameter("edit");
	    request.setAttribute("mess", "Edit " + userLogin);
	    request.getRequestDispatcher("debugView.jsp").forward(request, response);
	}

	else if (request.getParameter("delete") != null) {
	    String userLogin = request.getParameter("delete");
	    request.setAttribute("mess", "Delete " + userLogin);
	    request.getRequestDispatcher("debugView.jsp").forward(request, response);
	} else {
	    request.setAttribute("1", "Pety");
	    request.setAttribute("2", "Koly");
	    request.getRequestDispatcher("/useredit.jsp").forward(request, response);
	}
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
    }

}
