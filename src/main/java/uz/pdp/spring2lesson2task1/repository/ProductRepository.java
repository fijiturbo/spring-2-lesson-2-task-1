package uz.pdp.spring2lesson2task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.spring2lesson2task1.entity.Product;
import uz.pdp.spring2lesson2task1.projection.CustomProduct;

@RepositoryRestResource(path = "product", collectionResourceRel = "list", excerptProjection = CustomProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {




}
