package com.kimjy9698.text.text01;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/form2")
public class form2Controller extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// 검색어를 입력받고 주어진 리스트에서 검색된 내용 출력
		String keyword = request.getParameter("keyword");
		
		List<String> list = new ArrayList<>(Arrays.asList(
					"강남역 최고 맛집 소개합니다.",
					"오늘 기분 좋은 일이 있엇네요.",
					"역시 맛집 데이트가 제일 좋네요.",
					"집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
					"자축 저는 오늘 생일 이에요."));
		out.println("<html> <head><title>검색결과</title></head><body>");
		
		for(String sentence: list) {
			// 문자열 안에 keyword가 포함되어 있는지 여부
			if(sentence.contains(keyword)) {
				// 강남역 최고 맛집 소개 합니다.
				// 강남역 최고 <b>맛집</b> 소개 합니다
				sentence.replace(keyword, "<b>" + keyword + "</b>");
				out.println(sentence);
				out.println("<hr>");
			}
		}
		out.println("</body></html>");
	}
}
