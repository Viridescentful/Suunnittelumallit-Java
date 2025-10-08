package Extending_A_Bridge_Pattern_Implementation.devices;

public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    void record();

    boolean isrecording();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
