package uz.pdp.spring2lesson2task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task1.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {

    Integer getId();

    boolean isActive();

}
