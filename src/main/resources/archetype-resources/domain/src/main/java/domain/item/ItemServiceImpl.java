package ${package}.domain.item;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public Item findItemByArticleCode(String articleCode) {
        return Optional.ofNullable(itemRepository.getItemByArticleCode(articleCode))
                .orElseThrow(() -> new ItemNotFoundException(articleCode));
    }
}
