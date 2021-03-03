package net.codejava.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.codejava.models.Product;
import net.codejava.repositories.ProductRepository;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository repo;

	public List<Product> listAll() {
		return repo.findAll();
	}

	public void save(Product product) {
		repo.save(product);
	}

	public Optional<Product> get(Integer id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
