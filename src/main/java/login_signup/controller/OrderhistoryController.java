package login_signup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderhistoryController {

    @GetMapping("/orderhistory")
    public String getOrderHistory() {
        return "orderhistory"; 
}
}