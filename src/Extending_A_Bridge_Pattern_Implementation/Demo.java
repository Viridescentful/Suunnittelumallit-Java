package Extending_A_Bridge_Pattern_Implementation;

import Extending_A_Bridge_Pattern_Implementation.devices.Device;
import Extending_A_Bridge_Pattern_Implementation.devices.Radio;
import Extending_A_Bridge_Pattern_Implementation.devices.SingleChannelTV;
import Extending_A_Bridge_Pattern_Implementation.devices.Tv;
import Extending_A_Bridge_Pattern_Implementation.remotes.AdvancedRemote;
import Extending_A_Bridge_Pattern_Implementation.remotes.BasicRemote;
import Extending_A_Bridge_Pattern_Implementation.remotes.BrokenRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
        testDevice(new SingleChannelTV());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.setrecording();
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.setrecording();
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();

        System.out.println("Tests with broken remote.");
        BrokenRemote brokenRemote = new BrokenRemote(device);
        brokenRemote.power();
        brokenRemote.volumeDown();
        brokenRemote.volumeUp();
        device.printStatus();
    }
}

