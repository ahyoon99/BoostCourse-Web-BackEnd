package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifecycleServlet
 */
@WebServlet("/LifecycleServlet")
public class LifecycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifecycleServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("LifecycleServlet 생성!!");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init 호출!!");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy 호출!!");
	}

	@Override	// HttpServlet의 doGet(request, response) 메소드 오버라이딩
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");
		
		// 2) action에 있는 주소로 요청해줘요. 3) 요청이 들어갈 때 method는 post라는 값으로 넣어주세요.
		out.println("<form method='post' action='/firstweb/LifecycleServlet'>");	
		out.println("name : <input type='text' name='name'><br>");
		
		// 1) 'submit'버튼이 눌렸을 때   
		out.println("<input type='submit' value='ok'><br>");                                              
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	@Override	// HttpServlet의 doPost(request, response) 메소드 오버라이딩
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// 1) request는 요청결과이다. 2) getParameter : parameter가 'name'으로 들어있는 값을 꺼내서  3) String name에 저장해준다.
		String name = request.getParameter("name");
		out.println("<h1> hello " + name + "</h1>");
		out.close();
	}

	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		System.out.println("service 호출!!");
//	}

}
