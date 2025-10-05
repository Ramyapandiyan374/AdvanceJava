package edu.jsp.Product;
import jakarta.persistence.*;
@Entity
public class Product {
@Id
int pid;
String pname;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}

}
