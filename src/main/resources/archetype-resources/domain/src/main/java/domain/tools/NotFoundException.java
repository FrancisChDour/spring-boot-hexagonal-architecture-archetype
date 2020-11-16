package ${package}.domain.tools;

import lombok.Getter;

@Getter
public abstract class NotFoundException extends DomainException {

    public NotFoundException(ErrorMessage errorMessage) {
        super(errorMessage);
    }

}
