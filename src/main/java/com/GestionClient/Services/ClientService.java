package com.GestionClient.Services;

import java.util.List;

import com.GestionClient.entities.Client;

public interface ClientService {
void createClient(Client e);
List<Client> getClient();
Client getOneClient(long id);
void deleteClient(long id);
void updateClient(long id, Client e);

}