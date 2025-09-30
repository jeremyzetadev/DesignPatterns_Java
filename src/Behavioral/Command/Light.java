package Behavioral.Command;

public class Light {
    private boolean switchedOn;

    public void switchLights(){
        switchedOn  = (!switchedOn);
    }
}
