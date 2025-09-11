package food;

import jakarta.persistence.*;

@Entity
public class Food {
	@Id
	private int fid;
	private String fname;
	private double price;
	private double rating;
	private String type;

	public int getInt() {
		return fid;
	}

	public String getName() {
		return fname;
	}

	public double getPrice() {
		return price;
	}

	public double getRating() {
		return fid;
	}

	public String getType() {
		return type;
	}

	public void setId(int fid) {
		this.fid = fid;
	}

	public void setName(String fname) {
		this.fname = fname;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Food[Id="+fid+","+"Name="+fname+","+"Price="+price+","+"Rating="+rating+","+"type="+type+"]";
	}

}
