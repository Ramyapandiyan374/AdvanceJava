package dress;

import jakarta.persistence.*;

@Entity
public class Dress {
	@Id
	private int sno;
	private String dname;
	private double price;
	private double rating;
	private String location;

	public int getSno() {
		return sno;
	}

	public String getDname() {
		return dname;
	}

	public double getPrice() {
		return price;
	}

	public double getRating() {
		return rating;
	}

	public String getLocation() {
		return location;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setName(String dname) {
		this.dname = dname;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
@Override
public String toString() {
	return "Dress[sno="+sno+","+"Dname="+dname+","+"price="+price+","+"rating="+rating+","+"Location="+location+"]";
	
}
}
