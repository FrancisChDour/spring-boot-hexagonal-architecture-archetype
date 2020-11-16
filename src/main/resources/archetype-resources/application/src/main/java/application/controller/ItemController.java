package ${package}.application.controller;

import ${package}.domain.item.ItemNotFoundException;
import ${package}.domain.item.ItemService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
@AllArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/{articleCode}")
    public ResponseEntity<?> getItemByArticleCode(@PathVariable String articleCode) {
        try {
            return ResponseEntity.ok(itemService.findItemByArticleCode(articleCode));
        } catch (ItemNotFoundException e) {
            return new ResponseEntity<>(e.getErrorMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}