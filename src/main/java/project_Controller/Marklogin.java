package project_Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import project_dao.Markdao;
import project_dto.Markdto;
@WebServlet("/login")
public class Marklogin extends HttpServlet  {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
	
		String reg=req.getParameter("Register_number");
		int rm=Integer.parseInt(reg);
		String dob=req.getParameter("Date_of_birth");
		
	Markdao markdao=new Markdao();
	Markdto markdto=markdao.login(rm);
	 resp.getWriter().print(markdto );
	 
	 
	Markdto  studentResult= markdao.login(rm);
		
		if(studentResult != null)
		{
			if(dob.equals(studentResult.getDate_of_birth()))
			{
				req.setAttribute("Result", studentResult);
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("fetchbyid.jsp");
				requestDispatcher.forward(req, resp);
			}
			else
				resp.getWriter().print(" date of birth is wrong");
		}
		else
			resp.getWriter().print(" register number is wrong");
//	
	
		
	}
	
	}


