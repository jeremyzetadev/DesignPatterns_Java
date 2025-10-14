package Creational.Factory;

import java.util.ArrayList;

public class FactoryInstantiate {
    void Main(){
        Restaurant beefResto = new BeefBurgerRestaurant();
        Burger beefBurger = beefResto.createBurger();

        Restaurant veggieResto = new VeggieBurgerRestaurant();
        Burger veggieBurger = veggieResto.createBurger();

        //LOOP THROUGH ALL GENERIC Restaurant with assigned overrided method and create BURGER based on its overrided
        ArrayList<Restaurant> lstRestaurant = new ArrayList<Restaurant>();
        lstRestaurant.add(beefResto);
        lstRestaurant.add(veggieResto);

        // GENERIC Burger with assigned overrided method
        ArrayList<Burger> lstBurger = new ArrayList<Burger>();
        for(int i=0; i<lstRestaurant.size(); i++)
            lstBurger.add(lstRestaurant.get(i).createBurger());

    }



    // INIT AS BeefBurgerRestaurant -->> not USUAL, design patterns use the generalized form of object to transform data
//    BeefBurgerRestaurant beefResto_ = new BeefBurgerRestaurant();
//    Burger beefBurger_ = beefResto_.createBurger();
}
