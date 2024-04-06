import proxy.ServiceProxy;
import service.Constants;
import service.Server;

public class Main {

    public static void main(String[] args) {

        Server server = new ServiceProxy();

        System.out.println(server.handleRequest(Constants.APP_STATUS_URL, Constants.GET).toString());
        System.out.println(server.handleRequest(Constants.APP_STATUS_URL, Constants.GET).toString());
        System.out.println(server.handleRequest(Constants.APP_STATUS_URL, Constants.GET).toString());

        System.out.println(server.handleRequest(Constants.CREATE_USER_URL, Constants.POST).toString());
        System.out.println(server.handleRequest(Constants.CREATE_USER_URL, Constants.GET).toString());
    }

}