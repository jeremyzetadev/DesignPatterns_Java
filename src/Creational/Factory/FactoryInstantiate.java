package Creational.Factory;

public class FactoryInstantiate {
    Restaurant beefResto = new BeefBurgerRestaurant();
    Burger beefBurger = beefResto.createBurger();

    Restaurant veggieResto = new VeggieBurgerRestaurant();
    Burger veggieBurger = veggieResto.createBurger();
}
