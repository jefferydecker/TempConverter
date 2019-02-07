package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TempEquiv;

/**
 * Servlet implementation class c2fServlet
 */
@WebServlet("/c2fServlet")
public class c2fServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public c2fServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String degreesC = request.getParameter("degreesC");
		TempEquiv c2f = new TempEquiv(0,Integer.parseInt(degreesC));
		
		request.setAttribute("equiv", c2f);
		getServletContext().getRequestDispatcher("/c2fResult.jsp").forward(request, response);

	}

}
