package ftmk.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;

import ftmk.exception.JSONException;
import ftmk.model.Professor;
import ftmk.ws.consumer.ProfessorFacade;

/**
 * Servlet implementation class SearchTeacherServlet
 */
@WebServlet("/searchTeacherServlet")
public class SearchTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchTeacherServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
//
		String queryName = request.getParameter("surname");
		
		

		ProfessorFacade professorFacade = new ProfessorFacade();
//
//		try {
//			ProfessorFacade facade = new ProfessorFacade();
//			List<Professor> professors = facade.getNamelistBySurname(queryName);
//			
//			request.setAttribute("query", queryName);
////			request.setAttribute("flag", flag);
//			
//			// Forward to validation result
//			RequestDispatcher dispatcher = request.getRequestDispatcher("validationResult.jsp");
//			dispatcher.forward(request, response);
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}