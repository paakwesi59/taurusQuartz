/*package login_signup.model;

import jakarta.persistence.*;
import jdk.dynalink.linker.LinkerServices;
import login_signup.order.Order;

import java.util.ArrayList;
import java.util.List;

@Entity
public class BatchOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToMany(mappedBy = "batchOrder", cascade = CascadeType.ALL);
    private List<Order> orders = new ArrayList<>();

    private String longitude;
    private String lattitude;

    private String truckId;
    public BatchOrder() {
    }

    public BatchOrder(List<Order> orders, String longitude, String lattitude, String truckId) {
        this.orders = orders;
        this.longitude = longitude;
        this.lattitude = lattitude;
        this.truckId = truckId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }
}*/
