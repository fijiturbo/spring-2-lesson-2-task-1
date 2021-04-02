package uz.pdp.spring2lesson2task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.spring2lesson2task1.entity.Input;
import uz.pdp.spring2lesson2task1.projection.CustomInput;

@RepositoryRestResource(path = "input", collectionResourceRel = "list", excerptProjection = CustomInput.class)
public interface InputRepository extends JpaRepository<Input, Integer> {

}
