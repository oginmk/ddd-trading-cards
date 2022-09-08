package mk.finki.ukim.emt.ordercatalog.oglas.domain.models;

import mk.finki.ukim.emt.shared.base.AbstractEntity;
import mk.finki.ukim.emt.shared.custom.Card;
import mk.finki.ukim.emt.shared.financial.Money;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="oglas")
public class Oglas extends AbstractEntity<OglasId>{

    public Oglas(){}


    private Card playingCard;

    private Money money;

    private String dateCreated;
}
