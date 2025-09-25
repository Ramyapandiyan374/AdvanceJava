package Mappingonetoone;
import jakarta.persistence.*;
@Entity
public class Student {
@Id
private int id;
private String sname;
private int age;
@OneToOne
private PassPort passport;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public PassPort getpassport() {
	return passport;
}
public void setpassport(PassPort passport) {
	this.passport = passport;
}
@Override
public String toString() {
	return "Student [id=" + id + ", sname=" + sname + ", age=" + age + ", passport=" + passport +  "]";
}

}
