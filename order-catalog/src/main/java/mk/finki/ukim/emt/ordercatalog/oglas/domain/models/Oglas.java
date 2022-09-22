package mk.finki.ukim.emt.ordercatalog.oglas.domain.models;

import mk.finki.ukim.emt.shared.base.AbstractEntity;
import mk.finki.ukim.emt.shared.custom.Card;
import mk.finki.ukim.emt.shared.financial.Money;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="oglas")
public class Oglas extends AbstractEntity<OglasId>{

    private Card playingCard;

    private Money money;

    private String dateCreated;
    public Oglas()
    {
        super(OglasId.randomId(OglasId.class));
    }

    public static Oglas build(Card playingCard, Money money, String dateCreated)
    {
        Oglas o  = new Oglas();
        o.playingCard = playingCard;
        o.money = money;
        o.dateCreated = dateCreated;
        return o;
    }
}
