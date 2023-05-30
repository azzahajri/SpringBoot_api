package com.GestionClient.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Client")
public class Client implements Serializable{
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY)
private Long id;
private String ClientFirstName;
private String ClientLastName;
private String ClientPhone;
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public String getClientFirstName() {
return ClientFirstName;
}
public void setClientFirstName(String ClientFirstName) {
this.ClientFirstName = ClientFirstName;
}
public String getClientLastName() {
return ClientLastName;
}
public void setClientLastName(String ClientLastName) {
this.ClientLastName = ClientLastName;
}
public String getClientPhone() {
return ClientPhone;
}
public void setClientPhone(String ClientPhone) {
this.ClientPhone =ClientPhone;
}
public Hotel getHotel() {
return hotel;
}
public void setHotel(Hotel hotel) {
this.hotel = hotel;
}
@ManyToOne
Hotel hotel;
}