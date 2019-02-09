package qum.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import qum.DAO.DbConnFactory;
import qum.model.Product;

/**
 * Servlet implementation class cartItems
 */
@WebServlet("/cartItems")
public class cartItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cartItems() {
        super();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession session = request.getSession();
	    List<Product> cartList;
	    
	   if (session.getAttribute("Cart") == null){
	        cartList = new LinkedList<Product>();
	       session.setAttribute("Cart", cartList);
	   }
	  
	   Product prod = new Product();
	   prod.setCost(101);
	   prod.setDesc("sadsad");
	   cartList = (List<Product>) session.getAttribute("Cart");
	   cartList.add(prod);
//	   session.setAttribute("CartItem", prod);
	   session.setAttribute("CartItems", cartList);
	   
	   Cookie kyka = new Cookie("kyka","myka");
	   response.addCookie(kyka);
	   request.getRequestDispatcher("cart.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
