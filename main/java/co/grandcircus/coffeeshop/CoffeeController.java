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
	ItemsDao3 ItemsDao3;
	
	@Autowired
	UserDao3 UserDao3;
	
	@Autowired
	UserAdminDao UserAdminDao;
	
	@Autowired
	ItemsAdminDao ItemsAdminDao;
	

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
	@RequestMapping("/AddItemForm")
	public ModelAndView showAddItemForm() {
		ModelAndView mav = new ModelAndView("AddItemForm");
		return mav;
	}
	@RequestMapping("/AddUserForm")
	public ModelAndView showAddUserForm() {
		ModelAndView mav = new ModelAndView("AddUserForm");
		return mav;
	}
	
	@RequestMapping("/AdminUsers")
	public ModelAndView showAdminUsersTable() {
		List<User> user = UserDao3.findAll();
		ModelAndView mav = new ModelAndView("AdminUsers", "users", user);
		return mav;
	}
	@RequestMapping("/AdminItems")
	public ModelAndView showAdminItemsTable() {
		List<Items> item = ItemsDao3.findAll();
		ModelAndView mav = new ModelAndView("AdminItems", "items", item);
		return mav;
	}
	@RequestMapping("/AddItem")
	public ModelAndView showAddItemForm(
			@RequestParam(value="name", required=false) String name,
			@RequestParam(value="price", required=false) Long price,
			@RequestParam(value="quantity", required=false) Integer quantity,
			@RequestParam(value="description", required=false) String description) {
		
		Items item = new Items();
		item.setName(name);
		item.setPrice(price);
		item.setQuantity(quantity);
		item.setDescription(description);
		
		ItemsDao3.create(item);
		
		ModelAndView mav = new ModelAndView("redirect:/AdminItems", "items", item);
		return mav;
	}
	@RequestMapping("/NewUserSubmit")
	public ModelAndView submitNewUser() {
		ModelAndView mav = new ModelAndView("NewUserSubmit");
		return mav;
	}
	@RequestMapping("/ConfirmDeleteItem")
	public ModelAndView showConfirmDeleteItem() {
		ModelAndView mav = new ModelAndView("ConfirmDeleteItem");
		return mav;
	}
	@RequestMapping("/DeleteItem")
	public ModelAndView removeItem(Long id) {
		ItemsDao3.delete(id);
		ModelAndView mav = new ModelAndView("redirect:/AdminItems");
		return mav;
	}
	@RequestMapping("/DeleteUser")
	public ModelAndView removeUser(Long id) {
		UserDao3.delete(id);
		ModelAndView mav = new ModelAndView("redirect:/AdminUsers");
		return mav;
	}
	@RequestMapping("/ConfirmDeleteUser")
	public ModelAndView showConfirmDeleteUser() {
		ModelAndView mav = new ModelAndView("ConfirmDeleteUser");
		return mav;
	}
	
	@RequestMapping("/EditUser")
	public ModelAndView showEditUserForm(
			
			) {
		ModelAndView mav = new ModelAndView("EditUser");
		return mav;
	}
	@RequestMapping("/EditItem")
	public ModelAndView showEditItemForm(
			@RequestParam(value="id", required=false) int id,
			@RequestParam(value="name", required=false) String name,
			@RequestParam(value="price", required=false) long price,
			@RequestParam(value="quantity", required=false) int quantity,
			@RequestParam(value="description", required=false) String description) {
		ModelAndView mav = new ModelAndView("EditItem");
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
	}
	@RequestMapping("/NewUserSubmit")
	public ModelAndView showWelcomeCustomer (
			@RequestParam(value="firstName", required=false) String firstName, 
			@RequestParam(value="lastName", required=false) String lastName,
			@RequestParam(value="emailAddress", required=false) String emailAddress,
			@RequestParam(value="optinStatus", required=false) boolean optinStatus,
			@RequestParam(value="phoneNumber", required=false) String phoneNumber) {
	
			User user = new User();
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setEmailAddress(emailAddress);
			user.setOptinStatus(optinStatus);
			user.setPhoneNumber(phoneNumber);
			
			UserDao3.create(user);
			
			ModelAndView mav = new ModelAndView("redirect:/AdminUsers");
			mav.addObject("user", user);
			return mav;
	}
}