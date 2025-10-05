package onetomanybi;
import jakarta.persistence.*;
import java.util.*;
@Entity
public class Batch {
@Id
private String bcode;
private String subject;
private String trainer;
private String timing;
private int noOfStudents;

@OneToMany(cascade =CascadeType.ALL)
private List<Student>students;


public void addStudent(Student s) {
	students.add(s);
	s.setBatch(this);
}
public void removeStudent(Student s) {
	students.remove(s);
	s.setBatch(null);
}
public String getBcode() {
	return bcode;
}
public void setBcode(String bcode) {
	this.bcode = bcode;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getTrainer() {
	return trainer;
}
public void setTrainer(String trainer) {
	this.trainer = trainer;
}
public String getTiming() {
	return timing;
}
public void setTiming(String timing) {
	this.timing = timing;
}
public int getNoOfStudents() {
	return noOfStudents;
}
public void setNoOfStudents(int noOfStudents) {
	this.noOfStudents = noOfStudents;
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}
@Override
public String toString() {
	return "Batch [bcode=" + bcode + ", subject=" + subject + ", trainer=" + trainer + ", timing=" + timing
			+ ", noOfStudents=" + noOfStudents + "]";
}

}
