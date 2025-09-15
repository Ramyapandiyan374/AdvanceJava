package product;
import jakarta.persistence.*;
@Entity
public class Product {
@Id
private int id;
private String name;
private double price;
private String category;
private int quantity;
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public double getPrice() {
	return price;
}
public String getCategory() {
	return category ;
}
public int getQuantity() {
	return quantity;
}
public void setId(int id) {
	this.id=id;
}
public void setName(String name) {
	this.name=name;
}
public void setPrice(double price) {
	this.price=price;
}
public void setCategory(String category) {
	this.category=category;
}
public void setQuantity(int quantity) {
	this.quantity=quantity;
}
@Override
public String toString() {
	return "Product[Id="+id+","+"Name="+price+","+"Price="+price+","+"Category="+category+","+"Quantity="+quantity+"]";
	
}
}
