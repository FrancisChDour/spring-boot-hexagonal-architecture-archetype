package ${package}.domain.tools;

import lombok.Getter;

@Getter
public abstract class DomainException extends RuntimeException {

    private final ErrorMessage errorMessage;

    public DomainException(ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }

}
