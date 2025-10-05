package onetomanybi;
import jakarta.persistence.*;
@Entity
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String gender;
private String email;
private long phno;
@ManyToOne

private Batch batch;
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
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public Batch getBatch() {
	return batch;
}
public void setBatch(Batch batch) {
	this.batch = batch;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", phno=" + phno+ "]";
}

}
