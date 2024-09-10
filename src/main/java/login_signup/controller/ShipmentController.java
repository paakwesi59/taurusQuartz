package login_signup.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ShipmentController {
	
	    @GetMapping("/shipment")
	    public String showPage() {
	        return "/shipment"; 
	    }
	}



