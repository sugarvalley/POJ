package PJATK.LAB03.TASK03;

public class Remote {
    TV tv;

    public Remote(TV tv) {
        this.tv = tv;
    }

    public void channelUp() {
        if (isOn()) {
            if (tv.channel < 20) {
                tv.channel += 1;
            } else {
                System.out.println("Channel 20 is the highest channel");
            }
        } else {
            System.out.println("Your TV is OFF");
        }
    }

    public void channelDown() {
        if (isOn()) {
            if (tv.channel > 1) {
                tv.channel -= 1;
            } else {
                System.out.println("Channel 0 is the lowest channel");
            }
        } else {
            System.out.println("Your TV is OFF");
        }
    }

    public void volumeUp() {
        if (isOn()) {
            if (tv.volume < 10) {
                tv.volume += 1;
            } else {
                System.out.println("10 is MAX volume");
            }
        } else {
            System.out.println("Your TV is OFF");
        }

    }

    public void volumeDown() {
        if (isOn()) {
            if (tv.volume > 1) {
                tv.volume -= 1;
            } else {
                System.out.println("0 is MIN volume");
            }
        } else {
            System.out.println("Your TV is OFF");
        }
    }

    public void onOff() {
        if (tv.on == true) {
            tv.on = false;
            System.out.println("I'm turning the TV OFF");
        } else {
            tv.on = true;
            System.out.println("I'm turning the TV ON");
        }
    }

    public boolean isOn() {
        return tv.on;
    }
}
