import components.CPU;
import components.Memory;
import components.MotherBoard;
import prototypes.SmartphonePrototype;

public class Main{

    static CPU cpu;
    static Memory memory;
    static MotherBoard motherBoard;

    static SmartphonePrototype smartphonePrototype;

    static {
        cpu = new CPU("Generic");
        memory = new Memory("Generic");
        motherBoard = new MotherBoard("Generic");

        smartphonePrototype = new SmartphonePrototype("PROTOTYPE", cpu, memory, motherBoard);
    }

    public static void main(String[] args){
        
        //Deep Copy Implemented

        SmartphonePrototype modelA = (SmartphonePrototype) smartphonePrototype.makeClone();
        modelA.setMac("modelA");
        modelA.getCpu().setType("modelA");
        modelA.getMemory().setType("modelA");
        modelA.getMotherBoard().setType("modelA");

        System.out.println(smartphonePrototype);
        System.out.println(modelA);
    }
}