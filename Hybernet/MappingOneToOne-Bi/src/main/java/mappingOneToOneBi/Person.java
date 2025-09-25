package mappingOneToOneBi;
import jakarta.persistence.*;
@Entity
public class Person {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String gender;
private String email;
private long pno;
@OneToOne
private AdharCard adharcard;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPno() {
	return pno;
}
public void setPno(long pno) {
	this.pno = pno;
}
public AdharCard getAdharcard() {
	return adharcard;
}
public void setAdharcard(AdharCard adharcard) {
	this.adharcard = adharcard;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", pno=" + pno + "]";
}



}
