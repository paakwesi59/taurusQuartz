package login_signup.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import login_signup.order.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByStatus(String status);

}
