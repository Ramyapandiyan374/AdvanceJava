package onetomany;
import jakarta.persistence.*;
import java.util.*;
@Entity
public class Bus {
@Id
private String busNo;
private String bname;
private int noOfSeats;
private String type;
private double price;
@OneToMany(cascade =CascadeType.ALL)
private List<Passenger>passenger;

public void addPassenger(Passenger p) {
	passenger.add(p);
}

public String getBusNo() {
	return busNo;
}
public void setBusNo(String busNo) {
	this.busNo = busNo;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public int getNoOfSeats() {
	return noOfSeats;
}
public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public List<Passenger> getPassenger() {
	return passenger;
}
public void setPassenger(List<Passenger> passenger) {
	this.passenger = passenger;
}

@Override
public String toString() {
	return "Bus [busNo=" + busNo + ", bname=" + bname + ", noOfSeats=" + noOfSeats + ", type=" + type + ", price="
			+ price + ", passenger=" + passenger + "]";
}

}
