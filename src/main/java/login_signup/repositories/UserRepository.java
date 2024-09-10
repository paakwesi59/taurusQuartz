package login_signup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import login_signup.model.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

