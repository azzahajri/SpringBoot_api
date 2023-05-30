package com.GestionClient.Services;

import java.util.List;

import com.GestionClient.entities.Hotel;

public interface HotelService {
void createHotel(Hotel d);
List<Hotel> findHotels();
Hotel findOneHotel(long id);
void updateHotel(Hotel d);
}