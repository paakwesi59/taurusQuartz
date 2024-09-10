package login_signup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import login_signup.model.Shipment;
import login_signup.repositories.ShipmentRepository;

@Service
	public class ShipmentService {
	    private final ShipmentRepository shipmentRepository;

	    @Autowired
	    public ShipmentService(ShipmentRepository shipmentRepository) {
	        this.shipmentRepository = shipmentRepository;
	    }

	    public Shipment getShipmentByBatchId(String batchId) {
	        return shipmentRepository.findByBatchId(batchId);
	    }
	    public Shipment saveShipment(Shipment shipment) {
	        // Add validation or business logic if needed
	        return shipmentRepository.save(shipment);
	    }
	    
	    public void deleteShipment(Long shipmentId) {
	        shipmentRepository.deleteById(shipmentId);
	    }
	}

