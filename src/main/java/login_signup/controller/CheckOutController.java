package login_signup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CheckOutController {

    @GetMapping("/checkout")
    public String getOrderHistory() {
        return "checkout"; 
}
}