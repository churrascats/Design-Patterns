package service;

import dao.DatabaseDAO;

public class Service {

    private final DatabaseDAO databaseDAO = DatabaseDAO.getInstance();

    public Service(){
        System.out.println("Database Instance: " + databaseDAO);
    }

    public String getDataFromDatabase(){
        return databaseDAO.runQuery();
    }
}
