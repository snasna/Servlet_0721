package com.kimjy9698.text.text01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/json")
public class jsonController extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		// 두개의 수를 전달 받아서
		// 더하기 빼기 곱하기 나누기 연산을 한다.
		// 그결과를json으로 response에 작성한다.
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		int add = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		
		
		out.println("{\"addtion\":\" + add + ", \"subtraction\":" + sub + ", \"multiplication\":" + mul +  "\", \"division\":" + div + "}");
		
		
		
		
		
		
		
		
	}
	
}
