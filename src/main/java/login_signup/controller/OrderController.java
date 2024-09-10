package login_signup.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import login_signup.dto.OrderDTO;
import login_signup.order.Order;
import login_signup.service.CustomUserDetail;
import login_signup.service.OrderService;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Display the order form
    @GetMapping("/order")
    public String orderForm(Model model) {
        model.addAttribute("order", new Order());
        return "order"; // Thymeleaf template for order form
    }

    // Submit a single order
    @PostMapping("/submitOrder")
    public String submitOrder(@ModelAttribute("order") Order order, Model model) {
        // Get the current authenticated user
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetail currentUser = (CustomUserDetail) authentication.getPrincipal();

        // Set the user for the order
        order.setUser(currentUser.getUser());

        // Submit the order
        orderService.submitOrder(order);

        model.addAttribute("message", "Your order has been placed successfully!");
        return "confirmation"; // Thymeleaf template for confirmation message
    }

    // Display all orders
    @GetMapping("/allOrders")
    public String allOrders(Model model) {
        List<OrderDTO> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        return "all_orders"; // Thymeleaf template for displaying all orders
    }

    // Add orders to batch
    @PostMapping("/addToBatch")
    public String addToBatch(@ModelAttribute("selectedOrders") List<Long> orderIds, Model model) {
        if (orderIds != null && !orderIds.isEmpty()) {
            List<OrderDTO> selectedOrders = orderService.getOrdersByIds(orderIds);
            model.addAttribute("selectedOrders", selectedOrders);
        }
        return "batch_form"; // Thymeleaf template for batch form
    }

    // Assign trucks to the batch
    @PostMapping("/assignTruck")
    public String assignTruck(@ModelAttribute("selectedOrders") List<OrderDTO> selectedOrders, String truckId, Model model) {
        for (OrderDTO order : selectedOrders) {
            order.setTruckId(truckId);
        }
        model.addAttribute("selectedOrders", selectedOrders);
        return "batch_form"; // Thymeleaf template for batch form
    }

    // Generate batch
    @PostMapping("/generateBatch")
    public String generateBatch(@ModelAttribute("selectedOrders") List<OrderDTO> selectedOrders, Model model) {
        String batchId = orderService.generateBatch(selectedOrders);
        model.addAttribute("message", "Batch generated successfully! Batch ID: " + batchId);
        return "confirmation"; // Thymeleaf template for confirmation message
    }
}
