package manytoone;
import jakarta.persistence.*;
@Entity
public class Player {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private  int pid;
private String name;
private int jno;
private int age;
private String role;
private double sal;
@ManyToOne
private Team team;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getJno() {
	return jno;
}
public void setJno(int jno) {
	this.jno = jno;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public Team getTeam() {
	return team;
}
public void setTeam(Team team) {
	this.team = team;
}

}
