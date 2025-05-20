package com.Andy.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test07")
public class Test07GetMethodAndform1 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String address = request.getParameter("address");
		String card = request.getParameter("card");
		String price = request.getParameter("price");

		int priceInfo = Integer.parseInt(price);

		out.println("" + "<html>\n" + "<head><title>주문</title></head>\n" + "<body>\n");

		if (!address.contains("서울시")) {
			out.println("<h3>주문 불가 지역입니다.</h3>");
		} else if (card.equals("신한카드")) {
			out.println("<h3>결제 불가 카드 입니다.</h3>");
		} else {
			out.println("" + "<h3>" + address + "로 배달 준비중" + "</h3>\n" + "<hr>\n" + "<h5>" + "결제금액 : " + priceInfo + "원"
					+ "</h5>\n");
		}

		out.println("" + " </body>\n" + "</html>\n");

	}
}

//out.println(""				
//+ "				<h3>주문 : " + address + "</h3>\n");		
//out.println(""
//	+ "				<h3>결제카드 : " + card + "</h3>\n");		
//out.println(""
//	+ "				<h3>가격 : " + priceInfo + "</h3>\n");
