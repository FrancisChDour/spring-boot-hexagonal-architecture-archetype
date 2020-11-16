package ${package}.domain.item;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Item {
    String idItem;
    String articleCode;
    String name;
}
