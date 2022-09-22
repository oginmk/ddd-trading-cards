package mk.finki.ukim.emt.ordercatalog.order.domain.valueObjects;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Quantity {


    private final int quantity;

    protected Quantity(){this.quantity = 0;}
}
