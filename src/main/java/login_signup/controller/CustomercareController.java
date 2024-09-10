package login_signup.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class CustomercareController {
	
	    @GetMapping("/customercare")
	    public String showCustomerCarePage() {
	        return "customercare"; 
	    }
	}



