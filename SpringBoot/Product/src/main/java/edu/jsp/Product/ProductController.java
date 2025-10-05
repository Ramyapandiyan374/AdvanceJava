package edu.jsp.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
@Autowired
productService ps;
@PostMapping("save")
public Product saveBook(@RequestBody Product p) {
	return ps.addproduct(p);
}
@GetMapping("getById")
public Product getById(@RequestParam int pid) {
	return ps.fetchById(pid);
}
@GetMapping("getAll")
public List<Product> fetchAll(){
	return ps.fetchAll();
}
@DeleteMapping("deleteById")
public String deleteById(@RequestParam int pid) {
	return ps.deleteById(pid);
}

}
