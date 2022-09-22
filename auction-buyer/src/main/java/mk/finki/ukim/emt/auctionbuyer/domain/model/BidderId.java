package mk.finki.ukim.emt.auctionbuyer.domain.model;

import lombok.NonNull;
import mk.finki.ukim.emt.shared.base.DomainObjectId;

public class BidderId extends DomainObjectId {
    public BidderId()
    {
        super(BidderId.randomId(BidderId.class).getId());
    }
    public BidderId(@NonNull String uuid)
    {
        super(uuid);
    }

    public static BidderId of(String uuid)
    {
        BidderId id = new BidderId(uuid);
        return id;
    }
}
