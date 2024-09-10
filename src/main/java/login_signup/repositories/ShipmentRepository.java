package login_signup.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import login_signup.model.Shipment;

@Repository
	public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
	    Shipment findByBatchId(String batchId);
	    List<Shipment> findByStatus(String status);
	    List<Shipment> findByLocation(String location);
	}

