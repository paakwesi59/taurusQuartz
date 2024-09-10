package login_signup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import login_signup.service.OrderService;

@Controller
public class UploadBillController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/submitBill")
    public String submitBill(@RequestParam("orderId") Long orderId, @RequestParam("amount") double amount) {
        orderService.updateOrderStatusAndSaveBill(orderId, amount);
        return "redirect:/staffDashboard";
    }
}
