package Creational.Factory;

public class FactoryInstantiate {
    Restaurant beefResto = new BeefBurgerRestaurant();
    Burger beefBurger = beefResto.createBurger();

    Restaurant veggieResto = new VeggieBurgerRestaurant();
    Burger veggieBurger = veggieResto.createBurger();


    // INIT AS BeefBurgerRestaurant -->> not USUAL, design patterns use the generalized form of object to transform data
//    BeefBurgerRestaurant beefResto_ = new BeefBurgerRestaurant();
//    Burger beefBurger_ = beefResto_.createBurger();
}
