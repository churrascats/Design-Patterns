package dao;

public class DatabaseDAO {
    
    private static DatabaseDAO instance;

    private DatabaseDAO(){
        connect();
    }

    public static DatabaseDAO getInstance(){
        if(instance == null){
            instance = new DatabaseDAO();
        }

        return instance;
    }

    private void connect() {
        System.out.println("________________________");
        System.out.println("Connecting to Database...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Connected to Database.");
    }

    public String runQuery(){
        System.out.println("Executing Query...");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Data Ready.");

        return "Generic Data";

    }
}
