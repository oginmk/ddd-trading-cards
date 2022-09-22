package mk.finki.ukim.emt.ordercatalog.order.domain.models;


import lombok.NonNull;
import mk.finki.ukim.emt.ordercatalog.oglas.domain.models.OglasId;
import mk.finki.ukim.emt.shared.base.DomainObjectId;

public class OrderId extends DomainObjectId {

    public OrderId()
    {
        super(OrderId.randomId(OrderId.class).getId());
    }
    public OrderId(@NonNull String uuid)
    {
        super(uuid);
    }
    public static OrderId of(String uuid)
    {
        OrderId id = new OrderId(uuid);
        return id;
    }
}
