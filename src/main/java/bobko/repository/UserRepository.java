package main.java.bobko.repository;

import main.java.bobko.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Bobko Vladimir
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
