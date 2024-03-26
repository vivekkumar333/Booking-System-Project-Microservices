package bookingsystem.user.service.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
//	@Autowired
//	UserService userService;
	
	@GetMapping("/")
	public String creatUser() {
		System.out.println("User Microservice---------");
		return "User Microservice";
	}
	
//	@PostMapping("/user")
//	public ResponseEntity<UserView> creatUser(@RequestBody UserRegistrationDTO userRegistrationDTO) {
//		System.out.println(" User : "+userRegistrationDTO);
//		UserView userView = userService.save(userRegistrationDTO);
//	
//		URI location= ServletUriComponentsBuilder
//				.fromCurrentRequestUri()
//				.path("/{id}")
//				.buildAndExpand(userView.getId())
//				.toUri();
//		
//		return ResponseEntity.created(location).build();
//	}
	
//	@PutMapping("/user/{id}")
//	public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
//		
//		User updatedUser = userService.save(user);
//		URI location = ServletUriComponentsBuilder
//				.fromCurrentRequestUri()
//				.buildAndExpand(updatedUser.getId())
//				.toUri();
//		return ResponseEntity.created(location).build();
//		
//	}
	

//	@GetMapping("/users")
//	public List<UserView> getUsers(){
//		return userService.getAllUser();
//	}
//	
//	
//	@GetMapping("/user/{id}")
//	public User getUser(@PathVariable("id") Long id) {
//		
//		return userService.getUserById(id);
//	}
//	
//	@GetMapping("/user/{email}/{password}")
//	public UserView userLogin(@PathVariable("email") String email, @PathVariable("password") String password) {
//		
//		return userService.userAuthentication(email, password);
//	}
//	
//	@DeleteMapping("/user/{id}")
//	public void deleteUser(@PathVariable Long id) {
//		userService.deleteUserById(id);
//	}
}
