package mk.finki.ukim.emt.shared.base;

import lombok.NonNull;

import javax.persistence.EmbeddedId;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

@MappedSuperclass
public class AbstractEntity<ID extends DomainObjectId> {

    @EmbeddedId
    private ID id;

    protected AbstractEntity(){}

    protected AbstractEntity(@NonNull AbstractEntity<ID> source)
    {
        Objects.requireNonNull(source,"Source Cannot be null");
        this.id = source.id;

    }
    protected AbstractEntity(@NonNull ID id)
    {

        this.id = Objects.requireNonNull(id,"id cannot be null");

    }

}
