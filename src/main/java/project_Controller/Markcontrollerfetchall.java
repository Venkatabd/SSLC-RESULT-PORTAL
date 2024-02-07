package project_Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import project_dao.Markdao;
import project_dto.Markdto;

@WebServlet("/fetchall")
public class Markcontrollerfetchall extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);

		Markdao markdao = new Markdao();
		List<Markdto> markdto = (List<Markdto>) markdao.fetchall();

		req.setAttribute("Marklist", markdto);

		RequestDispatcher dispatcher = req.getRequestDispatcher("fetchall.jsp");
		dispatcher.forward(req, resp);

	}

}
