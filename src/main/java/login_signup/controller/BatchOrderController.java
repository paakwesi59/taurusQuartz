package login_signup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import login_signup.dto.OrderDTO;
import login_signup.service.BatchOrderService;
import java.util.List;

@RestController
@RequestMapping("/batchOrder")
public class BatchOrderController {

    @Autowired
    private BatchOrderService batchOrderService;

    @PostMapping("/addToBatch")
    public OrderDTO addToBatch(@RequestParam("orderId") String orderId, @RequestParam("truckId") String truckId) {
        return batchOrderService.addToBatch(orderId, truckId);
    }

    @PostMapping("/generateBatch")
    public String generateBatch() {
        return batchOrderService.generateBatch();
    }

    @GetMapping("/BatchOrder")
    public String getBatchOrders() {
        return "BatchOrder";
    }
}
