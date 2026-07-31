package chapter7.http;

public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoadServlet());
		method(new DownloadServlet());
		
	}
	public static void method (HttpServlet servlet) {
		servlet.service();
	}
}

