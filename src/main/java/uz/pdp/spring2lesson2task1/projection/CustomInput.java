package uz.pdp.spring2lesson2task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task1.entity.*;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {

    Integer getId();

    Timestamp getDate();

    Integer getWarehouse();

    Integer getSupplier();

    Integer getCurrency();

    String getFactureNumber();

    String getCode();

}
