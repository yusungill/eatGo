package kr.co.fastcampus.eatgo.application;

import kr.co.fastcampus.eatgo.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private MenuItemRepository menuItemRepository;

    public RestaurantService(
            RestaurantRepository restaurantRepository,
            MenuItemRepository menuItemRepository) {

        this.menuItemRepository = menuItemRepository;
        this.restaurantRepository = restaurantRepository;
    }

    public List<Restaurant> getRestaurants() {

        List<Restaurant> restaurants = restaurantRepository.findAll();
        return restaurants;

    }

    public Restaurant getRestaurant(Long id){
        //못찾았을 때 예외 던짐 컨트롤러에서 처리
        Restaurant restaurant = restaurantRepository.findById(id)
                .orElseThrow(() -> new RestaurantNotFoundException(id));
        List<MenuItem> menuItems = menuItemRepository.findAllByRestaurantId(id);
        restaurant.setMenuItems(menuItems);

        return restaurant;
    }

    public Restaurant addRestaurant(Restaurant restaurant) {

        return restaurantRepository.save(restaurant);
    }

    @Transactional
    public Restaurant updateRestaurant(Long id, String name, String address) {

        Restaurant restaurant = restaurantRepository.findById(id).orElse(null);

        restaurant.updateInformation(name,address);

        return restaurant;
    }
}
