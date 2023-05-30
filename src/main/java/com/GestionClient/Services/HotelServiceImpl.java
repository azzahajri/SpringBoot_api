package com.GestionClient.Services;

import java.util.List;

import com.GestionClient.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionClient.Repositories.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	HotelRepository hotelRepository;
	@Override
	public void createHotel(Hotel d) {
		this.hotelRepository.save(d);
		
	}

	@Override
	public List<Hotel> findHotels() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel findOneHotel(long id) {
		return this.hotelRepository.findById(id).get();
	}
    @Override
    public void updateHotel(Hotel d) {
        this.hotelRepository.save(d);
    }

}