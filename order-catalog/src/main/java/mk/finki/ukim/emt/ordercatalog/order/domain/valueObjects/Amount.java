package mk.finki.ukim.emt.ordercatalog.order.domain.valueObjects;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Amount {

    private final int amount;

    protected Amount(int amount) {
        this.amount = amount;
    }

    protected Amount() {
        this.amount = 0;
    }
}
