package ${package}.domain.item;

import ${package}.domain.tools.ErrorMessage;
import ${package}.domain.tools.NotFoundException;
import lombok.Getter;

@Getter
public class ItemNotFoundException extends NotFoundException {

    public ItemNotFoundException(String itemIdentifier) {
        super(ErrorMessage.builder()
                .error(ERROR + itemIdentifier)
                .error_desciption(MESSAGE)
                .error_uri(URI)
                .build());
    }

    private static final String ERROR = "item.notFound : ";
    private static final String MESSAGE = "This item doest not exist";
    private static final String URI = "https://github.com/FrancisChDour/spring-boot-hexagonal-architecture-archetype";

}
