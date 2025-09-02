package Creational.AbstractFactory;

public class AbstractFactoryInstantiate {
    Company msi = new MsiManufacturer();
    Gpu msiGpu = msi.createGpu();
    Monitor msiMonitor = msi.createMonitor();

    Company asus = new AsusManufacturer();
    Gpu asusGpu = asus.createGpu();
    Monitor asusMonitor = asus.createMonitor();
}
