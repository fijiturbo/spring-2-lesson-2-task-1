package uz.pdp.spring2lesson2task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task1.entity.*;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    boolean isActive();

    Integer getCategory();

    Integer getPhoto();

    Integer getMeasurement();

    String getCode();

}
