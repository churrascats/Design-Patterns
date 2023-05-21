import cache.Cache;
import client.Client;
import client.ClientA;
import client.ClientB;
import client.ClientC;

public class Main{

    public static void main(String[] args){
        
        Client clientA = new ClientA();
        Client clientB = new ClientB();
        Client clientC = new ClientC();

        Cache cacheA = clientA.getDataFromService();
        Cache cacheB = clientB.getDataFromService();
        Cache cacheC = clientC.getDataFromService();

        System.out.println("Client A has "  + cacheA + " cache with the following value: " + cacheA.getValue());
        System.out.println("Client B has "  + cacheB + " cache with the following value: " + cacheB.getValue());
        System.out.println("Client C has "  + cacheC + " cache with the following value: " + cacheC.getValue());
    }

}