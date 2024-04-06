package service;

public interface Server {
    public Response handleRequest(String url, String method);
}
