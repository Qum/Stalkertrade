package qum.commonClasses;

import qum.DAO.ProductDao;
import qum.DAO.UserDAO;
import qum.model.Product;
import qum.model.User;

//public class TestDAO {
public class DAOTests {

    public static void main(String[] args) throws InterruptedException {
	testProdDAO();
	// testUserDAO();
    }

    private static void testProdDAO() {
	ProductDao PDAO = new ProductDao();
	Product prod = new Product();
	prod.setProd_name("test_product");
	prod.setCost(500);
	prod.setDesc("dcxcv");
	PDAO.addProduct(prod);
    }

    private static void testUserDAO() {
	UserDAO UD = new UserDAO();
	User testUs = new User();
	testUs.setName("Dondo");
	UD.addUser(testUs);
    }
}
