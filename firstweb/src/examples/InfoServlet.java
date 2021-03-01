package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoServlet
 */
@WebServlet("/info")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>info</title></head>");
		out.println("<body>");

		// URI : URL에서 도메인과 port번호 이하에 있는 값을 의미한다. 
		String uri = request.getRequestURI();	// 출력 결과 - uri : /firstweb/info
		
		// URL : 요청 주소 전체를 의미한다.
		StringBuffer url = request.getRequestURL();	// 출력 결과 - url : http://localhost:8080/firstweb/info
		
		// contentPath는 웹어플리케이션과 매핑된 Path라고 생각하면 된다. WAS내에 웹애플리케이션이 여러개 존재할 수 있다. 이때 웹어플리케이션을 찾아가는 이름을 의미한다.
		// 기본적으로 contentPath는 현재 프로젝트 이름으로 지정된다. 이부분은 없앨 수도 본인이 원하는 이름으로 지정할 수도 있다.
		String contentPath = request.getContextPath();	// 출력 결과 - contentPath : /firstweb
		
		// RemoteAddr : Client의 주소값(IP 주소)를 의미한다. 
		String remoteAddr = request.getRemoteAddr();	// 출력 결과 - remoteAddr : 0:0:0:0:0:0:0:1 
														// 출력결과가 위와 같이 나오는 이유는 로컬 컴퓨터에서 접속 하였기 때문이다.
		
		out.println("uri : " + uri + "<br>");
		out.println("url : " + url + "<br>");
		out.println("contentPath : " + contentPath + "<br>");
		out.println("remoteAddr : " + remoteAddr + "<br>");
		
		out.println("</body>");
		out.println("</html>");
	}


}
