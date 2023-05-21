package cache;

public class Cache {
    private String value;
    private static Cache instance;

    private Cache(){}

    public static Cache getInstance(){
        if(instance == null){
            instance = new Cache();
        }

        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    
}
