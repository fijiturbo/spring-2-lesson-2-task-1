package uz.pdp.spring2lesson2task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.spring2lesson2task1.entity.Output;
import uz.pdp.spring2lesson2task1.projection.CustomOutput;

@RepositoryRestResource(path = "output", collectionResourceRel = "list", excerptProjection = CustomOutput.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {

}
