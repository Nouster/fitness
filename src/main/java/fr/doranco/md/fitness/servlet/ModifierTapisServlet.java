package fr.doranco.md.fitness.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.doranco.md.fitness.business.Tapis;
import fr.doranco.md.fitness.services.TapisService;
import fr.doranco.md.fitness.services.impl.TapisServiceImpl;

/**
 * Servlet implementation class ModifierTapisServlet
 */
@WebServlet("/ModifierTapisServlet")
public class ModifierTapisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TapisService tapisService = new TapisServiceImpl();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierTapisServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("WEB-INF/EditTapis.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Tapis tapis = new Tapis();
		tapis.setId(Long.parseLong(request.getParameter("id")));
		tapis.setName(request.getParameter("NOM_TAPIS"));
		tapisService.modifierTapis(tapis);
		response.sendRedirect("index");
	}

}
