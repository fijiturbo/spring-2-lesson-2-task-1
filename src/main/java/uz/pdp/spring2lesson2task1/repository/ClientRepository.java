package uz.pdp.spring2lesson2task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.spring2lesson2task1.entity.Client;
import uz.pdp.spring2lesson2task1.projection.CustomClient;

@RepositoryRestResource(path = "client", collectionResourceRel = "list", excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
