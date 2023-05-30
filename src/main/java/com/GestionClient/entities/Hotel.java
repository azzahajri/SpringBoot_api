package com.GestionClient.entities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name = "hotel")
public class Hotel implements Serializable{
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY)
private Long id;
private String hotelName;
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
@JsonBackReference
@OneToMany(mappedBy="hotel")
Collection<Client> clients=new ArrayList<>();
public String getHotelName() {
return hotelName;
}
public void setHotelName(String hotelName) {
this.hotelName = hotelName;
}
public Collection<Client> getClients() {
return clients;
}
public void setClients(Collection<Client> clients) {
this.clients = clients;
}
}