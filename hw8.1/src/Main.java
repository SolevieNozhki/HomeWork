import calc.ArithmeticCalculator;
import calc.Operation;
import comp.Computer;
import comp.cpu.CoreCount;
import comp.cpu.Processor;
import comp.cpu.Producer;
import comp.cpu.Rate;
import comp.display.Display;
import comp.display.DisplayType;
import comp.harddisk.HardDrive;
import comp.harddisk.HardDriveType;
import comp.keyboard.Keyboard;
import comp.keyboard.KeyboardIlluminate;
import comp.keyboard.KeyboardType;
import comp.memory.MemoryType;
import comp.memory.Ram;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(Rate.THREE_THOUSAND, CoreCount.ELEVEN, Producer.INTEL,500);
        Ram ram = new Ram(MemoryType.DDR2,16,300);
        Display display = new Display(27, DisplayType.IPS,3000);
        HardDrive hardDrive = new HardDrive(HardDriveType.HDD,256,1000);
        Keyboard keyboard = new Keyboard(KeyboardType.MECHANICAL, KeyboardIlluminate.YES,450);
        Computer computer = new Computer(processor,ram,hardDrive,display,keyboard,"Cougar","Alexander");
        System.out.println(computer.getWeight()+ " грамм");


    }
}