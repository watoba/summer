package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InfoTest1
 */
@WebServlet("/InfoTest1")
public class InfoTest1 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException{
		req.setCharacterEncoding("UTF-8");

		String fir = req.getParameter("fir");
		String sec = req.getParameter("sec");
		String radio = req.getParameter("radio");


		int x = Integer.parseInt(fir);
		int y = Integer.parseInt(sec);
		int result=0;

		if(radio.equals("+")){
			result = x + y;
		}else if(radio.equals("-")){
			result = x - y;
		}else if(radio.equals("*")){
			result = x * y;
		}else if(radio.equals("/")){
			result = x / y;
		}
		req.setAttribute("fir",fir);
		req.setAttribute("sec",sec);
		req.setAttribute("radio",radio);
		req.setAttribute("result",result);

		RequestDispatcher dispatcher = req.getRequestDispatcher("calcresult1.jsp");

		dispatcher.forward(req, res);
	}
}