package co.grandcircus.coffeeshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeController {

	@RequestMapping("/")
	public ModelAndView showHomePage() {
		ModelAndView mav = new ModelAndView("index"); //corresponds to index.jsp
//		mav.addObject("name", "Standen");
//		mav.addObject("date", "Wednesday");
		return mav;
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
			
			ModelAndView mav = new ModelAndView("AddUser");
			mav.addObject("user", user);
			return mav;
			
			//if (password != passwordMatch) {
			
			//} else {//}
	}

}
//@RequestMapping("/madlib-story")
//public ModelAndView showMadlibStory(
//		@RequestParam("noun") String noun,
//		@RequestParam("adj") String adj) {
//	
//	// `story` matches the name of the JSP file
//	ModelAndView mav = new ModelAndView("story");
//	// `word1` matches `${ word1 } in the JSP
//	mav.addObject("word1", adj);
//	mav.addObject("word2", noun);
//	return mav;
//}
