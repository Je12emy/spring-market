package net.codejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.models.Product;


// To take advantage of JPA create a interface
public interface ProductRepository extends JpaRepository<Product, Integer> {
	// Spring JPA will generate implementation code for most CRUD operations.
}
