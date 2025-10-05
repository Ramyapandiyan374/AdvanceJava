package edu.jsp.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class productService {
	@Autowired
	ProductRepository pr;
public Product addproduct(Product p) {
	return pr.save(p);  
}
public Product fetchById(int pid) {
	Optional<Product> o=pr.findById(pid);
	if(o.isPresent()) {
		return o.get();
	}
	return null;
}
	public List<Product> fetchAll(){
		return pr.findAll();
	
}
	public String deleteById(int pid) {
		Optional<Product> o=pr.findById(pid);
		if(o.isPresent()) {
			 pr.deleteById(pid);
			 return "Data deleted";
		}
		return "Id is not found";
	}
}
