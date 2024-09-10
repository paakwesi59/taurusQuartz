package login_signup.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class Shipment {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    public Long getId() {
			return id;
		}
	    
	    private String batchId;
	    private String status;
	    private String location;
	    
		public void setId(Long id) {
			this.id = id;
		}
		public String getBatchId() {
			return batchId;
		}
		public void setBatchId(String batchId) {
			this.batchId = batchId;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		
	    

	    
	}


