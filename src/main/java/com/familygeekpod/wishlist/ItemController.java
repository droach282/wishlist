package com.familygeekpod.wishlist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @RequestMapping("/item")
    public Item getItem(@RequestParam(value="id") long id) {
        return new Item(id, "hello!", 0);
    }
}