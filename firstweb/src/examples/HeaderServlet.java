package examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HeaderServlet
 */
@WebServlet("/header")
public class HeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HeaderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");	// 응답 보내기 전에 contentType을 알려주어야 한다.
		PrintWriter out = response.getWriter();	// client와의 연결통로를 가져온다.
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");

		// 모든 header의 이름을 가져와서 문자열 Enumeration 객체로 반환해준다.
		Enumeration<String> headerNames = request.getHeaderNames();	// getHeaderNames() : 모든 header의 이름을 가져온다.
		while(headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();	// header의 이름 알아내기
			String headerValue = request.getHeader(headerName);	// header의 값 알아내기
			out.println(headerName + " : " + headerValue + " <br> ");
		}		
		
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
