package com.xworkz.train.servlet;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.train.dto.TrainDto;
import com.xworkz.train.service.TrainService;
import com.xworkz.train.service.TrainserviceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/send")
public class TrainServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String phone = req.getParameter("number");
		String address = req.getParameter("addr");
		String email = req.getParameter("email");

		TrainDto dto = new TrainDto(name, age, phone, address, email);
		TrainserviceImpl serve = new TrainserviceImpl();
		
		

		boolean saved = serve.save(dto);
		if(saved) {
			System.out.println("valid and saved into db");
			req.setAttribute("success", "Saved into DataBase");
		}
		else {
			System.out.println("not valid and not saved into db");
			req.setAttribute("failure", "Not Saved into DataBase");
		}
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(req, resp);
	

	}
}
