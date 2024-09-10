package login_signup.order;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import login_signup.model.User;

import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order", cascade = CascadeType.ALL)
   
    
    @ManyToOne
    private User user;
    
    private String customerName;
    private String phoneNumber;
    private String email;
    private boolean rice;
    private boolean sugar;
    private boolean oil;
    private boolean cashew;
    private boolean corn;
    private boolean shea;
    private boolean wheat;
    private boolean soya;
    private boolean haulage;
    private boolean evacuation;
    private boolean household;
    private int quantity;
    private double weight;
    private String destinationAddress;
    private String originAddress;
    private String type;
    private String deliveryDate;
    private boolean epaApproved;
    private boolean fragile; 
    private boolean hazardous;
    private String description;
    private String status;
    
    
    public Order() {
      
    }
    
    public Order(User user, String customerName, String phoneNumber, String email, boolean rice, boolean sugar,
                 boolean oil, boolean cashew, boolean corn, boolean shea, boolean wheat, boolean soya,
                 boolean haulage, boolean evacuation, boolean household, int quantity, double weight,
                 String destinationAddress,String type, String deliveryDate, boolean epaApproved,
                 boolean hazardous, String description, String status, boolean fragile, String originAddress) {
        this.user = user;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.rice = rice;
        this.sugar = sugar;
        this.oil = oil;
        this.cashew = cashew;
        this.corn = corn;
        this.shea = shea;
        this.wheat = wheat;
        this.soya = soya;
        this.haulage = haulage;
        this.evacuation = evacuation;
        this.household = household;
        this.quantity = quantity;
        this.weight = weight;
        this.originAddress = originAddress;
        this.destinationAddress = destinationAddress;
        this.type = type;
        this.deliveryDate = deliveryDate;
        this.epaApproved = epaApproved;
        this.fragile = fragile;
        this.hazardous = hazardous;
        this.description = description;
        this.status = status;
    }

  
    
    public Long getId() {
        return orderId;
    }

    public void setId(Long id) {
        this.orderId = id;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isRice() {
        return rice;
    }

    public void setRice(boolean rice) {
        this.rice = rice;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean isOil() {
        return oil;
    }

    public void setOil(boolean oil) {
        this.oil = oil;
    }

    public boolean isCashew() {
        return cashew;
    }

    public void setCashew(boolean cashew) {
        this.cashew = cashew;
    }

    public boolean isCorn() {
        return corn;
    }

    public void setCorn(boolean corn) {
        this.corn = corn;
    }

    public boolean isShea() {
        return shea;
    }

    public void setShea(boolean shea) {
        this.shea = shea;
    }

    public boolean isWheat() {
        return wheat;
    }

    public void setWheat(boolean wheat) {
        this.wheat = wheat;
    }

    public boolean isSoya() {
        return soya;
    }

    public void setSoya(boolean soya) {
        this.soya = soya;
    }

    public boolean isHaulage() {
        return haulage;
    }

    public void setHaulage(boolean haulage) {
        this.haulage = haulage;
    }

    public boolean isEvacuation() {
        return evacuation;
    }

    public void setEvacuation(boolean evacuation) {
        this.evacuation = evacuation;
    }

    public boolean isHousehold() {
        return household;
    }

    public void setHousehold(boolean household) {
        this.household = household;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void setOriginAddress(String originAddress) {
		this.originAddress = originAddress;
	}

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public boolean isEpaApproved() {
        return epaApproved;
    }

    public void setEpaApproved(boolean epaApproved) {
        this.epaApproved = epaApproved;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public boolean isHazardous() {
        return hazardous;
    }

    public void setHazardous(boolean hazardous) {
        this.hazardous = hazardous;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	public String getOriginAddress() {
		return originAddress;
	}
}
