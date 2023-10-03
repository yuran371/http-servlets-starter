package com.yuran.http.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.Map;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String paramValue = req.getParameter("param");
	Map<String, String[]> parameterMap = req.getParameterMap();
	System.out.println();
	
	resp.setContentType("text/html; charset=UTF-8");
	resp.setHeader("token", "12345");
	
//	resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
	try (PrintWriter writer = resp.getWriter()) {
		writer.write("<h1>Привет с певрого сервлета!</h2>");
	}
}
	
	@Override
	public void destroy() {
		super.destroy();
	}
}
