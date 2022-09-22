package mk.finki.ukim.emt.shared.base;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import lombok.NonNull;

import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@MappedSuperclass
@Embeddable
@Getter
public class DomainObjectId implements Serializable {

    private String id;

    public DomainObjectId(){this.id = UUID.randomUUID().toString();}
    @JsonCreator
    protected DomainObjectId(@NonNull String uuid)
    {
        this.id = Objects.requireNonNull(uuid,"UUID cannot be null");
    }
    @NonNull
    public static <ID extends DomainObjectId> ID randomId(@NonNull Class<ID> idclass)
    {
        Objects.requireNonNull(idclass,"idclass cannot be null");
        try
        {
            return idclass.getConstructor(String.class).newInstance(UUID.randomUUID().toString());
        }
        catch(Exception e)
        {
            throw new RuntimeException("Could not create new instance of "+ idclass,e);
        }
    }
}
