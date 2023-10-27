package fr.doranco.md.fitness.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.doranco.md.fitness.services.TapisService;
import fr.doranco.md.fitness.services.impl.TapisServiceImpl;

/**
 * Servlet implementation class CreateTapisServlet
 */
@WebServlet("/CreateTapisServlet")
public class CreateTapisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TapisService tapisService = new TapisServiceImpl();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateTapisServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("WEB-INF/CreateTapis.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		tapisService.ajouterTapis(request.getParameter("NOM_TAPIS"));
		doGet(request, response);
		
	}

}
