package comp;

import comp.cpu.Processor;
import comp.display.Display;
import comp.harddisk.HardDrive;
import comp.keyboard.Keyboard;
import comp.memory.Ram;

public class Computer {
    private Processor processor;
    private Ram ram;
    private HardDrive harddrive;
    private Display display;
    private Keyboard keyboard;

    private final String vendor;
    private final String name;

    public Computer(Processor processor,
                    Ram ram, HardDrive harddrive,
                    Display display,
                    Keyboard keyboard,
                    String vendor,
                    String name) {
        this.processor = processor;
        this.ram = ram;
        this.harddrive = harddrive;
        this.display = display;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public HardDrive getHarddrive() {
        return harddrive;
    }

    public void setHarddrive(HardDrive harddrive) {
        this.harddrive = harddrive;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }
    public double getWeight(){
        return processor.getWeight()+display.getWeight()+harddrive.getWeight()+ keyboard.getWeight()+ ram.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                ", harddrive=" + harddrive +
                ", display=" + display +
                ", keyboard=" + keyboard +
                ", vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}


