package Extending_A_Bridge_Pattern_Implementation.devices;

public class SingleChannelTV extends Tv {
    private boolean on = false;
    private boolean isrecording = false;
    private int volume = 30;
    private int channel = 67;

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Single Channel TV can only be set to channel 67.");
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm Single TV set.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| I'm " + (isrecording ? "recording" : "not recording"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}
