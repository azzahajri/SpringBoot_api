package com.GestionClient.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.GestionClient.Services.HotelService;
import com.GestionClient.entities.Hotel;
import com.GestionClient.models.HotelModel;
@RestController
@RequestMapping(value="/api")
@CrossOrigin(value="*") 
public class HotelRestController {
@Autowired
HotelService hotelService;
@PostMapping("/hotels")
void createHotel(@RequestBody HotelModel model) {
Hotel hotel = new Hotel();
System.out.println(model.getHotelName());
hotel.setHotelName(model.getHotelName());
this.hotelService.createHotel(hotel);
}
@GetMapping("/dali")
List <Hotel> Hotels(){
	return this.hotelService.findHotels();
}
@GetMapping("/hotels/{id}")
Hotel getOneHotel(@PathVariable long id) {
return this.hotelService.findOneHotel(id)	;
}
@PutMapping("/hotels/{id}")
void updateHotel(@PathVariable long id, @RequestBody HotelModel model) {
    Hotel hotel = this.hotelService.findOneHotel(id);
    hotel.setHotelName(model.getHotelName());
    this.hotelService.updateHotel(hotel);
}
}
