
package login_signup.service;
import org.springframework.stereotype.Service;

import login_signup.dto.OrderDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class BatchOrderService {

    private List<OrderDTO> batchOrders = new ArrayList<>();

    public OrderDTO addToBatch(String orderId, String truckId) {
        // Here you can add the order to the batch and assign the truckId
        OrderDTO order = new OrderDTO(orderId, "Delivery Date", "Origin Address", "Destination Address", truckId);
        batchOrders.add(order);
        return order;
    }

    public String generateBatch() {
        // Here you can generate the batch and return the batch ID
        String batchId = "Batch_" + Math.floor(Math.random() * 1000);
        return "Batch Generated: " + batchId;
    }

    public List<OrderDTO> getBatchOrders() {
        // Here you can return the list of batch orders
        return batchOrders;
    }
}

/*
import login_signup.model.BatchOrder;
import login_signup.order.Order;
import login_signup.repositories.BatchOrderRepo;
import login_signup.repositories.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BatchOrderService {
    private final BatchOrderRepo batchOrderRepo;
    private final OrderRepository orderRepository;

    public BatchOrderService(BatchOrderRepo batchOrderRepo, OrderRepository orderRepository) {
        this.batchOrderRepo = batchOrderRepo;
        this.orderRepository = orderRepository;
    }
    
    public BatchOrder createBatchOrder(BatchOrder batchOrderRequest){
        BatchOrder batchOrder = new BatchOrder();
        batchOrder.setTruckId(batchOrderRequest.getTruckId());

        for (Order order : batchOrderRequest.getOrders()) {
            order.setBatchOrder(batchOrder);
            orderRepository.save(order);
        }


        return batchOrderRepo.save(batchOrder);

    }

    // Function to update latitude and longitude of a batch order
    public BatchOrder updateBatchOrderLocation(Long batchOrderId, String lattitude, String longitude) {
        BatchOrder batchOrder = batchOrderRepo.findById(batchOrderId).orElse(null);
        if (batchOrder != null) {
            batchOrder.setLattitude(lattitude);
            batchOrder.setLongitude(longitude);
            return batchOrderRepo.save(batchOrder);
        }
        return null; // or throw an exception indicating batch order not found
    }

    // Function to view all batch orders
    public List<BatchOrder> getAllBatchOrders() {
        return batchOrderRepo.findAll();
    }

    // Function to change truck driver of a batch order
    public BatchOrder changeTruckDriver(Long batchOrderId, String newDriverName) {
        BatchOrder batchOrder = batchOrderRepo.findById(batchOrderId).orElse(null);
        if (batchOrder != null) {
            batchOrder.setTruckId(newDriverName);
            return batchOrderRepo.save(batchOrder);
        }
        return null; // or throw an exception indicating batch order not found
    }

    // Function to delete a batch order
    public void deleteBatchOrder(Long batchOrderId) {
        batchOrderRepo.deleteById(batchOrderId);
    }

}*/
