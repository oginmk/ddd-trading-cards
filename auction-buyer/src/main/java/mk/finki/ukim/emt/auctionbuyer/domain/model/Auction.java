package mk.finki.ukim.emt.auctionbuyer.domain.model;

import lombok.NonNull;
import mk.finki.ukim.emt.shared.base.AbstractEntity;
import mk.finki.ukim.emt.shared.custom.Card;
import mk.finki.ukim.emt.shared.financial.Currency;
import mk.finki.ukim.emt.shared.financial.Money;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="auction")
public class Auction extends AbstractEntity<AuctionID> {

    private Card playingCard;

    private Money StartingPrice;

    @Column(name="auction_currency")
    @Enumerated(EnumType.STRING)
    private Currency currency;

    private Date timeOfFinalization;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    private ArrayList<Bidder> Bidders;

    public Auction(){}

    public Bidder MaxBid()
    {
        return Bidders.stream().max(Comparator.comparing(bidder -> bidder.returnBidAmount().getAmount())).get();
    }

    public void addBidder(@NonNull Bidder bid)
    {
        if(bid.returnBidAmount().getCurrency() == MaxBid().returnBidAmount().getCurrency())
        {
            if (bid.returnBidAmount().getAmount() > MaxBid().returnBidAmount().getAmount())
                Bidders.add(bid);
        }
    }



}
