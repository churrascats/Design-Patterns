package components;

public class CPU {
    
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CPU(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CPU [type=" + type + "]";
    }

    
}
