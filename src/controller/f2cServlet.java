package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TempEquiv;

/**
 * Servlet implementation class f2cServlet
 */
@WebServlet("/f2cServlet")
public class f2cServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public f2cServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String degreesF = request.getParameter("degreesF");
		TempEquiv f2c = new TempEquiv(Integer.parseInt(degreesF));
		
		request.setAttribute("equiv", f2c);
		getServletContext().getRequestDispatcher("/f2cResult.jsp").forward(request, response);
		
	}

}
