public class Main {
    public static void main(String[] args) {
        RemoteControl c = new RemoteControl();
        c.turnOn();
        c.openMenu();
        c.volumeUp();
        c.closeMenu();
        c.volumeDown();
        c.play();
        c.openMenu();
        c.pause();
        c.turnOff();

    }
}