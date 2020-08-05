package kr.co.fastcampus.eatgo.interfaces;

import kr.co.fastcampus.eatgo.application.MenuItemService;
import kr.co.fastcampus.eatgo.domain.MenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class  MenuItemController {

    @Autowired
    private MenuItemService menuItemService;


    @GetMapping("/restaurants/{restaurantId}/menuitems")
    public List<MenuItem> list(@PathVariable Long restaurantId) {

        List<MenuItem> menuItems = menuItemService.getMenuItems(restaurantId);
        MenuItem menuItem = MenuItem.builder().name("Kimchi").build();
        menuItems.add(menuItem);

        return menuItems;
    }

    @PatchMapping("/restaurants/{restaurantId}/menuitems")
    public String bulkUpdate(
            @PathVariable(value = "restaurantId")Long restaurantId,
            @RequestBody  List<MenuItem> menuItems){

        menuItemService.bulkUpdate(restaurantId,menuItems);
        return "";
    }
}
