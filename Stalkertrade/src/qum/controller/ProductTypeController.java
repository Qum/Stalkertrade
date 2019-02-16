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
@WebServlet("/poroductcategory")
public class ProductTypeController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ProductTypeController() {
	super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	String requestedProductType = request.getParameter("type");
	if (requestedProductType != null && requestedProductType != "") {
	    ProductDao pDao = new ProductDao();
	    List<Product> allprod = null;
	    if (requestedProductType.equals("weapon") || requestedProductType.equals("armor")
		    || requestedProductType.equals("other")) {
		allprod = pDao.getProductByType(requestedProductType);
		request.setAttribute("products", allprod);
		request.getRequestDispatcher("products.jsp").forward(request, response);
	    }
	} else {
	    request.getRequestDispatcher("index.jsp").forward(request, response);
	}
    }

}
