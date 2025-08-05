package Creational.Builder_Simple;

public class BuilderInstantiate {
    void Main(){
        CarBuilder builder = new CarBuilder();
        builder.id(2122)
                .brand("Bugatti")
                .model("Chiron")
                .color("Blue");
        Car car = builder.build();
    }
}
