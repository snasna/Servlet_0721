package com.kimjy9698.text.text01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/text03")
public class URLmapping3Controller extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateTimestring =	formatter.format(now);
		
		out.println("<html> <head> <title>기사</title><head> <body> <h1>[단독]고양이가 야옹해</h1>");
		out.println("기사 입력시간 : " + dateTimestring);
		out.println("<hr> 끝 </body> </html>");
		
		
	}

}
