package mk.finki.ukim.emt.ordercatalog.order.domain.models;

import lombok.Getter;
import lombok.NonNull;
import mk.finki.ukim.emt.ordercatalog.oglas.domain.models.Oglas;
import mk.finki.ukim.emt.ordercatalog.oglas.domain.models.OglasId;
import mk.finki.ukim.emt.ordercatalog.order.domain.valueObjects.Quantity;
import mk.finki.ukim.emt.shared.base.AbstractEntity;
import mk.finki.ukim.emt.shared.financial.Money;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name="order_entity")
@Getter
public class Order extends AbstractEntity<OrderId> {

    private Quantity quantity;
    private Money totalAmount;
    private String shippingAdress;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    private List<Oglas> oglasi;
    public static Order build(Quantity quantity, Money amount, String adress, List<Oglas> oglasi) {
        Order o = new Order();
        o.quantity = quantity;
        o.totalAmount = amount;
        o.shippingAdress = adress;
        o.oglasi = oglasi;
        return o;
    }


    public Order()
    {
    }

    public Oglas AddItem(@NonNull Oglas oglas)
    {
        Objects.requireNonNull(oglas,"Oglas must not be null");
       this.oglasi.add(oglas);
       return oglas;
    }
    public Oglas RemoveItem(@NonNull Oglas oglas)
    {
        Objects.requireNonNull(oglas,"Oglas must not be null");
       oglasi.remove(oglas);
       return oglas;
    }

}
