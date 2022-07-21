package com.kimjy9698.text.text01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/form1")
public class formController1 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		int price = Integer.parseInt(request.getParameter("price"));
		
		out.println("<html><head><title>주문</title></head><body>");
		
		if(!address.contains("서울시")) {
			out.println("<h1>배달 불가 지역입니다</h1>");
		}else if (card.contains("신한카드")) {
			out.println("<h1>결제 불가 카드 입니다.</h1>");
		} else {
			out.println("<h3>" + address + " 배달 준비중</h3> <hr>");
			out.println("결제금액 : " + price + "원");
		}
		out.println("</body></html>");
		
		
		
	}

}