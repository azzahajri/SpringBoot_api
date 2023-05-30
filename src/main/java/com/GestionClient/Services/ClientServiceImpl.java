package com.GestionClient.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionClient.Repositories.ClientRepository;
import com.GestionClient.entities.Client;
@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	ClientRepository clientRepository;
	@Override
	public void createClient(Client e) {
	this.clientRepository.save(e);
		
	}

	@Override
	public List<Client> getClient() {
		return this.clientRepository.findAll();
	}

	@Override
	public Client getOneClient(long id) {
		return this.clientRepository.findById(id).get();
	}
	@Override
	public void deleteClient(long id) {
	    this.clientRepository.deleteById(id);
	}
	@Override
    public void updateClient(long id, Client e) {
        Client existingClient = this.clientRepository.findById(id).get();
        existingClient.setClientFirstName(e.getClientFirstName());
        existingClient.setClientLastName(e.getClientLastName());
        existingClient.setClientPhone(e.getClientPhone());
        existingClient.setHotel(e.getHotel());

        this.clientRepository.save(existingClient);
    }   
	
}