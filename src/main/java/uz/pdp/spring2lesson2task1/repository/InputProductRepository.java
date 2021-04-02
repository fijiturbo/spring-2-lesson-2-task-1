package uz.pdp.spring2lesson2task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.spring2lesson2task1.entity.InputProduct;
import uz.pdp.spring2lesson2task1.projection.CustomInputProduct;


@RepositoryRestResource(path = "inputProduct", collectionResourceRel = "list", excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Integer> {




}
