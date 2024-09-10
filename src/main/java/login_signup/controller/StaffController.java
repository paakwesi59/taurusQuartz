package login_signup.controller;

import java.util.ArrayList;
import java.util.List;
import login_signup.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import login_signup.dto.OrderDTO;
import login_signup.repositories.OrderRepository;

@Controller
public class StaffController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/uploadbill")
    public String displayPendingOrders(Model model) {
        List<Order> pendingOrders = orderRepository.findByStatus("Pending");

        List<OrderDTO> orderDTOs = new ArrayList<>();

        for (Order order : pendingOrders) {
            if (order != null && order.getUser() != null && order.getId() != null) {
                OrderDTO orderDTO = new OrderDTO();
                orderDTO.setOrderId(order.getId());
                orderDTO.setUserId(order.getUser().getId());
                orderDTO.setCustomerName(order.getCustomerName());
                orderDTO.setPhoneNumber(order.getPhoneNumber());
                orderDTO.setEmail(order.getEmail());
                orderDTO.setRice(order.isRice());
                orderDTO.setSugar(order.isSugar());
                orderDTO.setOil(order.isOil());
                orderDTO.setCashew(order.isCashew());
                orderDTO.setCorn(order.isCorn());
                orderDTO.setShea(order.isShea());
                orderDTO.setWheat(order.isWheat());
                orderDTO.setSoya(order.isSoya());
                orderDTO.setHaulage(order.isHaulage());
                orderDTO.setEvacuation(order.isEvacuation());
                orderDTO.setHousehold(order.isHousehold());
                orderDTO.setQuantity(order.getQuantity());
                orderDTO.setWeight(order.getWeight());
                orderDTO.setDestinationAddress(order.getDestinationAddress());
                orderDTO.setOriginAddress(order.getOriginAddress());
                orderDTO.setType(order.getType());
                orderDTO.setDeliveryDate(order.getDeliveryDate());
                orderDTO.setEpaApproved(order.isEpaApproved());
                orderDTO.setFragile(order.isFragile());
                orderDTO.setHazardous(order.isHazardous());
                orderDTO.setDescription(order.getDescription());
                orderDTO.setStatus(order.getStatus());

                orderDTOs.add(orderDTO);
            }
        }

        model.addAttribute("orders", orderDTOs);
        return "uploadbill";
    }

    @RequestMapping(value = "/redirect-to-staff", method = {RequestMethod.GET, RequestMethod.POST})
    public String redirectToStaff() {
        return "redirect:/staff"; // Redirect to the /staff endpoint
    }
}
