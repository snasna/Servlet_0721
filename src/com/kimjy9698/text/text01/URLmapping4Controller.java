package com.kimjy9698.text.text01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/text04")
public class URLmapping4Controller extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><herd><title>리스트</title><head><body>");
		out.println("<ul>");
		for(int i = 1; i <=30; i++) {
		out.println(i+"<li>번째 리스트 </li>");
		}
		out.println("</ul> </body> </html>");
		
	}
}
