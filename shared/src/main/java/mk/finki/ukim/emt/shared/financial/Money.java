package mk.finki.ukim.emt.shared.financial;


import lombok.Getter;
import mk.finki.ukim.emt.shared.base.ValueObject;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Money implements ValueObject {

    private final double amount;

    private final String currency;

    public Money(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money() {
        this.amount = 0;
        this.currency = "MKD";
    }
}
