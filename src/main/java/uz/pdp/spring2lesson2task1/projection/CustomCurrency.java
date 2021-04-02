package uz.pdp.spring2lesson2task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.spring2lesson2task1.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {

    Integer getId();

    boolean isActive();

}
