package com.GestionClient.Repositories;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.GestionClient.entities.Client;
@Transactional
public interface ClientRepository extends JpaRepository<Client, Long> {
}