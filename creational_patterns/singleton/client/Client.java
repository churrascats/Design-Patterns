package client;

import cache.Cache;
import service.Service;

public abstract class Client {
    
    private final Service service = new Service();
    private final Cache cache = Cache.getInstance();
    private String clientName;

    public Cache getCache() {
        return cache;
    }
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Cache getDataFromService(){

        System.out.println("--------------------------");
        System.out.println("Perfoming: " + clientName);
        System.out.println("--------------------------");

        if(cache.getValue() == null){
            cache.setValue(service.getDataFromDatabase());
        }

        return cache;
    }
}
