package project_Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project_dao.Markdao;
@WebServlet("/update")
public class updatecontroller extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
	
		
		String s1=req.getParameter("Register_number");
		int rn=Integer.parseInt(s1); 
		String sn=req.getParameter("Student_name");
		String dob=req.getParameter("Date_of_birth");
		String fn=req.getParameter("Father_name");
		String mn=req.getParameter("Mother_name");
		         String ta=req.getParameter("Tamil");
		         int t=Integer.parseInt(ta);
		         String eng=req.getParameter("English");
		         int en=Integer.parseInt(eng);
		         String ma=req.getParameter("Maths");
		         int m=Integer.parseInt(ma);
		         String sci=req.getParameter("Science");
		         int sc=Integer.parseInt(sci);
		         String soc=req.getParameter("Social_science");
		         int so=Integer.parseInt(soc);
		         
		         
		         Markdao markdao=new Markdao();
		         markdao.update(rn,sn,dob,fn,mn,t,en,m,sc,so);
	}

}
