package uz.pdp.spring2lesson2task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task1.entity.*;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    Integer getId();

    Integer getProduct();

    Double getAmount();

    Double getPrice();

    Integer getOutput();

}
