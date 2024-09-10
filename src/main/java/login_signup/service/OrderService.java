package login_signup.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import login_signup.order.Order;
import login_signup.repositories.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void submitOrder(Order order) {
        order.setStatus("Pending");
        orderRepository.save(order);
    }

    public void updateOrderStatusAndSaveBill(Long orderId, double amount) {
        Optional<Order> optionalOrder = orderRepository.findById(orderId);
        if (optionalOrder.isPresent()) {
            Order order = optionalOrder.get();
            order.setStatus("Completed");
            order.setBillAmount(amount);
            orderRepository.save(order);
            sendBillToClient(order);
        }
    }

    private void sendBillToClient(Order order) {
    	
    }

    public List<Order> getPendingOrders() {
        return orderRepository.findByStatus("Pending");
    }

}
