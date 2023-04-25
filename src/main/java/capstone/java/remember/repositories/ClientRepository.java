package capstone.java.remember.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import capstone.java.remember.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
    
}
