package ${package}.domain.tools;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ErrorMessage {
    private final String error;
    private final String error_desciption;
    private final String error_uri;
}
