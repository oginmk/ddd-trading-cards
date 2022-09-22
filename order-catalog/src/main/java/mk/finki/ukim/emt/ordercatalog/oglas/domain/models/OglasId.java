package mk.finki.ukim.emt.ordercatalog.oglas.domain.models;

import lombok.NonNull;
import mk.finki.ukim.emt.shared.base.DomainObjectId;

public class OglasId extends DomainObjectId {
    public OglasId()
    {
        super(OglasId.randomId(OglasId.class).getId());
    }
    public OglasId(@NonNull String uuid)
    {
        super(uuid);
    }

    public static OglasId of(String uuid)
    {
        OglasId id = new OglasId(uuid);
        return id;
    }
}
