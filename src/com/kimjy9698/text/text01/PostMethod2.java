package com.kimjy9698.text.text01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/post2")
public class PostMethod2 extends HttpServlet {
	
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "hagulu");
	        put("password", "asdf");
	        put("name", "김인규");
	    }
	};
	
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// 아이디와 패스워드를 입력받아서
		// 일치여부 확인
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		out.println("<html><head><title>로그인확인</title></head><body>");
		// id가 일치하지않는경우
		if(id.equals(userMap.get("id"))) {
			out.println("<h1>id가 일치하지않습니다!!</h1>");
		} else if(!password.equals(userMap.get("password"))) { // password 일치하지 않는 경우
			out.println("<h1>password가 일치하지 않습니다!! </h1>");
		} else {
			out.println("<h1>" + userMap.get("name") + "님 환영합니다. </h1>");
		}
		
		
		out.println("</body></html>");
	}
}
