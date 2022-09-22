package mk.finki.ukim.emt.shared.custom;

import lombok.Getter;
import lombok.Value;
import mk.finki.ukim.emt.shared.base.ValueObject;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class User implements ValueObject {

    private String username;

    private String phoneNumber;

    private String Email;

}
