package Electronics;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Computers computers = new Computers();
        Electronics electronics = new Electronics();
        LaptopClass laptopClass = new LaptopClass();
        PcClass pcClass = new PcClass();
        SoundsClass soundsClass = new SoundsClass();
        SubwooferClass subwooferClass = new SubwooferClass();
        LoadSpeakerClass loadSpeakerClass = new LoadSpeakerClass();
        System.out.println(computers.getLoad());
        System.out.println(electronics.getPower());
        System.out.println(laptopClass.getCharging());
        System.out.println(pcClass.getMonitor());
        System.out.println(soundsClass.getBass());
        System.out.println(subwooferClass.getGain());
    }
}
