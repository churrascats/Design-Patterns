package components;

public class MotherBoard {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MotherBoard(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MotherBoard [type=" + type + "]";
    }

    
}
