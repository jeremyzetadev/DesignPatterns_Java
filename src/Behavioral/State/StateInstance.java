package Behavioral.State;

import javax.swing.*;

public class StateInstance {
    void Main(){
        Phone phone = new Phone();
        JButton home = new JButton("Home");
        home.addActionListener(e->phone.state.onHome());
        JButton onOff = new JButton("On/Off");
        onOff.addActionListener(e->phone.state.onOffOn());
    }
}
