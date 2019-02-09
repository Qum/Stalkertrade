package qum.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qum.DAO.ProductDao;
import qum.model.Product;

/**
 * Servlet implementation class ProductAllController
 */
@WebServlet("/index.jsp")
public class ProductAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductDao PDao = new ProductDao();
       
    public ProductAllController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    List<Product> allprod = PDao.getAllProducts();
	    request.setAttribute("products", allprod);
	    request.getRequestDispatcher("index.jsp").forward(request, response);
	    
	}

}
