package co.grandcircus.coffeeshop;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class PasswordValidator implements Validator {

	
	@Override
    public boolean supports(Class user) {
        return User.class.equals(user);
    }

    @Override
    public void validate(Object target, Errors errors) {

        User user = (User) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "field.required", "Email Address is a required field.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "field.required", "Password is a required field.");

        if(!user.getPassword().equals(user.getPasswordMatch())){
            errors.reject("", "Passwords must match");
        }
    }
}  
