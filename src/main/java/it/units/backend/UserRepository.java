package it.units.backend;

import it.units.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByNameIsStartingWithIgnoreCase(String name);

    @Override
    List<User> findAll();
}
