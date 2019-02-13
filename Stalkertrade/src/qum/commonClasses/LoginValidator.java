package qum.commonClasses;

import java.util.LinkedList;
import java.util.List;

import qum.model.User;

public class LoginValidator extends Validator {

    public List<String> validate(User user) {
	List<String> errors = new LinkedList<>();
	validateName(user.getName(), errors);
	validatePassword(user.getPassword(), errors);
	return errors;
    }
    
    protected void validateName(String name, List<String> errors) {
	if (name == null || "".equals(name) || name.length() > 40) {
	    errors.add("Пустое,или слишком длинное имя пользователя");
	} 
    }
}