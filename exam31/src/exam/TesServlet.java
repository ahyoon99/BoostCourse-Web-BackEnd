package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TesServlet
 */
@WebServlet("/ten")	// 어노테이션 변경으로 url 주소를 바꿀 수 있다.
public class TesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 클라이언트가 요청할 때 서버는 요청을 받아내는 객체와 응답을 하기 위한 객체 2개를 자동으로 만들어낸다.
		// request : 요청에 대한 부분
		// response : 응답에 대한 부분
		
		// 브라우저가 응답을 받았을 때 이미지인지, 동영상인지 등을 알아내야 한다. 
		// 그래서 브라우저에게 무엇인지 알려줘야 하는데 이러한 역할을 하는 method가 setContentType()이다.
		// 즉, 나는 응답을 이걸로 보낼 거야~ 라고 약속하는 것이다.
		response.setContentType("text/html;charset=utf-8");	// 브라우저에게 html을 보낼 것이라고 알려주는 것이다.	
		
		// 진짜 보낼 내용을 넣어주어야 하는데, 보낼 내용을 아무 곳에 막 넣는게 아니라 보낼 내용을 넣어줄 통로를 하나 얻어내야 한다.
		// response의 getWriter() 메소드는 PrintWriter 객체를 리턴해준다.
		// 즉, 보낼 통로를 마련해주는 것이다.
		PrintWriter out = response.getWriter();
		
		// out이라는 통로에 출력해주면 된다.
		out.print("<h1>1부터 10까지 출력합니다.<h1>");
		for(int i = 1; i<=10; i++) {
			out.print(i+"<br>");
		}
		
		// out객체 다 사용한 후, close를 해주어야 한다.
		out.close();
	}

}
