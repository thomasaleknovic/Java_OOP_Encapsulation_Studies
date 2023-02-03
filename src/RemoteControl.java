public class RemoteControl implements Controller {

    private int volume;
    private boolean isOn;
    private boolean playing;


    public RemoteControl() {
        this.volume = 50;
        this.isOn = false;
        this.playing = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean on) {
        isOn = on;
    }

    public boolean getPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }


    @Override
    public void turnOn() {
        if (!this.getIsOn()){
            this.setIsOn(true);
        } else {
            System.out.println("Device already on");
        }
    }

    @Override
    public void turnOff() {
        if (this.getIsOn()){
            this.setIsOn(false);
        } else {
            System.out.println("Device already off");
        }
    }

    @Override
    public void openMenu() {
        if (this.getIsOn()) {
            System.out.println("--------- MENU -----------");
            System.out.println("It is on? " + this.getIsOn());
            System.out.println("It is playing? " + this.getPlaying());
            System.out.println("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println("");
        }
    }
    @Override
    public void closeMenu() {
        System.out.println("Closing menu...");
    }

    @Override
    public void volumeUp() {
        if (this.getIsOn()) {
            this.setVolume(this.getVolume() + 5);
            System.out.println("Volume: " + this.getVolume());
        }
    }

    @Override
    public void volumeDown() {
        if (this.getIsOn()) {
            this.setVolume(this.getVolume() - 5);
            System.out.println("Volume: " + this.getVolume());
        }
    }

    @Override
    public void muteOn() {
        if (this.getIsOn() && this.getVolume() > 0) {
            this.setVolume(0);
            System.out.println("Mute on");
        }
    }

    @Override
    public void muteOff() {
        if (this.getIsOn() && this.getVolume() == 0) {
            this.setVolume(50);

        }
    }

    @Override
    public void play() {
        if (this.getIsOn() && (!this.getPlaying())) {
            this.setPlaying(true);
        }
    }

    @Override
    public void pause() {
        if (this.getIsOn() && this.getPlaying()) {
            this.setPlaying(false);
        }
    }
}
