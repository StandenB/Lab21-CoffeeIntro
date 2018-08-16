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
			@RequestParam("firstName") String firstName, 
			@RequestParam("lastName") String lastName,
			@RequestParam("emailAddress") String emailAddress,
			@RequestParam("phoneNumber") String phoneNumber,
			@RequestParam("password") String password) {
		ModelAndView mav = new ModelAndView("AddUser");
		mav.addObject("firstName", firstName);
		//mav.addObject("word2", noun);
		return mav;
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
