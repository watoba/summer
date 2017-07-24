package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Nakai_CheckBox")
public class Nakai_CheckBox extends HttpServlet {

    public Nakai_CheckBox() {
        super();
    }

	public  void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

			req.setCharacterEncoding("UTF-8");
			//名前,選択したものを取得
			String username = req.getParameter("name");
			String hobbies[] = req.getParameterValues("hobby");

			//転送するインスタンスをcustomerという名
			req.setAttribute("username", username);
			req.setAttribute("hobbies", hobbies);
			RequestDispatcher dispatcher = req.getRequestDispatcher("nakai_result.jsp");

			dispatcher.forward(req, res);
	}

}
