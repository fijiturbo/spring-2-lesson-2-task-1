package uz.pdp.spring2lesson2task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task1.constants.ExpireStatus;
import uz.pdp.spring2lesson2task1.entity.*;
import uz.pdp.spring2lesson2task1.entity.Input;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Integer getId();

    Integer getProduct();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();

    ExpireStatus getExpireStatus();

}
