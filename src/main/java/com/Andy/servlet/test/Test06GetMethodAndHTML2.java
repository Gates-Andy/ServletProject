package com.Andy.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test06")

public class Test06GetMethodAndHTML2 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		String number1String = request.getParameter("number1"); // request는 문자열을 기본으로
		String number2String = request.getParameter("number2");
		
		int number1 = Integer.parseInt(number1String);
		int number2 = Integer.parseInt(number2String);
		
		int plus = number1 + number2;
		int minus = number1 - number2;
		int multiply = number1 * number2;
		int divide = number1 / number2;
		
		// {"addition":135,"subtraction":105,"multiplication":1800,"division":8}
		// out.println("\"addition\":135,\"subtraction\":105,\"multiplication\":1800,\"division\":8");
		out.println("{\"addition\":" + plus + ",\"subtraction\":" + minus + ",\"multiplication\":" + multiply + ",\"division\":" + divide + "}");
		
//		String number1 = request.getParameter("number1");
//		String number2 = request.getParameter("number2");
//		
//		int firstNumber = Integer.parseInt(number1);
//		int secondNumber = Integer.parseInt(number2);
//		
//		int addition = firstNumber + secondNumber;
//		int subtraction = firstNumber - secondNumber;
//		int multiplication = firstNumber * secondNumber;
//		int division = firstNumber / secondNumber;
//		
//		out.println("{");
//        out.println("\"addition\": " + addition + ",");
//        out.println("\"subtraction\": " + subtraction + ",");
//        out.println("\"multiplication\": " + multiplication + ",");
//        out.println("\"division\": " + division);
//        out.println("}");
		
	}
}
