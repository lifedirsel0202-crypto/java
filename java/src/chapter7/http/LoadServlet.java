package chapter7.http;

public class LoadServlet extends HttpServlet {
	@Override
	public void service() {
		System.out.println("로그인합니다.");
	}
}
