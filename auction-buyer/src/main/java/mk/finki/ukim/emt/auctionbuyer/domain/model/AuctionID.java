package mk.finki.ukim.emt.auctionbuyer.domain.model;

import lombok.NonNull;
import mk.finki.ukim.emt.shared.base.DomainObjectId;

public class AuctionID extends DomainObjectId {

    public AuctionID()
    {
        super(AuctionID.randomId(AuctionID.class).getId());
    }
    public AuctionID(@NonNull String uuid)
    {
        super(uuid);
    }

    public static AuctionID of(String uuid)
    {
        AuctionID id = new AuctionID(uuid);
        return id;
    }
}
