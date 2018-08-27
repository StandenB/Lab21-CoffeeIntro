package co.grandcircus.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
			@RequestParam(value="price", required=false) Float price,
			@RequestParam(value="quantity", required=false) Long quantity,
			@RequestParam(value="description", required=false) String description) {
		
		Items item = new Items();
		item.setName(name);
		item.setDescription(description);
		item.setQuantity(quantity);
		item.setPrice(price);
		
		ItemsDao3.create(item);
		
		ModelAndView mav = new ModelAndView("redirect:/AdminItems", "items", item);
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
	@RequestMapping("/EditUser")
	public ModelAndView showEditUserForm(Long id) {
		User user = UserDao3.findbyId(id);
		ModelAndView mav = new ModelAndView("/EditUser");
		mav.addObject("user", user);
		return mav;
	}
	
	@RequestMapping("/SubmitUserChanges")
	public ModelAndView submitUserChanges (Long id,
			@RequestParam(value="firstName", required=false) String firstName, 
			@RequestParam(value="lastName", required=false) String lastName,
			@RequestParam(value="emailAddress", required=false) String emailAddress,
			@RequestParam(value="phoneNumber", required=false) String phoneNumber) {
		User user = new User();
		UserDao3.update(user);
		ModelAndView mav = new ModelAndView("redirect:/AdminUsers");
		return mav;
	}
//	@RequestMapping("/items/{id}/delete")
//	public ModelAndView delete(@PathVariable("id") int id) {
//		itemsDaoJPA.deleteById(id);
	
	@RequestMapping("/EditItem")
	public ModelAndView showEditItemForm(@PathVariable("id") Long id) {
		Items item = ItemsDao3.findbyId(id);
		ModelAndView mav = new ModelAndView("/EditItem");
		mav.addObject("item", item);
		return mav;
	}

	@RequestMapping("/SubmitItemChanges")
	public ModelAndView submitItemChanges(Long id, 
			@RequestParam(value="name", required=false) String name,
			@RequestParam(value="price", required=false) Float price,
			@RequestParam(value="quantity", required=false) Long quantity,
			@RequestParam(value="description", required=false) String description) {
		Items item = new Items();
		ItemsDao3.update(item);
		ModelAndView mav = new ModelAndView("redirect:/AdminItems");
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
	public ModelAndView submitNewCustomer (
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