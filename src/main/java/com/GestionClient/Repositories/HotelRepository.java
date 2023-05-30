package com.GestionClient.Repositories;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.GestionClient.entities.Hotel;
@Transactional
public interface HotelRepository extends JpaRepository<Hotel, Long>{
}