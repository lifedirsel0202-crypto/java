package chapter7.http;

public class DownloadServlet extends HttpServlet{

	@Override
	public void service() {
		System.out.println("파일을 다운로드합니다.");
	}
	
	
}
