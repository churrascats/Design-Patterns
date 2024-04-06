package proxy;

import java.util.HashMap;

import service.App;
import service.Response;
import service.Server;

public class ServiceProxy implements Server {
	private Server app;
	private int maxAllowedRequest;
	private HashMap<String, Integer> rateLimiter;

	public ServiceProxy() {
		this.app = new App();
		this.maxAllowedRequest = 2;
		this.rateLimiter = new HashMap<String, Integer>();
	}

	public Server getApp() {
		return app;
	}

	public void setApp(Server app) {
		this.app = app;
	}

	public int getMaxAllowedRequest() {
		return maxAllowedRequest;
	}

	public void setMaxAllowedRequest(int maxAllowedRequest) {
		this.maxAllowedRequest = maxAllowedRequest;
	}

	public HashMap<String, Integer> getRateLimiter() {
		return rateLimiter;
	}

	public void setRateLimiter(HashMap<String, Integer> rateLimiter) {
		this.rateLimiter = rateLimiter;
	}

	@Override
	public Response handleRequest(String url, String method) {

		boolean isAllowed = this.checkRateLimit(url);

		if (!isAllowed) {
			return new Response(403, "Forbidden");
		}

		return this.app.handleRequest(url, method);

	}

	private boolean checkRateLimit(String url) {
		HashMap<String, Integer> rateLimiter = this.getRateLimiter();
		Integer currentRateLimit = rateLimiter.get(url);
		int maxAllowedRequest = this.getMaxAllowedRequest();

		if (currentRateLimit == null) {
			currentRateLimit = 0;
		}

		if (currentRateLimit >= maxAllowedRequest) {
			return false;
		}

		rateLimiter.put(url, currentRateLimit + 1);

		return true;
	}
}