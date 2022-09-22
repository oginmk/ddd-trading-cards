package mk.finki.ukim.emt.auctionbuyer.domain.valueObj;


import lombok.NonNull;
import mk.finki.ukim.emt.shared.base.DomainObjectId;

import javax.persistence.Embeddable;

@Embeddable
public class AuctionId extends DomainObjectId {

    public AuctionId()
    {
        super(AuctionId.randomId(AuctionId.class).getId());
    }

    public AuctionId(@NonNull String uuid)
    {
        super(uuid);
    }
}
