package co.grandcircus.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeController {
	
	@Autowired
	private ItemsDao3 ItemsDao3;
	
	@Autowired
	private UserDao3 UserDao3;

	@RequestMapping("/")
	public ModelAndView showHomePage() {
		ModelAndView mav = new ModelAndView("index"); //corresponds to index.jsp
		List<Items> item = ItemsDao3.findAll();
		return new ModelAndView("index", "items", item);
	}

	@RequestMapping("/Register")
	public ModelAndView showRegistrationForm() {
		ModelAndView mav = new ModelAndView("Register");
		return mav;
	}

	@RequestMapping("/AddUser")
	public ModelAndView showWelcomeCustomer (
			@RequestParam(value="firstName", required=false) String firstName, 
			@RequestParam(value="lastName", required=false) String lastName,
			@RequestParam(value="emailAddress", required=false) String emailAddress,
			@RequestParam(value="optinStatus", required=false) boolean optinStatus,
			@RequestParam(value="phoneNumber", required=false) String phoneNumber,
			@RequestParam(value="caffeine", required=false) boolean caffeine,
			@RequestParam(value="race", required=false) String race,
			@RequestParam(value="password", required=false) String password,
			@RequestParam(value="passwordMatch", required=false) String passwordMatch) {
	
		
			User user = new User();
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setEmailAddress(emailAddress);
			user.setOptinStatus(optinStatus);
			user.setPhoneNumber(phoneNumber);
			user.setCaffeine(caffeine);
			user.setRace(race);
			user.setPassword(password);
			user.setPasswordMatch(passwordMatch);
			
			UserDao3.create(user);
			
			ModelAndView mav = new ModelAndView("AddUser");
			mav.addObject("user", user);
			return mav;
			
			//if (password != passwordMatch) {
			
			//} else {//}
	}

}