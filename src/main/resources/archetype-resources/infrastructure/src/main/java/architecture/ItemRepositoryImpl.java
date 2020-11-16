package ${package}.architecture;

import ${package}.domain.item.Item;
import ${package}.domain.item.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Profile("!mock-item")
@Repository
public class ItemRepositoryImpl implements ItemRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemRepositoryImpl.class);

    @Override
    public Item getItemByArticleCode(String idItem) {

        LOGGER.debug("IN - getItemByArticleCode with idItem : " + idItem);

        return Item.builder()
                .idItem(UUID.randomUUID().toString())
                .articleCode("123456789")
                .name("Sample Item")
                .build();
    }
}
