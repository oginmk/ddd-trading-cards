package mk.finki.ukim.emt.auctionbuyer.domain.model;

import mk.finki.ukim.emt.auctionbuyer.domain.valueObj.AuctionId;
import mk.finki.ukim.emt.shared.base.AbstractEntity;
import mk.finki.ukim.emt.shared.custom.*;
import mk.finki.ukim.emt.shared.financial.Money;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="bider")
public class Bidder extends AbstractEntity<BidderId> {

    private Money bid;

    @Column(nullable = false)
    private User user;

    @AttributeOverride(name="id",column = @Column(name="AuctionID",nullable = false))
    private AuctionId auctionid;

    public Money returnBidAmount()
    {
        Money Money = bid;
        return Money;
    }

    public Bidder() {
    }
}
