package qum.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qum.DAO.ProductDao;
import qum.model.Product;

/**
 * Servlet implementation class ProductManage
 */
@WebServlet("/ProductManage")
public class ProductManage extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /** 
     * @see HttpServlet#HttpServlet()
     */
    public ProductManage() {
	super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	String pName = request.getParameter("pname");
	ProductDao PDAO = new ProductDao();
	Product prod = new Product();
	prod.setProd_name(pName);
	prod.setCost(500);
	prod.setDesc("test drscr");
	PDAO.addProduct(prod);
	request.setAttribute("mess", "Продукт " + pName + " - добавлен");
	request.getRequestDispatcher("debugView.jsp").forward(request, response);
    }
}
