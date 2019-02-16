package qum.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qum.DAO.ProductDao;
import qum.model.Product;

@WebServlet("/addproduct.make")
public class ProductCreateController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ProductCreateController() {
	super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	Product newProduct = new Product();
	ProductDao pDao = new ProductDao();

	newProduct.setProd_name(request.getParameter("newname"));
	newProduct.setCost(Integer.parseInt(request.getParameter("newcost")));
	newProduct.setDesc(request.getParameter("newdesc"));
	newProduct.setCount(Integer.parseInt(request.getParameter("newcount")));
	newProduct.setType(request.getParameter("newtype"));
	pDao.addProduct(newProduct);
	response.sendRedirect("poroductcategory?type=armor");
	//request.getRequestDispatcher("poroductcategory?type=armor").forward(request, response);

    }
}
