package ftmk.servlet;

import java.io.IOException;
import java.util.ArrayList;
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
 * Servlet implementation class TeacherNamelistServlet
 */
@WebServlet("/teacherNamelistServlet")
public class TeacherNamelistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherNamelistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		

//		// Get data from JSP form
//		String queryName = request.getParameter("surname");
//		
//		
//		try {
//			
//			List<Professor> professors = new ArrayList<Professor>();
//
//			
//			// Validate query name
//			ProfessorFacade facade = new ProfessorFacade();
//			boolean flag = facade.validateProfesstor(queryName);
//			
////			professors = facade.getNamelistBySurname(queryName);
//			
//			request.setAttribute("query", queryName);
//			request.setAttribute("flag", flag);
//			
////			request.setAttribute("query", queryName);
////			request.setAttribute("flag", flag);
//			
//			// Forward to validation result
//			RequestDispatcher dispatcher = request.getRequestDispatcher("searchProfessorNamelistResult.jsp");
//			dispatcher.forward(request, response);
//			
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.getMessage();
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}