package Creational.AbstractFactory;

public class MsiManufacturer extends Company{
    @Override
    public Gpu createGpu(){
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor(){
        return new MsiMonitor();
    }
}
