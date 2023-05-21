package components;

public class Memory {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Memory(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Memory [type=" + type + "]";
    }
}
