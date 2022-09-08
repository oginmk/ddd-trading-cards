package mk.finki.ukim.emt.shared.base;

import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity<ID extends DomainObjectId> {

    @EmbeddedId
    private ID id;

}
