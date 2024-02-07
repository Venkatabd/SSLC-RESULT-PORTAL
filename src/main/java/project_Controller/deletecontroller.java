package project_Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project_dao.Markdao;
@WebServlet("/delete")
public class deletecontroller extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		String s1=req.getParameter("Register_number");
		int rn=Integer.parseInt(s1);
		
		Markdao markdao=new Markdao();
		markdao.delete(rn);
	}

}
