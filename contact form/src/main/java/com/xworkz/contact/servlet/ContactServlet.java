package com.xworkz.contact.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.contact.dto.ContactDTO;
import com.xworkz.contact.service.ContactServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/send")
public class ContactServlet extends HttpServlet {
	
	
		
		public ContactServlet() {
			System.out.println("No-Args constructor of ContactServlet");
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String name= req.getParameter("name");
			String mobno=req.getParameter("mobno");
			String email=req.getParameter("email");
			String age=req.getParameter("age");
			
			
			
			
			int convertedAge= Integer.valueOf(age);
			
			ContactDTO contactDTO= new ContactDTO(name,mobno , email, convertedAge);
			
			ContactServiceImpl impl= new ContactServiceImpl();
			boolean check=impl.save(contactDTO);
			
			if(check) {
				System.out.println("valid and saved into db");
				req.setAttribute("success", "Saved into DataBase");
			}
			else {
				System.out.println("not valid and not saved into db");
				req.setAttribute("failure", "Not Saved into DataBase");
			}
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("contact.jsp");
			requestDispatcher.forward(req, resp);
			
		}

}
