package service;

public class Response {
    int code;
    String status;

    public Response(int code, String status) {
        this.code = code;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Response [code=" + code + ", status=" + status + "]";
    }
}
