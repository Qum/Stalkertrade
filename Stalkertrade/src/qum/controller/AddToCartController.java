package qum.controller;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qum.DAO.ProductDao;
import qum.model.Product;

@WebServlet("/addprodtocart")
public class AddToCartController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AddToCartController() {
	super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	Integer prodid = 0;
	Product selectedProduct = null;
	LinkedHashMap<Integer, Integer> cart = new LinkedHashMap<>();
	ProductDao pDao = new ProductDao();
	String prod = request.getParameter("prodid");
	if (prod != null && prod != "") {
	    try {
		prodid = Integer.parseInt(prod);
		selectedProduct = pDao.getProductById(prodid);
	    } catch (RuntimeException ex) {
		request.getRequestDispatcher("index.jsp").forward(request, response);
	    } 

	    if (request.getSession().getAttribute("cart") == null)
		request.getSession().setAttribute("cart", cart);
	}
	cart = (LinkedHashMap<Integer, Integer>) request.getSession().getAttribute("cart");
	if (cart.get(prodid) != null) {
	    cart.put(prodid, (cart.get(prodid) + 1));
	} else {
	    cart.put(prodid, 1);
	}
	request.getRequestDispatcher("poroductcategory?type=" + selectedProduct.getType()).forward(
		request, response);
    }
}