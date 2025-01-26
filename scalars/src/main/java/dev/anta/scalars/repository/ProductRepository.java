package dev.anta.scalars.repository;


import dev.anta.scalars.model.Product;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductRepository extends ListCrudRepository<Product, Integer> {
}
