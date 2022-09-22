package mk.finki.ukim.emt.shared.financial;


import lombok.Getter;
import lombok.NonNull;
import mk.finki.ukim.emt.shared.base.ValueObject;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Objects;

@Embeddable
@Getter
public class Money implements ValueObject {

    private final double amount;

    @Enumerated(value= EnumType.STRING)
    private final Currency currency;

    public Money(@NonNull double amount,@NonNull Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money() {
        this.amount = 0;
        this.currency = Currency.MKD;
    }




    public static Money valueOf( int amount,Currency currency){return new Money(amount,currency);}

    public Money Add(Money money)
    {
        if(!currency.equals(money.currency))
        {
            throw new IllegalArgumentException("Cannot Add two money objects with different currencies");
        }
        return new Money(amount + money.amount,currency);
    }
    public Money Substract(Money money)
    {
        if(!currency.equals(money.currency))
        {
            throw new IllegalArgumentException("Cannot Substract two money objects with different currencies");
        }
        return new Money(amount - money.amount,currency);
    }

    public Money Multiply(int m){return new Money(amount * m , currency);}

}
