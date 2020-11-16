package ${package}.architecture;

import ${package}.domain.item.Item;
import ${package}.domain.item.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Profile("mock-item")
@Repository
public class ItemRepositoryImplMock implements ItemRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemRepositoryImplMock.class);

    @Override
    public Item getItemByArticleCode(String idItem) {
        LOGGER.warn("/!\\ mock-item is active /!\\");
        return null;
    }
}
