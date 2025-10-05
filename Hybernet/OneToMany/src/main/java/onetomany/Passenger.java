package onetomany;
import jakarta.persistence.*;
@Entity
public class Passenger {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String gender;
private long phoneno;
private int age;
private String boarding;
private String destination;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getBoarding() {
	return boarding;
}
public void setBoarding(String boarding) {
	this.boarding = boarding;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
@Override
public String toString() {
	return "Passenger [id=" + id + ", name=" + name + ", gender=" + gender + ", phoneno=" + phoneno + ", age=" + age
			+ ", boarding=" + boarding + ", destination=" + destination + "]";
}

}
