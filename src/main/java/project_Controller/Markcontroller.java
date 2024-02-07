package project_Controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project_dao.Markdao;
import project_dto.Markdto;

@WebServlet("/details")
public class Markcontroller extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String s1 = req.getParameter("Register_number");
		int rn = Integer.parseInt(s1);
		String sn = req.getParameter("Student_name");
		String dob = req.getParameter("Date_of_birth");
		String fn = req.getParameter("Father_name");
		String mn = req.getParameter("Mother_name");
		String ta = req.getParameter("Tamil");
		int t = Integer.parseInt(ta);
		String eng = req.getParameter("English");
		int en = Integer.parseInt(eng);
		String ma = req.getParameter("Maths");
		int m = Integer.parseInt(ma);
		String sci = req.getParameter("Science");
		int sc = Integer.parseInt(sci);
		String soc = req.getParameter("Social_science");
		int so = Integer.parseInt(soc);

		int totalmarks = (t + en + m + sc + so);
		double percentage = (totalmarks * 100) / 500;

		Markdto dto = new Markdto();
		dto.setRegister_number(rn);
		dto.setStudent_name(sn);
		dto.setDate_of_birth(dob);
		dto.setFather_name(fn);
		dto.setMother_name(mn);
		dto.setTamil(t);
		dto.setEnglish(en);
		dto.setMaths(m);
		dto.setScience(sc);
		dto.setSocial_science(so);
		dto.setPercentage(percentage);
		dto.setTotal_marks(totalmarks);

		Markdao markdao = new Markdao();
		markdao.create(dto);

	}

}
