package fr.doranco.md.fitness.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.doranco.md.fitness.business.Tapis;
import fr.doranco.md.fitness.services.TapisService;
import fr.doranco.md.fitness.services.impl.TapisServiceImpl;

/**
 * Servlet implementation class Index
 */
@WebServlet(urlPatterns = { "/", "/index" })
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TapisService tapisService = new TapisServiceImpl();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		List<Tapis> tapisArray = new ArrayList<>();
		tapisArray = tapisService.recupererTousLesTapis();
        request.setAttribute("tapisArray", tapisArray);
		request.getRequestDispatcher("WEB-INF/Index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
