package Extending_A_Bridge_Pattern_Implementation.remotes;


import Extending_A_Bridge_Pattern_Implementation.devices.Device;

import java.util.Random;

public class BrokenRemote extends BasicRemote {

    public BrokenRemote(Device device) {
        super.device = device;
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote: volume down?");
        device.setVolume(device.getVolume() - new Random().nextInt(10) + 1);
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote: volume up?");
        device.setVolume(device.getVolume() + new Random().nextInt(10) + 1);
    }
}
