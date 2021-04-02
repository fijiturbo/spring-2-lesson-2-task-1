package uz.pdp.spring2lesson2task1.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.spring2lesson2task1.entity.template.AbstractEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Warehouse extends AbstractEntity {

}
