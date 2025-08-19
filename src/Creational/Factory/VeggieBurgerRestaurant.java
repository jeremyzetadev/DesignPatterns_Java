package Creational.Factory;

public class VeggieBurgerRestaurant extends BeefBurgerRestaurant {
    @Override
    public Burger createBurger(){
        return new VeggieBurger();
    }
}
