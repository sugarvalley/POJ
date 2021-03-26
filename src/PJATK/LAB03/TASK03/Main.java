package PJATK.LAB03.TASK03;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV(1,1,false);
        Remote remote = new Remote(tv);
        System.out.println("Is ON?: " + remote.isOn());
        remote.channelUp();
        remote.volumeUp();
        remote.onOff();
        remote.channelUp();
        remote.volumeDown();
        remote.volumeUp();
        System.out.println("Volume: " + tv.volume);
        remote.channelUp();
        remote.channelUp();
        remote.channelUp();
        remote.channelUp();
        remote.channelUp();
        remote.channelUp();
        System.out.println("Channel: " + tv.channel);
        remote.onOff();
        remote.channelDown();
        remote.onOff();
        remote.channelUp();
        remote.volumeUp();
        System.out.println("Channel: " + tv.channel);
        remote.onOff();
    }
}
