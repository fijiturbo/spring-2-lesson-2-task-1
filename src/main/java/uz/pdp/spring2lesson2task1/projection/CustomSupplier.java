package uz.pdp.spring2lesson2task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task1.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {

    Integer getId();

    String getName();

    String getPhoneNumber();

    boolean isActive();

}
