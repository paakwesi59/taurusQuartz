package login_signup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LiveTrackingController {

    @GetMapping("/livetracking")
    public String getOrderHistory() {
        return "livetracking"; 
}
}