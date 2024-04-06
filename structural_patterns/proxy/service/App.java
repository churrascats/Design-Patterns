package service;

public class App implements Server {

    @Override
    public Response handleRequest(String url, String method) {
        if (url == Constants.APP_STATUS_URL && method == Constants.GET) {
            return new Response(200, "Ok");
        }

        if (url == Constants.CREATE_USER_URL && method == Constants.POST) {
            return new Response(201, "Created");
        }

        return new Response(404, "Not found");
    }

}
