package qum.commonClasses;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import qum.DAO.UserDAO;
import qum.model.User;

public class Validator {


	    private UserDAO dao;

	    public Validator() {
		dao = new UserDAO();
	    }
	    
	    public List validate(User user){
		List<String> errors = new LinkedList<>();
		validateName(user.getName(),errors);
		validateEmail(user.getEmail(), errors);
		validatePassword(user.getPassword(), errors);
		return errors;
	    }

	    public void validateName(String name, List<String> errors) {
		if (name == null || "".equals(name) || name.length() > 40) {
		    if (dao.getUserByName(name) != null)
			errors.add("Это имя пользователя уже занято");
		}
	    }

	    public void validateEmail(String email, List<String> errors) {
		String emailRegex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

		if (!email.matches(emailRegex)) {
		    errors.add("Введите действующую почту");
		} else if (dao.getUserByEmail(email) != null) {
		    errors.add("Эта почта уже занята");
		}
	    }

	    public void validatePassword(String password, List<String> errors) {
		if (password == null || password.length() < 8 || password.length() > 40) {
		    errors.add("Неверная длинна пароля");
		}
	    }
	
}
