package prototypes;

import components.CPU;
import components.Memory;
import components.MotherBoard;

public class SmartphonePrototype implements Smartphone {

    private String mac;
    private CPU cpu;
    private Memory memory;
    private MotherBoard motherBoard;

    public SmartphonePrototype(String mac, CPU cpu, Memory memory, MotherBoard motherBoard) {
        this.mac = mac;
        this.cpu = cpu;
        this.memory = memory;
        this.motherBoard = motherBoard;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    @Override
    public String toString() {
        return "SmartphonePrototype [cpu=" + cpu + ", mac=" + mac + ", memory=" + memory + ", motherBoard="
                + motherBoard + "]";
    }

    @Override
    public Smartphone makeClone() {

        SmartphonePrototype smartphonePrototype = new SmartphonePrototype(this.mac, new CPU(this.getCpu().getType()),
                new Memory(this.getMemory().getType()), new MotherBoard(this.getMotherBoard().getType()));

        return smartphonePrototype;
    }

}
