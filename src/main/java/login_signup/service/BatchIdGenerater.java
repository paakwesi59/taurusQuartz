package login_signup.service;
import java.util.UUID;
public class BatchIdGenerater {
	

	    public static String generateBatchId() {
	        UUID uuid = UUID.randomUUID();
	        return uuid.toString();
	    }

	    public static void main(String[] args) {
	        String batchId = generateBatchId();
	        System.out.println("Generated Batch ID: " + batchId);
	    }
	}


