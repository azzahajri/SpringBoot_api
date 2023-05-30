package com.GestionClient.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestionClient.Services.HotelService;
import com.GestionClient.Services.ClientService;
import com.GestionClient.entities.Client;
import com.GestionClient.models.ClientModel;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(value="*")
public class ClientRestController {
@Autowired
ClientService clientService;
@Autowired
HotelService hotelService;
@PostMapping("/clients")
void createClient(@RequestBody ClientModel e) {
	Client client=new Client();
    client.setClientFirstName("test");
    client.setClientLastName("test1");
    client.setClientFirstName(e.getClientFirstName());
    client.setClientLastName(e.getClientLastName());
    System.out.println("tes+"+e.getClientFirstName());
    System.out.println("tess+"+e.getClientLastName());


   // client.setClientFirstName(e.getClientFirstName());
    client.setClientPhone(e.getClientPhone());
    client.setHotel(this.hotelService.findOneHotel(e.getHotelId()));
	
	this.clientService.createClient(client);
	
	
}
@GetMapping("/clients")
List<Client> findAllClients(){
return this.clientService.getClient();
}
@GetMapping("/clients/{id}")
Client getOneClient(@PathVariable long id) {
	return this.clientService.getOneClient(id);
}
@DeleteMapping("/clients/{id}")
void deleteClient(@PathVariable long id) {
    this.clientService.deleteClient(id);
}
@PutMapping("/clients/{id}")
void updateClient(@PathVariable long id, @RequestBody ClientModel e) {
    Client client = this.clientService.getOneClient(id);
    client.setClientLastName(e.getClientLastName());
    client.setClientFirstName(e.getClientFirstName());
    client.setClientPhone(e.getClientPhone());
    client.setHotel(this.hotelService.findOneHotel(e.getHotelId()));

    this.clientService.updateClient(id, client);
}
}

