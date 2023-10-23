package com.idm.servlet;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	
	@WebServlet("/test.html")
	public class MyServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
	

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			Enumeration<String> headerNames = request.getHeaderNames();
			 Map<String, String> headersMap = new HashMap<>();
			while (headerNames.hasMoreElements()) {
				String headerName = headerNames.nextElement();
				response.getWriter().append("RISPOSTA:" + request.getHeader(headerName) + "\n");
				headersMap.put(headerName, request.getHeader(headerName));
			}
			
			request.setAttribute("headers", headersMap);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/test.jsp");
		    dispatcher.forward(request, response);
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			
		

			doGet(request, response);
		}

	}

