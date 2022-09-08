package mk.finki.ukim.emt.ordercatalog.order.domain.models;

import mk.finki.ukim.emt.ordercatalog.order.domain.valueObjects.Amount;
import mk.finki.ukim.emt.shared.base.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order extends AbstractEntity<OrderId> {
    public Order(){}


    private String shippingAdress;

    private Amount totalAmount;
}
