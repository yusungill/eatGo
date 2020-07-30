package kr.co.fastcampus.eatgo.domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String name;
    private String address;
    private Long  id;
    private List<MenuItem> menuItems  = new ArrayList<>();

    public Restaurant() {
    }

    public Restaurant(Long id, String name, String address) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {

        return "Seoul";
    }

    public String getInformation(){

        return  name + " in " + address;

    }

    public List<MenuItem> getMenuItems(){

            return menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {

        this.menuItems.add(menuItem);
    }

    public void setMenuItems(List<MenuItem> menuItems) {

        for(MenuItem menuItem : menuItems){

            addMenuItem(menuItem);

        }
    }


}
